package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio9 {
    public static void triangulo(char caracter, int lineasTriangulo) {
       for (int i =1 ; i <= lineasTriangulo; i++) {
           for (int j = 1; j <= (lineasTriangulo - i); j++) {
               System.out.print(" ");
           }
           for (int k = 1; k <= (2 * i - 1); k++) {
               System.out.print(caracter);
           }
           System.out.println();
    }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce el caracter");
        char caracter = in.next().charAt(0);
        System.out.println("Introduce el numero de lineas del triangulo");
        int lineasTriangulo = in.nextInt();
        triangulo(caracter, lineasTriangulo);
    }
    }

