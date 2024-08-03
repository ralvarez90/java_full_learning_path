package tools;

import java.util.Scanner;

public class Console {

    public static String readLine(String prompt) {
        System.out.print(prompt);
        return readLine();
    }

    public static String readLine() {
        return new Scanner(System.in).nextLine();
    }

    public static void systemPause() {
        readLine("\nPress any key to continue . . . ");
    }

    public static void printSeparator(int length) {
        System.out.println("-".repeat(length));
    }

    public static int toInt(String strNum) {
        return Integer.parseInt(strNum);
    }

    public static double toDouble(String strNum) {
        return Double.parseDouble(strNum);
    }

    public static void print() {
        System.out.println();
    }

    public static void print(String msg) {
        System.out.println(msg);
    }

    public static void print(String msg, boolean withNewLine) {
        if (withNewLine) {
            print(msg);
            return;
        }

        System.out.print(msg);
    }

    public static void print(Number number) {
        System.out.println(number);
    }
}
