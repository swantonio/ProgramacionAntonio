package PracticaProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        int velocidad1 = 0;
        int velocidad2 = 0;
        int ataque1 = 0;
        int ataque2 = 0;
        int defensa1 = 0;
        int defensa2 = 0;
        int puntosdevida1 = 0;
        int puntosdevida2 = 0;
        int totalatributos1 = 0;
        int totalatributos2 = 0;
        int restovida1 = 0;
        int restovida2 = 0;
        int danoturno = 0;
        int ronda = 1;
        Scanner in = new Scanner(System.in);
        System.out.println("Ingrese los atributos del primer jugador, deben tener entre 1 y 200");
        do {
            System.out.println("Ingrese el numero de velocidad: ");
            velocidad1 = in.nextInt();
            while (velocidad1 <= 0 || velocidad1 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                velocidad1 = in.nextInt();
            }
            System.out.println("Ingrese el numero de ataque: ");
            ataque1 = in.nextInt();
            while (ataque1 <= 0 || ataque1 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                ataque1 = in.nextInt();
            }
            System.out.println("Ingrese el numero de defensa: ");
            defensa1 = in.nextInt();
            while (defensa1 <= 0 || defensa1 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                defensa1 = in.nextInt();
            }
            System.out.println("Ingrese el numero de puntos de vida: ");
            puntosdevida1 = in.nextInt();
            while (puntosdevida1 <= 0 || puntosdevida1 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                puntosdevida1 = in.nextInt();
            }
            totalatributos1 = velocidad1 + ataque1 + defensa1 + puntosdevida1;
            if (totalatributos1 > 500) {
                System.out.println("El numero total es mas de 500, vuelve a introducir los atributos");
            }
        } while (totalatributos1 > 500);
        System.out.println("Ahora ingrese los atributos del segundo jugador, deben tener entre 1 y 200");
        do {
            System.out.println("Ingrese el numero de velocidad: ");
            velocidad2 = in.nextInt();
            while (velocidad2 <= 0 || velocidad2 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                ;
                velocidad2 = in.nextInt();
            }
            System.out.println("Ingrese el numero de ataque: ");
            ataque2 = in.nextInt();
            while (ataque2 <= 0 || ataque2 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                ataque2 = in.nextInt();
            }
            System.out.println("Ingrese el numero de defensa: ");
            defensa2 = in.nextInt();
            while (defensa2 <= 0 || defensa2 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                defensa2 = in.nextInt();
            }
            System.out.println("Ingrese el numero de puntos de vida: ");
            puntosdevida2 = in.nextInt();
            while (puntosdevida2 <= 0 || puntosdevida2 > 200) {
                System.out.println("Introduce un numero dentro del rango");
                puntosdevida2 = in.nextInt();
            }

            totalatributos2 = velocidad2 + ataque2 + defensa2 + puntosdevida2;

            if (totalatributos2 > 500) {
                System.out.println("El numero total es mas de 500, vuelve a introducir los atributos");
            }
        } while (totalatributos2 > 500);

        restovida1 = puntosdevida1;
        restovida2 = puntosdevida2;

        if (velocidad1 > velocidad2) {
            System.out.println("El primer jugador es mas rapido, atacara primero");
        } else if (velocidad1 < velocidad2) {
            System.out.println("El segundo jugador es mas rapido, atacara primero");
        } else if (velocidad1 == velocidad2) {
            System.out.println("Los dos jugadores tienen la misma velocidad se lanza moneda");
            Random velocidadrandom = new Random();
            int moneda = velocidadrandom.nextInt(2);
            if (moneda == 0) {
                velocidad1++;
                System.out.println("Ha salido cara empieza el jugador uno");
            } else {
                velocidad2++;
                System.out.println("Ha salido cruz empieza el jugador dos");
            }
        }

        Random ataquerandom = new Random();
        int probcritico = 20;
        while (restovida1 > 0 && restovida2 > 0) {
            System.out.println("\nRONDA " + ronda);
            ronda++;

            if (velocidad1 > velocidad2) {
                danoturno = Math.max(1, (ataque1 - defensa2) + ataquerandom.nextInt(10) + 1);
                int dadoCritico = ataquerandom.nextInt(100) + 1;
                if (dadoCritico <= probcritico) {
                    System.out.println("CRITICO!!! Jugador 1 hace daño X2");
                    danoturno *= 2;
                }
                System.out.println("Jugador 1 ataca, daño hecho a jugador 2 = " + danoturno);
                restovida2 = Math.max(0, restovida2 - danoturno);

                if (restovida2 > 0) {
                    danoturno = Math.max(1, (ataque2 - defensa1) + ataquerandom.nextInt(10) + 1);
                    dadoCritico = ataquerandom.nextInt(100) + 1;
                    if (dadoCritico <= probcritico) {
                        System.out.println("CRITICO!!! Jugador 2 hace daño X2");
                        danoturno *= 2;
                    }
                    System.out.println("Jugador 2 ataca, daño hecho a jugador 1 = " + danoturno);
                    restovida1 = Math.max(0, restovida1 - danoturno);
                }

            } else {
                danoturno = Math.max(1, (ataque2 - defensa1) + ataquerandom.nextInt(10) + 1);
                int dadoCritico = ataquerandom.nextInt(100) + 1;
                if (dadoCritico <= probcritico) {
                    System.out.println("CRITICO!!! Jugador 2 hace daño X2");
                    danoturno *= 2;
                }
                System.out.println("Jugador 2 ataca, daño hecho a jugador 1 = " + danoturno);
                restovida1 = Math.max(0, restovida1 - danoturno);

                if (restovida1 > 0) {
                    danoturno = Math.max(1, (ataque1 - defensa2) + ataquerandom.nextInt(10) + 1);
                    dadoCritico = ataquerandom.nextInt(100) + 1;
                    if (dadoCritico <= probcritico) {
                        System.out.println("CRITICO!!! Jugador 1 hace daño X2");
                        danoturno *= 2;
                    }
                    System.out.println("Jugador 1 ataca, daño hecho a jugador 2 = " + danoturno);
                    restovida2 = Math.max(0, restovida2 - danoturno);
                }
            }


            int barra1 = restovida1 * 20 / 200;
            int barra2 = restovida2 * 20 / 200;
            String vidaGrafica1 = "█".repeat(barra1) + "-".repeat(20 - barra1);
            String vidaGrafica2 = "█".repeat(barra2) + "-".repeat(20 - barra2);
            System.out.println("Jugador 1: " + restovida1 + " " + vidaGrafica1);
            System.out.println("Jugador 2: " + restovida2 + " " + vidaGrafica2);
        }


        System.out.println("\n==========================");
        System.out.println("🏁  COMBATE FINALIZADO");
        System.out.println("==========================");
        if (restovida1 <= 0) {
            System.out.println("🏆 ¡Jugador 2 gana!");
        } else {
            System.out.println("🏆 ¡Jugador 1 gana!");
        }
    }
}

