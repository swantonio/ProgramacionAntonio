package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio1 {
    public static int numberSign (int num) {
        if (num == 0) {
            return 0;
        } else if (num >= 1) {
            return 1;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        System.out.println("Introduce un numero");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int resultado = numberSign (num);
        if (resultado == 0) {
            System.out.println("El numero es 0");
        } else if (resultado == 1) {
            System.out.println("El numero es positivo");
        }  else {
            System.out.println("El numero es negativo");
        }
    }

    public static class MyArray {
        public static void main(String[] args) {

        }

    }
}
