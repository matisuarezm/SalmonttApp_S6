package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int opcionMenu = 0;

        GestorUnidades gestor = new GestorUnidades();

        List<UnidadOperativa> unidades = gestor.pruebasManuales();
        List<UnidadOperativa> unidadesTxt = gestor.cargaDesdeTxt("PlantasYCentrosCultivo.txt");

        do {
            System.out.println("====--->>> SALMONTT APP <<<---====");
            System.out.println("1.- Pruebas Manuales");
            System.out.println("2.- Pruebas de Archivo Plano");
            System.out.println("9.- Salir");
            System.out.print("\nSeleccione una opción del Menú: ");

            try {
                opcionMenu = input.nextInt();
                input.nextLine();

                switch (opcionMenu){
                    case 1:
                        for (UnidadOperativa uni : unidades){
                            System.out.println(uni.toString() + "\n-----------------------------\n");
                        }
                        break;
                    case 2:
                        for (UnidadOperativa unitxt : unidadesTxt){
                            System.out.println(unitxt + "\n---------------------\n");
                        }
                        break;
                    case 9:
                        salirSistema();
                        break;
                    default:
                        System.out.println("Opción ingresada invalida, Intente nuevamente");
                }

                if (opcionMenu >= 1 && opcionMenu <= 2) {
                    while(true) {
                        System.out.print("¿Desea hace alguna otra operación? S/N: ");
                        String letra = input.nextLine().trim().toUpperCase();
                        if (letra.equals("S") ) {
                            break;
                        }else if (letra.equals("N")) {
                            opcionMenu = 9;
                            salirSistema();
                            break;
                        }else{
                            System.out.println("Error. Ingrese la letra correspondiente S ó N");
                        }
                    }
                }
            }catch(InputMismatchException e){
                System.out.println("Error.. Entrada inválida, Por favor ingrese un numero");
                input.nextLine();
                opcionMenu = 0;
            }
        }while (opcionMenu != 9);
        input.close();
    }

    public static void salirSistema(){
        System.out.println("Usted esta saliendo del sistema");
        for (int i = 0; i < 3; i++) {
            try {
                Thread.sleep(800);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(".");
        }
        System.out.println("\nGracias por usar el programa.!!!");
    }
}