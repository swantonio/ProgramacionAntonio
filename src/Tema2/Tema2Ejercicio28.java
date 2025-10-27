package Tema2;

import java.util.Random;
import java.util.Scanner;

public class Tema2Ejercicio28 {
    public static void main(String[] args) {
            int numerousuario = 0;
            Random random = new Random();
            int randomInt = random.nextInt(99999);
            Scanner in = new Scanner(System.in);
            boolean acertado=false;
        System.out.println("Tienes 5 intentos para adivinar el número.");
        for (int i = 0; i < 5 ; i++){
            numerousuario = in.nextInt();
            if (numerousuario == randomInt){
                System.out.println("ACERTASTEEEEE");
                acertado = true;
            } else{
                System.out.println("No acertaste :(, Introduce otro");
            }
        }

        System.out.printf("El numero era: %05d%n", randomInt);
    }
}
