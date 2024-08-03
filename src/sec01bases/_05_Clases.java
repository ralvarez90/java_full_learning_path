package sec01bases;

import tools.Console;

/**
 * CLASES
 * <p>
 * Permiten crear modelos a partir de las cuales generaremos objetos.
 * Almacenan propiedades y métodos.
 * <p>
 * Las clases tienen un modificador de acceso y un nombre. Puede extender
 * de otras y/o implementar interfaces.
 * <p>
 * La clase general a partir de la cual se extienden las demás clases es
 * Object.
 * <p>
 * Podemos decir que todos los objetos son un Object. Además, tenemos clases
 * que envuelven a los primitivos, esto ya que existen métodos que solo
 * funcionan con objetos y no con primitivos.
 */
public class _05_Clases {
    public static void main(String[] args) {

        // entero largo
        Long maxLongValue = Long.MAX_VALUE;
        System.out.println(maxLongValue);

        // end application
        Console.systemPause();
    }
}
