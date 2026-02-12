package Tema5.ActividadesExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        double[] array = new double[5];
        Scanner in = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
        try {
                System.out.println("Introduce numero para la posicion " + i + " del array");
                array[i] = in.nextDouble();
                i++;
        }
        catch (InputMismatchException ex) {
            System.out.println("Valor introducido incorrecto. Intentalo de nuevo");
            in.nextLine();
        }
    }
        System.out.println("Vector completo: " + java.util.Arrays.toString(array));
}
}
