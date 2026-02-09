package Tema5.ActividadesColecciones2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int total = 0;
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Introduce el primer valor");
            num1 = in.nextInt();
            System.out.println("Introduce el segundo valor");
            num2 = in.nextInt();
            total = num1/num2;
        }
        catch (InputMismatchException ex) {
            System.out.println("Valor introducido incorrecto");
        }
        catch (ArithmeticException ex) {
            System.out.println("Valor introducido incorrecto, no se puede dividir por 0");
        }
        finally {
            System.out.println(total);
        }
    }
}
