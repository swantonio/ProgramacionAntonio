package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio16 {
    public static void main(String[] args) {
        double cantidad = 0;
        final double multiploaDolares = 1.16;
        final double multiploEuros = 0.86;
        double convertidoADolares = 0;
        double convertidoAEuros = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce cantidad");
        cantidad = in.nextDouble();
        System.out.println("Introduce D si quieres convertir a dolares y E si quieres a euros");
        char dolaroeuro = in.next().charAt(0);
        while (dolaroeuro != 'E' && dolaroeuro != 'D') {
            System.out.println("Esa entrada es invalida, introduce D o E");
            dolaroeuro =in.next().charAt(0);

        }
            if (dolaroeuro == 'D') {
                convertidoADolares = cantidad * multiploaDolares;
                System.out.println("La cantidad convertida a dolares es de: " + convertidoADolares);
            } else if (dolaroeuro == 'E') {
                convertidoAEuros = cantidad * multiploEuros;
                System.out.println("La cantidad convertida a euros es de: " + convertidoAEuros);
            }
    }
}