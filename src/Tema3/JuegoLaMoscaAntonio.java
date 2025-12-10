package Tema3;

import java.util.Random;
import java.util.Scanner;

public class JuegoLaMoscaAntonio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int mosca = rand.nextInt(15);

        System.out.println("🐝 ¡Bienvenido al juego ATRAPA A LA MOSCA!");
        System.out.println("El tablero tiene 15 posiciones (del 1 al 15).");
        System.out.println("Intenta atrapar a la mosca.\n");

        boolean atrapada = false;
        while (!atrapada) {

            System.out.print("Elige una posición (1-15): ");
            int jugador = sc.nextInt() - 1;
            if (jugador < 0 || jugador > 14) {
                System.out.println("⚠ Posición inválida. Intenta de nuevo.");
                continue;
            }

            if (jugador == mosca) {
                System.out.println("🎉 ¡Has atrapado a la mosca! 🐝");
                atrapada = true;
            }


            else if (Math.abs(jugador - mosca) == 1) {
                System.out.println("😲 ¡Casi! La mosca estaba al lado y ha escapado...");
                mosca = rand.nextInt(15);  // Nueva posición aleatoria
            }
            else {
                System.out.println("❌ No hay mosca cerca. Sigue buscando...");
            }
        }
        System.out.println("Fin del juego.");
    }
}