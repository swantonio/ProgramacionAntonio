package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio29 {
    public static void main(String[] args) {
        Random random = new Random();
        int numrandom = random.nextInt(100);
        int numerousuario = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Intenta adivinar el numero");
        numerousuario = in.nextInt();

        while (numerousuario != numrandom) {
            if (numerousuario < numrandom) {
                System.out.println("El numero random es mas grande " +
                        "introduce otro");
            } else {
                System.out.println("El numero random es mas pequeño " +
                        "introduce otro");
            }
            numerousuario = in.nextInt();
        }
        System.out.println("Acertaste el numero secreto es " + numerousuario);
        in.close();
    }
}

