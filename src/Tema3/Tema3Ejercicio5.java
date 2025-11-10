package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio5 {
    static void multiplicacion(int num){
        System.out.println("Tabla del numero " + num);
        for (int i = 1; i <= 10; i++){
            System.out.println(i + " * " + num + " es " + (i*num));
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1-10 para saber su tabla de multiplicar: ");
        int num = in.nextInt();
        while (num < 1 || num > 10) {
            System.out.println("Error introduce un numero valido");
            num = in.nextInt();
        }
        multiplicacion(num);
    }
}
