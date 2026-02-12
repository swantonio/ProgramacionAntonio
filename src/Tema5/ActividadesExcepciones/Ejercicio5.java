package Tema5.ActividadesExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio5 {

    public static void imprimePositivo(int p) throws Exception {
        if (p < 0) {
            throw new Exception("Error: El número es negativo");
        }
        System.out.println("Valor positivo: " + p);
    }

    public static void imprimeNegativo(int n) throws Exception {
        if (n >= 0) {
            throw new Exception("Error: El número es positivo");
        }
        System.out.println("Valor negativo: " + n);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;

        do {
            try {
                System.out.println("Introduce un número (999 para salir):");
                num = in.nextInt();

                if (num != 999) {
                    System.out.println("Imprimiendo positivo");
                    imprimePositivo(num);

                    System.out.println("Imprimiendo negativo:");
                    imprimeNegativo(num);
                }
            } catch (InputMismatchException ex) {
                System.err.println("Valor introducido incorrecto");
                in.nextLine();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (num != 999);
    }
}