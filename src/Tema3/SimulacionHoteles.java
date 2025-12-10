package Tema3;

import java.util.Scanner;
import java.util.Arrays;
public class SimulacionHoteles {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            int[] hotel = new int[20];

            System.out.print("Elige la habitación donde instalar el router (1-20): ");
            int habitacion = sc.nextInt() - 1;

            System.out.print("Elige la potencia del router (1-6): ");
            int potencia = sc.nextInt();

            hotel[habitacion] = potencia;

            int senal = potencia;
            for (int i = habitacion - 1; i >= 0; i--) {
                senal--;
                if (senal <= 0) break;
                hotel[i] = senal;
            }

            senal = potencia;
            for (int i = habitacion + 1; i < hotel.length; i++) {
                senal--;
                if (senal <= 0) break;
                hotel[i] = senal;
            }

            System.out.println("\nCobertura resultante:");
            System.out.println(Arrays.toString(hotel));
        }
    }

