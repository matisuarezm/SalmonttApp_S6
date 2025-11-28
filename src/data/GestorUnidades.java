package data;

import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class GestorUnidades {

    //Cargas manuales de objetos para UnidadesOperativas (Centros y Plantas de cultivo)
    public List<UnidadOperativa> pruebasManuales(){

        List<UnidadOperativa> unidades = new ArrayList<>();

        unidades.add(new CentroCultivo("C0100","centro","Salmontt Coquimbo","Coquimbo",60.0));
        unidades.add(new CentroCultivo("C0200","centro","Salmontt Valdivia","Valdivia",80.0));
        unidades.add(new CentroCultivo("C0300","centro","Salmontt Coyhaique","Coyhaique",50.0));

        unidades.add(new PlantaProceso("P1001","planta","Salmontt La Calera","La Calera",120.00));
        unidades.add(new PlantaProceso("P2001","planta","Salmontt Los Vilos","Los Vilos",30.50));
        unidades.add(new PlantaProceso("P3001","planta","Salmontt Concepción","Concepción",250.00));

        return unidades;
    }

    //Cargamos el archivo desde un txt y recibimos el nombre del archivo, siempre que este dentro de la carpeta resources
    public List<UnidadOperativa> cargaDesdeTxt (String nombreArchivo){

        //Creamos ArrayList de objetos de la clase UnidadesOperativas para guardar los datos del archivo.
        List<UnidadOperativa> registroUnidades = new ArrayList<>();

        //Busqueda de recursos dentro del classpath
        //ClassLoader -> objeto que sabe buscar clases y recursos en el classpath
        //classpath -> es el conjunto de lugares donde Java mira para encontrar clases y recursos cuando corre tu programa.
        ClassLoader classLoader = getClass().getClassLoader();

        try {
            //Utiliza el archivo entregado que busca dentro de la carpeta resources
            //InputStream -> crea un objeto que sabe leer ese archivo como un flujo de bytes y te lo devuelve en la variable lecturaArchivo (tipo InputStream).
            InputStream lecturaArchivo = classLoader.getResourceAsStream(nombreArchivo);

            //Si archivo TXT no se encuentra arrojamos mensaje
            if (lecturaArchivo == null){
                System.out.println("No se encontró el archivo " + nombreArchivo);
                return registroUnidades;
            }

            //Abrimos el archivo con BufferReader
            //InputStreamReader -> convierte los bytes del InputStream en caracteres usando una codificación (UTF-8, etc.).
            //BufferedReader -> te da métodos como readLine() para leer línea a línea.
            try (BufferedReader br = new BufferedReader(new InputStreamReader(lecturaArchivo))){

                String lineaArchivo;
                int numeroLinea = 0;

                while ((lineaArchivo = br.readLine()) != null){
                    numeroLinea++;

                    if (lineaArchivo.trim().isEmpty()){
                        continue;
                    }

                    //La fila leida con BufferReader la separamos por ; y la guardamos en un arreglo
                    String [] fila = lineaArchivo.split(";");

                    //Verificamos que el largo del arreglo contenga la cantidad de información requerida
                    if (fila.length != 5){
                        System.out.println("La Linea " + numeroLinea + " no tiene el formato esperado o es invalida");
                        continue;
                    }

                    //signamos los datos del archivo según corresponde a su atributo
                    String id = fila[0].trim();
                    String tipo = fila[1].trim();
                    String nombre = fila[2].trim();
                    String comuna = fila[3].trim();
                    String cantidadStr = fila[4].trim();

                    //Depende del tipo: Planta o Centro, creamos el objeto correspondiente
                    try {
                        double cantidad = Double.parseDouble(cantidadStr);
                        if (tipo.equalsIgnoreCase("centro")){
                            registroUnidades.add(new CentroCultivo(id,tipo,nombre,comuna,cantidad));

                        }else if (tipo.equalsIgnoreCase("planta")){
                            registroUnidades.add(new PlantaProceso(id,tipo,nombre,comuna,cantidad));
                        }else {
                            System.out.println("Tipo desconocido en la linea " + numeroLinea + ": " + tipo);
                        }

                    }catch (NumberFormatException exception){
                        //Mensaje en caso de error al convertir el dato de las toneladas
                        System.out.println("La cantidad de la linea " + lineaArchivo + " no corresponden a un número");
                    }
                }
            }
        }catch (Exception ex){
            System.out.println("Ocurrio un error en la lectura del archivo");
        }
        return registroUnidades;
    }
}
