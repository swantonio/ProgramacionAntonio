package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio14 {
    public static void main(String[] args) {
        int personas = 0;
        int noches = 0;
        final int tarifaestandar = 15;
        double preciototal = 0;

        Scanner in = new Scanner(System.in);
        while (personas <= 0) {
            System.out.println("Introduce el numero de personas:");
            personas = in.nextInt();
            if (personas <= 0) {
                System.out.println("Introduce un numero valido");
            }
        }
        while (noches <= 0) {
            System.out.println("Introduce el numero de noches");
            noches = in.nextInt();
            if (noches <= 0) {
                System.out.println("Introduce un numero valido");
            }
        }

        preciototal = personas * noches * tarifaestandar;

        if (personas > 5 && noches >= 7) {
            System.out.println("El precio total con descuento por ser mas de 5 personas y estar almenos una semana es de " +
                    (preciototal * 0.75) +"€");
        } else {
            System.out.println("El precio total sera de " + preciototal + "€");
        }
    }
}
