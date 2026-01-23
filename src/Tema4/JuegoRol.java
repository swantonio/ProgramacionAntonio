package Tema4;

import java.util.Scanner;

public class JuegoRol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre del heroe: ");
        String nom = sc.nextLine();
        System.out.print("Salud: ");
        int vid = sc.nextInt();
        System.out.print("Ataque: ");
        int atq = sc.nextInt();
        System.out.print("Defensa: ");
        int def = sc.nextInt();

        Hero jugador = new Hero(nom, vid, atq, def);
        int hordas_superadas = 0;

        final double prob_huida = 0.10;
        final double prob_descanso = 0.001;
        final double prob_pocion = 0.10;

        while (jugador.getHealth() > 0) {
            int num_enemigos = (int)(Math.random() * 3) + 1;
            Hero[] horda = new Hero[num_enemigos];
            int vivos = num_enemigos;

            for (int i = 0; i < num_enemigos; i++) {
                int s_rand = (int)(Math.random() * 20) + 15;
                int a_rand = (int)(Math.random() * 5) + 5;
                horda[i] = new Hero("Enemigo " + (i + 1), s_rand, a_rand, 2);
            }

            while (jugador.getHealth() > 0 && vivos > 0) {
                for (int i = 0; i < horda.length; i++) {
                    if (horda[i].getHealth() > 0 && Math.random() < prob_huida) {
                        horda[i].receiveDamage(9999);
                        vivos = vivos - 1;
                        System.out.println("Un enemigo ha huido");
                    }
                }
                boolean objetivo_encontrado = false;
                for (int i = 0; i < horda.length && !objetivo_encontrado; i++) {
                    if (horda[i].getHealth() > 0) {
                        jugador.attack(horda[i]);
                        objetivo_encontrado = true;
                        if (horda[i].getHealth() <= 0) {
                            vivos = vivos - 1;
                        }
                    }
                }
                for (int i = 0; i < horda.length; i++) {
                    if (horda[i].getHealth() > 0 && jugador.getHealth() > 0) {
                        horda[i].attack(jugador);
                    }
                }
            }
            if (jugador.getHealth() > 0) {
                hordas_superadas = hordas_superadas + 1;
                System.out.println("Horda " + hordas_superadas + " superada. vida actual: " + jugador.getHealth());

                if (Math.random() < prob_descanso) {
                    jugador.rest();
                }
                if (Math.random() < prob_pocion) {
                    jugador.drinkPotion();
                }
            }
        }
        System.out.println("Fin del juego. Hordas sobrevividas: " + hordas_superadas);
    }
}