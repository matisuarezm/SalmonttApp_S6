package cl.salmontt.util;

public class ValidaFormatoRut {

    /**
     * Metodo que valida el formato del RUT ingresado es correcto
     * @param formatoRut es la cadena de texto a validar (ingreso del RUT)
     * @throws ValidaRutException si el RUT no cumple con el formato indicado
     */
    public static void validar(String formatoRut) throws ValidaRutException{
        String formato = "^[0-9]+-[0-9Kk]$";
        if(!formatoRut.matches(formato)){
            throw new ValidaRutException("Por favor revisa el formato e intenta nuevamente. Ejemplo: 87654321-9 o K");
        }
    }


}
