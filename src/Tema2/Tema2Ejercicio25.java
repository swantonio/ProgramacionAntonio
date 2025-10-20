package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio25 {
    public static void main(String[] args) {
        double numero = 0;
        int factorial = 1;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduce el numero del que quieres calcular el factorial");
        numero = in.nextDouble();
        while (numero < 0) {
            System.out.println("Error el factorial no se puede hacer con negativos " +
                    "introduce otro numero");
            numero = in.nextDouble();
        }
        while (numero % 1 != 0){
            System.out.println("Error introduce un numero entero positivo");
            numero = in.nextDouble();
        }

        int numEntero = (int) numero;

        for (int i = 1 ; i <= numEntero ; i ++){
            factorial = factorial * i;
        }

        in.close();
        System.out.println("El resultado del factorial es: " + factorial);
    }
}
