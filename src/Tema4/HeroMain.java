package Tema4;

import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== CONFIGURACIÓN DEL HÉROE 1 ===");
        System.out.print("Introduce el nombre de tu heroe: ");
        String n1 = entrada.nextLine();
        System.out.print("Introduce su salud inicial (ej. 100): ");
        int s1 = entrada.nextInt();
        System.out.print("Introduce sus puntos de ataque (ej. 20): ");
        int a1 = entrada.nextInt();
        System.out.print("Introduce sus puntos de defensa (ej. 5): ");
        int d1 = entrada.nextInt();
        entrada.nextLine();

        Hero h1 = new Hero(n1, s1, a1, d1);

        System.out.println("\n=== CONFIGURACIÓN DEL HÉROE 2 (ENEMIGO) ===");
        System.out.print("Introduce el nombre del oponente: ");
        String n2 = entrada.nextLine();
        System.out.print("Introduce su salud inicial: ");
        int s2 = entrada.nextInt();
        System.out.print("Introduce su ataque: ");
        int a2 = entrada.nextInt();
        System.out.print("Introduce su defensa: ");
        int d2 = entrada.nextInt();

        Hero h2 = new Hero(n2, s2, a2, d2);

        System.out.println("\n¡EL COMBATE COMIENZA AHORA!");
        System.out.println("Estado inicial:");
        System.out.println(h1.toString());
        System.out.println(h2.toString());
        System.out.println("--------------------------------------------------");

        while (h1.getHealth() > 0 && h2.getHealth() > 0) {
            System.out.println("\nTurno de " + h1.getName() + ":");
            h1.attack(h2);
            if (h2.getHealth() > 0) {
                System.out.println("Turno de " + h2.getName() + ":");
                h2.attack(h1);
            }
            if (h1.getHealth() > 0 && h1.getHealth() < 20) {
                System.out.println("¡Alerta! " + h1.getName() + " tiene poca vida. Usa una pocion.");
                h1.drinkPotion();
            }
            if (h2.getHealth() > 0 && h2.getHealth() < 20) {
                System.out.println("¡Alerta! " + h2.getName() + " tiene poca vida. Usa una pocion.");
                h2.drinkPotion();
            }

            System.out.println("Resumen: " + h1.getName() + " (" + h1.getHealth() + " HP) vs " + h2.getName() + " (" + h2.getHealth() + " HP)");
        }


        System.out.println("\n==================================================");
        System.out.println("¡EL COMBATE HA TERMINADO!");

        if (h1.getHealth() > 0) {
            System.out.println("El ganador es: " + h1.getName());
            System.out.println("Tomando un descanso para recuperar energias...");
            h1.rest();
            System.out.println("Estado final del campeon: " + h1.toString());
        } else {
            System.out.println("El ganador es: " + h2.getName());
            System.out.println("Tomando un descanso para recuperar energias...");
            h2.rest();
            System.out.println("Estado final del campeon: " + h2.toString());
        }
        System.out.println("==================================================");
    }
}