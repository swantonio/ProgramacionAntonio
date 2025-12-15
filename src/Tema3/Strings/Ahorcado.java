package Tema3.Strings;

import java.util.Scanner;
import java.io.IOException;

public class Ahorcado {
    private static final int INTENTOS_MAXIMOS = 6;
    private static final char HUECO = '_';

    private static void dibujarAhorcado(int fallos) {
        System.out.println("   +---+");
        System.out.println("   |   |");
        System.out.println(fallos >= 1 ? "   O   |" : "       |");

        String cuerpo;
        if (fallos == 2) cuerpo = "   |   |";
        else if (fallos == 3) cuerpo = "  /|   |";
        else if (fallos >= 4) cuerpo = "  /|\\  |";
        else cuerpo = "       |";
        System.out.println(cuerpo);

        String piernas;
        if (fallos == 5) piernas = "  /    |";
        else if (fallos >= 6) piernas = "  / \\  |";
        else piernas = "       |";
        System.out.println(piernas);

        System.out.println("       |");
        System.out.println("  ====");
    }

    private static void limpiarConsola() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final IOException | InterruptedException e) {
            for (int i = 0; i < 50; ++i) System.out.println();
        }
    }

    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        String palabraSecreta;

        System.out.println("Jugador 1: Introduce la palabra secreta (solo letras):");
        palabraSecreta = scanner.nextLine().trim().toUpperCase();

        if (palabraSecreta.isEmpty() || !palabraSecreta.matches("[A-Z]+")) {
            System.out.println("Palabra no válida. El juego termina.");
            return;
        }

        limpiarConsola();

        StringBuilder palabraOculta = new StringBuilder();
        for (int i = 0; i < palabraSecreta.length(); i++) {
            palabraOculta.append(HUECO);
        }

        int fallos = 0;
        String letrasIntentadas = "";
        boolean resuelto = false;

        System.out.println("Jugador 2: ¡Comienza el juego del Ahorcado!");

        while (fallos < INTENTOS_MAXIMOS && !resuelto) {
            dibujarAhorcado(fallos);
            System.out.println("\nPalabra: " + palabraOculta.toString().replace("", " ").trim());
            System.out.println("Intentos fallidos restantes: " + (INTENTOS_MAXIMOS - fallos));
            System.out.println("Letras ya intentadas: " + letrasIntentadas);

            System.out.print("Introduce una letra o escribe 'RESOLVER' para intentar adivinar: ");
            String entrada = scanner.nextLine().trim().toUpperCase();

            if (entrada.isEmpty()) {
                continue;
            }

            if (entrada.equals("RESOLVER")) {
                System.out.print("¡Adivina la palabra completa!: ");
                String intentoPalabra = scanner.nextLine().trim().toUpperCase();
                if (intentoPalabra.equals(palabraSecreta)) {
                    resuelto = true;
                } else {
                    System.out.println("¡Incorrecto!");
                    fallos++;
                }
                continue;
            }

            char letra = entrada.charAt(0);

            if (!Character.isLetter(letra)) {
                System.out.println("Entrada no válida. Introduce una letra.");
                continue;
            }

            if (letrasIntentadas.indexOf(letra) != -1) {
                System.out.println("Ya has intentado la letra '" + letra + "'.");
                continue;
            }

            letrasIntentadas += letra;

            boolean acierto = false;
            for (int i = 0; i < palabraSecreta.length(); i++) {
                if (palabraSecreta.charAt(i) == letra) {
                    palabraOculta.setCharAt(i, letra);
                    acierto = true;
                }
            }

            if (acierto) {
                System.out.println("¡Bien hecho! La letra '" + letra + "' está en la palabra.");
            } else {
                System.out.println("¡Fallaste! La letra '" + letra + "' no está.");
                fallos++;
            }

            if (palabraOculta.indexOf(String.valueOf(HUECO)) == -1) {
                resuelto = true;
            }
        }

        dibujarAhorcado(fallos);
        System.out.println("\nLa palabra secreta era: " + palabraSecreta);

        if (resuelto) {
            System.out.println("¡Felicidades, has adivinado la palabra!");
        } else {
            System.out.println("¡Has sido ahorcado! Más suerte la próxima vez.");
        }
    }

    public static void main(String[] args) {
        jugar();
    }
}
