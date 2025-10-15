package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio22 {
    public static void main(String[] args) {
        int num = 0;
        int cifras = 0;
        int division =0;
        Scanner in =  new Scanner(System.in);
        System.out.println("Indica el numero");
        num = in.nextInt();


        while ((num /10) < 0){
            cifras = cifras + 1;
        }

        System.out.println("El numero " + num + " tiene un total de " + cifras);
    }
}
