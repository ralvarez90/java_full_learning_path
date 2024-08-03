package sec01bases;

import static tools.Console.*;

/**
 * OPERADORES
 * <p>
 * Existen prácticamente los mismos que otros lenguajes de programación como
 * son los:
 * 1. Aritméticos
 * Son los mismos que otros lenguajes.
 * <p>
 * 2. Unarios
 * Solo requieren un operando y tenemos -, +, ++, -- y el de negación.
 * <p>
 * 3. Asignación
 * Tenemos el =, +=, -=, *=, %=, etc.
 * <p>
 * 4. Relacionales
 * Tenemos el >, >=, <, ...
 * <p>
 * 5. Lógicos
 * Existe el &&, || y la negación
 * <p>
 * 6. Ternario
 * Permite simplificar un if-else en una sola sentencia.
 * <p>
 * 7. Bitwise
 * Se emplean para manipular los bits de enteros de forma directa,
 * tenemos el and, or, xor, complement
 * <p>
 * 8. Shift
 * Permite desplazar un número de lugares de bits a la derecha o
 * a la izquierda.
 * <p>
 * 9. Operador instanceOf
 * Devuelve un booleano determinando si un objeto es instancia o no
 * de una clase específica.
 */
public class _06_Operadores {
    public static void main(String[] args) {

        // estructura de condicional
        System.out.println("condition ? if-true :  if-false");
        String welcome = toInt(readLine("Edad: ")) >= 18 ? "Bienvenido" : "Bye!";
        System.out.println(welcome);

        // new line
        print();

        // ejemplo de bitwise
        int d = 0b1010;
        int e = 0b1100;
        print("  d & e -> " + (d & e));
        print("  d | e -> " + (d | e));
        print("  d ^ e -> " + (d ^ e));
        print("     ~d -> " + (~d));
        print("d  << 2 -> " + (d << 2));
        print("e  >> 1 -> " + (e >> 1));
        print("e >>> 1 -> " + (e >>> 2));

        // newline
        print();

        // instanceof
        print("Sintaxis: ", false);
        print("object instance of class/subclass/interface");

        class Person {
        }

        interface MyInterface {
        }
        class Boy extends Person implements MyInterface {
        }

        Person p1 = new Person();
        Person p2 = new Boy();
        print("p1 instanceof _Person: " + (p1 instanceof Person));
        print("p2 instanceof _Person: " + (p2 instanceof Boy));
        print("p2 instanceof _MyInterface: " + (p2 instanceof MyInterface));

        // end message
        systemPause();
    }
}
