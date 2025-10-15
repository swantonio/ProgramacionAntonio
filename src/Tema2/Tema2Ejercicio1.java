package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio1 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el lado");
        double lado= in.nextInt();
        System.out.println("El perimetro es " + lado * 4);
        System.out.println("La superficie es " + lado * lado);
    }
}
