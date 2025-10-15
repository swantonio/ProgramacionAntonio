package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio6 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double numero = in.nextDouble();

        if (numero == 0) {
            System.out.println("El numero es 0");
        } else {
            if (numero > 0) {
                System.out.println("El numero es positivo");
            }
            if (numero < 0) {
                System.out.println("El numero es negativo");
            }
        }
    }
}
