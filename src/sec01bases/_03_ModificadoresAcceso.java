package sec01bases;

/**
 * MODIFICADORES DE ACCESO
 * <p>
 * Existen cuatro modificadores de acceso que son: private, default, protected y public.
 * Estos permiten modificar el alcance de variables, propiedades y objetos dentro de
 * una solución java.
 */
public class _03_ModificadoresAcceso {

    // constante privada, accesible únicamente dentro de sta clase
    private static final String WELCOME_MESSAGE = "Welcome to Java";

    // entry point
    public static void main(String[] args) {
        System.out.println(WELCOME_MESSAGE);
    }
}
