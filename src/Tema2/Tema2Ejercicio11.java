package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio11 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int numero1 = in.nextInt();
        System.out.println("Introduce el segundo numero");
        int numero2 = in.nextInt();
        System.out.println("Introduce el tercer numero");
        int numero3 = in.nextInt();

        if (Math.abs(numero1 - numero2) == 1 && Math.abs(numero2 - numero3) == 1){
            System.out.println("Los numeros son consecutivos");
        } else {
            System.out.println("Los numeros no son consecutivos");
        }
    }
}
