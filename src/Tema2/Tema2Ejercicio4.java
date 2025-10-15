package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio4 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int num1 = in.nextInt();

        System.out.println("Introduce el segundo numero");
        int num2 = in.nextInt();

        System.out.println("Introduce el tercer numero");
        int num3 = in.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("El numero uno es el mayor");
        } else {
            if (num2 > num1 && num2 > num3) {
                System.out.println("El numero dos es el mayor");
            }
            if (num3 > num1 && num3 > num2) {
                System.out.println("El numero tres es el mayor");
            } else {
                System.out.println("Error");
            }
        }
    }
}
