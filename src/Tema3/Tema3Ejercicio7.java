package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio7 {
    public static int primo (int numero) {
        if (numero <= 1) {
            return 0;
        }
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numeros para saber si son primos, pon 0 para acabar");
        int numero = in.nextInt();
        while (numero != 0) {
            if (numero < 0){
                System.out.println("Error introduce un numero positivo");
            }
            if (primo(numero) ==1){
                System.out.println("El numero es primo");
            } else {
                System.out.println("El numero no es primo");
            }
            System.out.println("Introduce otro número (0 para salir):");
            numero = in.nextInt();
        }
    }
}
