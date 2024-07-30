package tools;

import java.util.Scanner;

public class Console {

    public static String input(String message) {
        System.out.print(message);
        return (new Scanner(System.in)).nextLine();
    }

    public static String input() {
        return new Scanner(System.in).nextLine();
    }

    public static void systemPause() {
        input("\nPress any key to continue . . . ");
    }
}
