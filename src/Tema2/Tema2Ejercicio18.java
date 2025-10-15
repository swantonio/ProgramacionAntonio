package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio18 {
    public static void main(String[] args) {
        double numero = 0;
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("Introduce un número positivo para calcular su raíz cuadrada:");
            numero = in.nextDouble();

            if (numero <=0){
                System.out.println("Numero invalido, Introduce uno correcto");
            }
        } while (numero <= 0);
            double raiz = Math.sqrt(numero);
            System.out.printf("La raíz cuadrada de %.2f es %.2f%n", numero, raiz);
            in.close();
    }
}


