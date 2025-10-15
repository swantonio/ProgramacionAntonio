package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio8 {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la cantidad de euros");
        double euros = in.nextDouble();
        double dolar = 1.17;
        System.out.println("La cantidad de euros en dolares es " + euros * dolar);
    }
}
