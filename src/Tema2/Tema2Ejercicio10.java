package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio10 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = in.nextInt();
        System.out.println("Introduce el tercer numero");
        int numero3 = in.nextInt();

        if (numero1 < numero2 && numero2 < numero3) {
            System.out.println("Estan ordenados");
        } else {
            System.out.println("No estan ordenados");
        }
    }
}