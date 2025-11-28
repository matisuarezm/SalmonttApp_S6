package ui;

import data.GestorUnidades;
import model.UnidadOperativa;

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
            System.out.println(":::::::: Salmont App ::::::::");
            System.out.println("1.- Leer unidades pruebas manuales");
            System.out.println("2.- Leer unidades desde un txt");
            System.out.println("5.- Salir");

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
                case 5:
                    System.out.println("Saliendo, gracias por usar el programa");
                    break;
                default:
                    System.out.println("Opción ingresada invalida, Intente nuevamente");
                    input.nextLine();
            }

            if (opcionMenu !=5) {
                System.out.println("Desea hace alguna otra operación? S/N");
                String letra = input.nextLine().trim();
                if (letra.equalsIgnoreCase("N")){
                    opcionMenu = 5;
                    System.out.println("Saliendo, gracias por usar el programa");
                }
            }


        }while (opcionMenu != 5);
        input.close();
    }
}