package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio4 {
    public static double euro2dollar (double dinero) {
        return dinero * 1.16;
    }
    public static double dollar2euro (double dinero) {
        return dinero * 0.86;
    }
    public static void showMenu() {
        System.out.println("Pon 1 si quieres pasar de euros a dolares");
        System.out.println("Pon 2 si quieres pasar de dolares a euros");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        showMenu();
        int opcion = in.nextInt();
        while (opcion != 1 && opcion != 2) {
            System.out.println("Error: opción no válida. Debes elegir 1 o 2.");
            showMenu();
            opcion = in.nextInt();
        }
        System.out.println("Introduce el dinero que quieres pasar");
        double dinero = in.nextDouble();
        if (opcion == 1) {
            System.out.println("El dinero cambiado es : " + euro2dollar(dinero));
        } else {
            System.out.println("El dinero cambiado es : " + dollar2euro(dinero));
        }
    }
}
