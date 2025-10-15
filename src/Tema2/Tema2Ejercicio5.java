package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        double num1 = in.nextInt();

        System.out.println("Introduce el segundo numero");
        double num2 = in.nextInt();

        System.out.println("Introduce el tercer numero");
        double num3 = in.nextInt();

        double media = (num1 + num2 + num3) / 3;
        int media2 = (int) ((num1 + num2 + num3) / 3);
        System.out.println("La media con decimales es " + media);
        System.out.println("La media sin decimales es " + media2);
    }
}