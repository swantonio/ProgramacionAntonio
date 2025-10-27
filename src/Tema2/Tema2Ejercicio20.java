package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio20 {
    public static void main(String[] args) {
        int numeroA = 0;
        int numeroB = 0;
        int cont = 0;
        Scanner in = new Scanner(System.in);

        System.out.println("Indica el numero de A");
        numeroA = in.nextInt();

        System.out.println("Indica el numero de B");
        numeroB = in.nextInt();
cont=numeroA;
        do {
            if (cont % 2 != 0) {
                System.out.println(cont);
            }
            cont++;
        } while (cont <= numeroB);
        if (numeroB < numeroA) {
            System.out.println("El numero B es menor que A por lo tanto no muestro nada");
        }
    }
}







