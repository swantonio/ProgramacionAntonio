package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio2 {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce la base");
        double base = in.nextDouble();
        System.out.println("Introduce la altura");
        double altura = in.nextDouble();
        double superficie = base * altura;
        double perimetro = base * 2 + altura * 2;
        System.out.println("La superficie es " + superficie);
        System.out.println("EL perimetro es " + perimetro);
    }
}
