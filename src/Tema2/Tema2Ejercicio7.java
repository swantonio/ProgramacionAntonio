package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double numero1 = in.nextDouble();
        System.out.println("Introduce el segundo numero");
        double numero2 = in.nextDouble();

        if (numero1 > numero2) {
            System.out.println("El primer numero es mas grande o igual al segundo, la resta da " + (numero1 - numero2));
        } else {
            System.out.println("El segundo numero es mas grande o igual al primero, la resta da " + (numero2 - numero1));
        }
    }
}
