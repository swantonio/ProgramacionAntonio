package PracticaProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class Practica1 {
    public static void main(String[] args) {
        int velocidad1 = 0, velocidad2 = 0;
        int ataque1 = 0,  ataque2 = 0;
        int defensa1 = 0 , defensa2 = 0;
        int puntosdevida1 = 0 , puntosdevida2 = 0;
        int totalatributos1, totalatributos2;
        int danoturno;
        int ronda = 1;
        int probcritico = 20;
        int predeterminado1, predeterminado2;
        int maxDanio1, maxDanio2 ;
        String nombre1;
        String nombre2;
        Scanner in = new Scanner(System.in);

        System.out.println("\nEres el jugador 1, indica tu nombre y elige tu personaje:");
        System.out.println("Nombre :");
        nombre1 = in.next();
        System.out.println("1 - Tanque");
        System.out.println("Stats: " + "Velocidad = 80" + " Ataque = 80" + " Vida = 200" + " Defensa = 140");
        System.out.println("2 - Asesino");
        System.out.println("Stats: " + "Velocidad = 100" + " Ataque = 200" + " Vida = 100" + " Defensa = 100");
        System.out.println("3 - Mago");
        System.out.println("Stats: " + "Velocidad = 80" + " Ataque = 200" + " Vida = 80" + " Defensa = 40");
        System.out.println("4 - Personalizado");
        do {
            System.out.print("Introduce una opción (1-4): ");
            predeterminado1 = in.nextInt();
            if (predeterminado1 < 1 || predeterminado1 > 4) {
                System.out.println("Opción no válida, pon una de las opciones dichas");
            }
        } while (predeterminado1 < 1 || predeterminado1 > 4);

        switch (predeterminado1) {
            case 1: {
                velocidad1 = 80;
                ataque1 = 80;
                puntosdevida1 = 200;
                defensa1 = 140;
                break;
            }
            case 2: {
                velocidad1 = 100;
                ataque1 = 200;
                puntosdevida1 = 100;
                defensa1 = 100;
                break;
            }
            case 3: {
                velocidad1 = 80;
                ataque1 = 200;
                puntosdevida1 = 80;
                defensa1 = 40;
                break;
            }
            case 4: {
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
                break;
            }
            default: {
                break;
            }
        }
        System.out.println("\nEres el jugador 2, indica tu nombre y elige tu personaje:");
        System.out.println("Nombre :");
        nombre2 = in.next();
        System.out.println("1 - Tanque");
        System.out.println("Stats: " + "Velocidad = 80" + " Ataque = 80" + " Vida = 200" + " Defensa = 140");
        System.out.println("2 - Asesino");
        System.out.println("Stats: " + "Velocidad = 100" + " Ataque = 200" + " Vida = 100" + " Defensa = 100");
        System.out.println("3 - Mago");
        System.out.println("Stats: " + "Velocidad = 80" + " Ataque = 200" + " Vida = 80" + " Defensa = 40");
        System.out.println("4 - Personalizado");
        do {
            System.out.print("Introduce una opción (1-4): ");
            predeterminado2 = in.nextInt();
            if (predeterminado2 < 1 || predeterminado2 > 4) {
                System.out.println("Opción no válida, pon una de las opciones dichas");
            }
        } while (predeterminado2 < 1 || predeterminado2 > 4);

        switch (predeterminado2) {
            case 1: {
                velocidad2 = 80;
                ataque2 = 80;
                puntosdevida2 = 200;
                defensa2 = 140;
                break;
            }
            case 2: {
                velocidad2 = 100;
                ataque2 = 200;
                puntosdevida2 = 100;
                defensa2 = 100;
                break;
            }
            case 3: {
                velocidad2 = 80;
                ataque2 = 200;
                puntosdevida2 = 80;
                defensa2 = 40;
                break;
            }
            case 4: {
                System.out.println("Ingrese los atributos del segundo jugador, deben tener entre 1 y 200");
                do {
                    System.out.println("Ingrese el numero de velocidad: ");
                    velocidad2 = in.nextInt();
                    while (velocidad2 <= 0 || velocidad2 > 200) {
                        System.out.println("Introduce un numero dentro del rango");
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
                break;
            }
            default: {
                System.out.println("Error Introduce una opcion valida");
                break;
            }
        }

        System.out.println("Se comprueba quien es mas rapido para ver quien ataca primero");
        System.out.println(nombre1 + " tiene velocidad " + velocidad1 + ", " + nombre2 + " tiene velocidad " + velocidad2);

        if (velocidad1 > velocidad2) {
            System.out.println(nombre1 + " es mas rapido, atacara primero");
        } else if (velocidad1 < velocidad2) {
            System.out.println(nombre2 + " es mas rapido, atacara primero");
        }
        if (velocidad1 == velocidad2) {
            System.out.println("Los dos jugadores tienen la misma velocidad se lanza moneda");
            Random velocidadrandom = new Random();
            int moneda = velocidadrandom.nextInt(2);
            if (moneda == 0) {
                velocidad1++;
                System.out.println("Ha salido cara empieza " + nombre1);
            } else {
                velocidad2++;
                System.out.println("Ha salido cruz empieza " + nombre2);
            }
        }

        Random ataquerandom = new Random();
        in.nextLine();

        while (puntosdevida1 > 0 && puntosdevida2 > 0) {
            System.out.println("\nRONDA " + ronda);
            ronda++;

            if (velocidad1 > velocidad2) {
                // Ataque jugador 1
                maxDanio1 = Math.max(1, ataque1 - defensa2);
                danoturno = ataquerandom.nextInt(maxDanio1) + 1; // daño entre 1 y (ataque-defensa)
                int dadoCritico = ataquerandom.nextInt(100) + 1;
                if (dadoCritico <= probcritico) {
                    System.out.println("CRITICO!!! " + nombre1 + " hace daño X2");
                    danoturno *= 2;
                }
                System.out.println(nombre1 + " ataca, daño hecho a " + nombre2 + " = " + danoturno);
                puntosdevida2 = Math.max(0, puntosdevida2 - danoturno);

                // Ataque jugador 2 solo si sigue vivo
                if (puntosdevida2 > 0) {
                    maxDanio2 = Math.max(1, ataque2 - defensa1);
                    danoturno = ataquerandom.nextInt(maxDanio2) + 1;
                    dadoCritico = ataquerandom.nextInt(100) + 1;
                    if (dadoCritico <= probcritico) {
                        System.out.println("CRITICO!!! " + nombre2 + " hace daño X2");
                        danoturno *= 2;
                    }
                    System.out.println(nombre2 + " ataca, daño hecho a " + nombre1 + " = " + danoturno);
                    puntosdevida1 = Math.max(0, puntosdevida1 - danoturno);
                }

            } else {
                // Ataque jugador 2
                maxDanio2 = Math.max(1, ataque2 - defensa1);
                danoturno = ataquerandom.nextInt(maxDanio2) + 1;
                int dadoCritico = ataquerandom.nextInt(100) + 1;
                if (dadoCritico <= probcritico) {
                    System.out.println("CRITICO!!! " + nombre2 + " hace daño X2");
                    danoturno *= 2;
                }
                System.out.println(nombre2 + " ataca, daño hecho a " + nombre1 + " = " + danoturno);
                puntosdevida1 = Math.max(0, puntosdevida1 - danoturno);

                // Ataque jugador 1 solo si sigue vivo
                if (puntosdevida1 > 0) {
                    maxDanio1 = Math.max(1, ataque1 - defensa2);
                    danoturno = ataquerandom.nextInt(maxDanio1) + 1;
                    dadoCritico = ataquerandom.nextInt(100) + 1;
                    if (dadoCritico <= probcritico) {
                        System.out.println("CRITICO!!! " + nombre1 + " hace daño X2");
                        danoturno *= 2;
                    }
                    System.out.println(nombre1 + " ataca, daño hecho a " + nombre2 + " = " + danoturno);
                    puntosdevida2 = Math.max(0, puntosdevida2 - danoturno);
                }
            }

            // Mostrar barras de vida
            int barra1 = puntosdevida1 * 20 / 200;
            int barra2 = puntosdevida2 * 20 / 200;
            String vidaGrafica1 = "█".repeat(barra1) + "-".repeat(20 - barra1);
            String vidaGrafica2 = "█".repeat(barra2) + "-".repeat(20 - barra2);
            System.out.println(nombre1 + ":" + puntosdevida1 + " " + vidaGrafica1);
            System.out.println(nombre2 + ":" + puntosdevida2 + " " + vidaGrafica2);

            // Pausa hasta que el jugador presione ENTER
            if (puntosdevida1 > 0 && puntosdevida2 > 0) {
                System.out.println("Pulsa ENTER para ir a la siguiente ronda");
                in.nextLine();
            }
        }

        System.out.println("\n==========================");
        System.out.println("🏁  COMBATE FINALIZADO");
        System.out.println("==========================");
        if (puntosdevida1 == 0) {
            System.out.println("🏆¡" + nombre2 + " gana!");
        }
        else System.out.println("🏆¡" + nombre1  + " gana!");
        }
    }
