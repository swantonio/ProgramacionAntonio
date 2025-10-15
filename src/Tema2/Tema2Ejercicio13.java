package Tema2;

import java.util.Scanner;


public class Tema2Ejercicio13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int hora = 0;
        int minutos = 0;
        int segundos = 0;
        boolean horaCorrecta = false;

        while (!horaCorrecta) {
            System.out.println("Introduce la hora:");
            hora = in.nextInt();
            System.out.println("Introduce los minutos:");
            minutos = in.nextInt();
            System.out.println("Introduce los segundos:");
            segundos = in.nextInt();

            if (hora < 0 || hora > 23 || minutos < 0 || minutos > 59 || segundos < 0 || segundos > 59) {
                System.out.println("Introduce valores válidos");

            } else {
                horaCorrecta = true;
            }

        }

        String textohoras = String.format("%02d", hora);
        String textominutos = String.format("%02d", minutos);
        String textosegundos = String.format("%02d", segundos);


        System.out.printf("La hora actual es: %s:%s:%s%n", textohoras, textominutos, textosegundos);
        segundos++;

        if (segundos == 60) {
            segundos = 0;
            minutos++;
        }
        if (minutos == 60) {
            minutos = 0;
            hora++;
        }
        if (hora == 24) {
            hora = 00;
        }

        textohoras = String.format("%02d", hora);
        textominutos = String.format("%02d", minutos);
        textosegundos = String.format("%02d", segundos);
        System.out.printf("La hora aumentada es: %s:%s:%s%n", textohoras, textominutos, textosegundos);
    }
}

