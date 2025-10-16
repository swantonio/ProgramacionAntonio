package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio23 {
    public static void main(String[] args) {

        double numero = 0;
        int contador = 0;
        double total = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce numero");
        numero = in.nextDouble();

        while (numero % 1 != 0) {
            System.out.println("Error introduce un numero entero");
            numero = in.nextDouble();
        }

        while (numero >= 0) {
                if (numero % 1 == 0 && numero > 0) {
                    total += numero;
                    contador++;
                }
                System.out.println("Introduce mas numeros");
                numero = in.nextDouble();

            while (numero % 1 != 0) {
                System.out.println("Error introduce un número entero.");
                numero = in.nextDouble();
            }
        }
            System.out.println("Ya hay un numero negativo asi que se acaba el bucle");
            if (contador > 0) {
                System.out.println("La media total es de " + (total / contador));
            } else {
                System.out.println("No se introdujeron números positivos.");
            }
            in.close();
        }
    }



