package sec01bases;


import tools.Console;

/**
 * SINTAXIS
 * <p>
 * Java es un lenguaje orientado a objetos, lo que quiere decir que
 * en la ejecución de un programa tendremos diferentes objetos
 * interactuando entre sí.
 * <p>
 * 1. Clases
 * Es un modelo a partir del cual creamos objetos o instancias, estos
 * objetos tendrán el estado y comportamiento definido/implementado
 * en su respectiva clase.
 * <p>
 * 2. Objetos
 * Son instancias de las clases, son entidades con estado y comportamiento.
 * <p>
 * 3. Métodos
 * Son acciones que establecen el comportamiento de los objetos.
 * <p>
 * 4. Variables de instancia
 * Son variables declaradas dentro de las clases que permitirá que cada
 * instancia de dicha clase tendrá una copia de dichas variables, con
 * su estado propio.
 * <p>
 * 4. Método main
 * Cualquier programa en java tiene un entry point en una función
 * principal main. La clase principal es aquella que contenga
 * dicho método main.
 */
public class _02_Sintaxis {

    // método principal
    public static void main(String[] args) {

        // instancias de strings
        String msg1 = "Hello";
        String msg2 = "World";
        System.out.printf("%s %s!\n", msg1.toUpperCase(), msg2.toUpperCase());

        // end message
        Console.systemPause();
    }
}
