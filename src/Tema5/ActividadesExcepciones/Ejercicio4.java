package Tema5.ActividadesExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int posicion = 0;
        Scanner in = new Scanner(System.in);
        int n = (int) (Math.random() * 100) + 1;
        int[] array = new int[n];
        System.out.println("Tamaño del array = " + n);
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * 10) + 1;
            array[i] = num;
        }
        do {
            try {
                System.out.println("Que posicion del array quieres ver, pon un numero en negativo para salir");
                posicion = in.nextInt();
                if (posicion >= 0) {
                    System.out.println("Valor en la posición " + posicion + ": " + array[posicion]);
                }
            } catch (InputMismatchException ex) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.err.println("Error: La posición " + posicion + " está fuera del rango.");
            }
        } while (posicion >= 0) ;
    }
}
