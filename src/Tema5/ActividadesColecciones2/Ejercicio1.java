package Tema5.ActividadesColecciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce un numero entero");
        try {
            int num = in.nextInt();
            System.out.println("Valor introducido: " + num);
        } catch (InputMismatchException ex) {
            System.out.println("Valor introducido incorrecto");
        }
    }
}
