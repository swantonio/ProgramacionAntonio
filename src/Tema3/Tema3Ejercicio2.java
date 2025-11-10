package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;

public class Tema3Ejercicio2 {
    public static boolean isAdult(int edad) {
        if (edad >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int edad = (num);
        int resultado = numberSign(num);
        if (resultado == 0) {
            System.out.println("El numero es 0");
        } else if (resultado == 1) {
            System.out.println("El numero es positivo");
        } else {
            while (num < 0) {
                System.out.println("El numero no es valido, pon otro");
                num = in.nextInt();
            }
        }
        if (isAdult(resultado)) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }
    }
}
