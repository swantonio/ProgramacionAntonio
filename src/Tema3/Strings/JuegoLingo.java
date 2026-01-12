package Tema3.Strings;

import java.util.Scanner;

public class JuegoLingo {
    private static final int LONGITUD_PALABRA = 5;
    private static final int INTENTOS_MAXIMOS = 5;
    private static final char CORRECTO_POSICION = '*';
    private static final char INCLUIDA_SOLO = '-';
    private static final char NO_INCLUIDA = ' ';

    private static String generarPista(String intento, String oculta) {
        StringBuilder pista = new StringBuilder(String.valueOf(NO_INCLUIDA).repeat(LONGITUD_PALABRA));
        boolean[] ocultaUsada = new boolean[LONGITUD_PALABRA];
        for (int i = 0; i < LONGITUD_PALABRA; i++) {
            if (intento.charAt(i) == oculta.charAt(i)) {
                pista.setCharAt(i, CORRECTO_POSICION);
                ocultaUsada[i] = true;
            }
        }
        for (int i = 0; i < LONGITUD_PALABRA; i++) {
            if (pista.charAt(i) != CORRECTO_POSICION) {
                for (int j = 0; j < LONGITUD_PALABRA; j++) {
                    if (intento.charAt(i) == oculta.charAt(j) && !ocultaUsada[j]) {
                        pista.setCharAt(i, INCLUIDA_SOLO);
                        ocultaUsada[j] = true;
                        break;
                    }
                }
            }
        }
        return pista.toString();
    }
    public static void jugar() {
        Scanner scanner = new Scanner(System.in);
        String palabraOculta = "HUESO";

        System.out.println("¡Bienvenido al Lingo!");
        System.out.println("Debes adivinar una palabra de " + LONGITUD_PALABRA + " letras en " + INTENTOS_MAXIMOS + " intentos.");
        System.out.println(String.format("Pista: %c = Correcto, %c = Incluida pero mal colocada, ' ' = No incluida.", CORRECTO_POSICION, INCLUIDA_SOLO));
        System.out.println("-------------------------------------------------------");
        int intentos = 0;
        boolean adivinado = false;
        while (intentos < INTENTOS_MAXIMOS && !adivinado) {
            System.out.printf("Intento %d/%d: ", intentos + 1, INTENTOS_MAXIMOS);
            String intento = scanner.nextLine().trim().toUpperCase();

            if (intento.length() != LONGITUD_PALABRA || !intento.matches("[A-Z]+")) {
                System.out.println("Error: Debes introducir una palabra de " + LONGITUD_PALABRA + " letras.");
                continue;
            }

            if (intento.equals(palabraOculta)) {
                adivinado = true;
            } else {
                String pista = generarPista(intento, palabraOculta);
                System.out.println("Pista: " + pista);
            }

            intentos++;
        }
        System.out.println("-------------------------------------------------------");
        if (adivinado) {
            System.out.println("¡Congratulations! Has adivinado la palabra '" + palabraOculta + "' en " + intentos + " intentos.");
        } else {
            System.out.println("Game Over. La palabra secreta era: " + palabraOculta);
        }
    }
    public static void main(String[] args) {
        jugar();
    }
}
