package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        double num = 0;
        int cifras = 0;
        double resto = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Indica el numero");
        num = in.nextDouble();
        //resto = num;

        while (num % 1 != 0) {
            System.out.println("Error introduce un numero entero");
            num = in.nextDouble();
            //resto = num;
        }

        //int restoentero = (int) resto;
        int restoentero = (int)num;
        int numeroentero = (int) num;

        while (restoentero > 0) {
                restoentero = restoentero / 10;
                cifras ++;
            }
            System.out.println("El numero " + numeroentero + " tiene un total de " + cifras);
        }
    }

