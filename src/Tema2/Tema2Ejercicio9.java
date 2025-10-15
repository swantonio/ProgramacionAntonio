package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio9 {
    public static void main(String [] args){

            Scanner in = new Scanner(System.in);
            System.out.println("Introduce la dolares de euros");
            double dolares = in.nextDouble();
            double euro = 0.86;
            System.out.println("La cantidad de dolares en euros es " + dolares * euro);
    }
}

