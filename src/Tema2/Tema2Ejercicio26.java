package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio26 {
    public static void main(String[] args) {
        int numero = 0;
        int contadordivisores = 0;
        Scanner in = new Scanner(System.in);


            System.out.print("Introduce un número entero positivo para comprobar si es primo: ");
            numero = in.nextInt();

            while (numero < 1) {
                System.out.println("Error: el número debe ser positivo, introduce otro");
                numero = in.nextInt();
            }


        if (numero == 1){
            System.out.println("El 1 no es primo");
        } else {
            int divisor = 2;
            while (divisor < numero){
                if (numero % divisor == 0){
                    contadordivisores++;
                }
                divisor++;
            }
        }

        if (contadordivisores == 0) {
            System.out.println("El número " + numero + " es primo.");
        } else {
            System.out.println("El número " + numero + " no es primo.");
        }
in.close();
        }
}
