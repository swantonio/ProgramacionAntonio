package Tema2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Tema2Ejercicio12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = in.nextInt();
        System.out.println("Introduce el tercer numero");
        int numero3  = in.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
         if (numero2 > numero3) {
            System.out.println("El orden es " +  numero1 + " " + numero2 + " " + numero3);
        } else {
            System.out.println("El orden es" + numero1 + " " + numero3 + " " + numero2);
        }
    } else if (numero2 > numero1 && numero2 > numero3) {
            if (numero1 > numero3) {
                System.out.println("El orden es " + numero2 + " " + numero1 + " " + numero3);
            } else {
                System.out.println("EL orden es" + numero2 + " " + numero3 + " " + numero1);
            }
        } else if (numero3 > numero1 && numero3 > numero2) {
            if (numero1 > numero2) {
                System.out.println("El orden es " + numero3 + " " +  numero1 + " " + numero2);
            } else {
                System.out.println("El orden es " + numero3  + " " + numero2 + " " + numero1);
            }
        }
    }
}
