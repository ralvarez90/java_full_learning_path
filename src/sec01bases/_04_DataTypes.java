package sec01bases;

import tools.Console;


/**
 * TIPOS DE DATOS
 * <p>
 * Java cuenta principalmente con dos tipos datos:
 * - primitivos
 * - referenciados
 * <p>
 * 1. Primitivos
 * Son tipos de datos básicos: byte, char, boolean, short, int, long
 * y float. Estos tiene un tamaño en memoria fija.
 * <p>
 * Los caracteres son almacenados en 2 bytes y se codifican bajo el
 * standard Unicode. De manera interna los caracteres se manejan como
 * enteros.
 * <p>
 * 2. Referenciados
 * Son tipos de datos complejos que se generan a partir de clases. La
 * sintaxis para declararlas son:
 * TipoClase nombreObjeto = new TipoClase();
 * <p>
 * Los String son tipos de datos referenciados, estos en general se
 * pueden crear usando el nombre de una clase y la palabra reservada new.
 */
public class _04_DataTypes {

    // entry point
    public static void main(String[] args) {

        // iteramos string
        String myName = "Rodrigo Álvarez";
        for (char c : myName.toCharArray()) {
            System.out.printf("Char %c is %d\n", c, (int) c);
        }

        // mostramos tipo de dato
        System.out.println(type(myName));

        // end application
        Console.systemPause();
    }

    private static String type(Object obj) {
        return obj.getClass().getSimpleName();
    }
}
