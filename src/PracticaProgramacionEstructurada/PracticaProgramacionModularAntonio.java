package PracticaProgramacionEstructurada;

import java.util.Random;
import java.util.Scanner;

public class PracticaProgramacionModularAntonio {

    public static Scanner in = new Scanner(System.in);
    public static Random random = new Random();
    public static int PROB_CRITICO = 20;

    public static void main(String[] args) {

        String nombre1 = pedirNombre(1);
        int[] j1 = elegirPersonaje(1);

        String nombre2 = pedirNombre(2);
        int[] j2 = elegirPersonaje(2);

        ajustarVelocidadInicial(j1, j2, nombre1, nombre2);

        combatir(j1, j2, nombre1, nombre2);
    }

    // ================= ENTRADA =================

    public static String pedirNombre(int jugador) {
        System.out.println("\nEres el jugador " + jugador + ", indica tu nombre:");
        return in.next();
    }

    public static int[] elegirPersonaje(int jugador) {
        int opcion;
        int[] stats = new int[4]; // 0=v,1=a,2=d,3=vida

        mostrarMenu();
        do {
            System.out.print("Introduce una opción (1-4): ");
            opcion = in.nextInt();
        } while (opcion < 1 || opcion > 4);

        switch (opcion) {
            case 1 -> setStats(stats, 80, 80, 140, 200);
            case 2 -> setStats(stats, 100, 200, 100, 100);
            case 3 -> setStats(stats, 80, 200, 40, 80);
            case 4 -> leerStatsPersonalizados(stats, jugador);
        }
        return stats;
    }

    public static void mostrarMenu() {
        System.out.println("1 - Tanque (80 VEL, 80 ATQ, 200 VIDA, 140 DEF)");
        System.out.println("2 - Asesino (100 VEL, 200 ATQ, 100 VIDA, 100 DEF)");
        System.out.println("3 - Mago (80 VEL, 200 ATQ, 80 VIDA, 40 DEF)");
        System.out.println("4 - Personalizado");
    }

    public static void leerStatsPersonalizados(int[] s, int jugador) {
        int total;
        do {
            s[0] = leerAtributo("Velocidad");
            s[1] = leerAtributo("Ataque");
            s[2] = leerAtributo("Defensa");
            s[3] = leerAtributo("Vida");
            total = s[0] + s[1] + s[2] + s[3];
            if (total > 500) {
                System.out.println("❌ La suma supera 500, repite.");
            }
        } while (total > 500);
    }

    public static int leerAtributo(String nombre) {
        int v;
        do {
            System.out.print(nombre + " (1-200): ");
            v = in.nextInt();
        } while (v < 1 || v > 200);
        return v;
    }

    public static void setStats(int[] s, int v, int a, int d, int vida) {
        s[0] = v;
        s[1] = a;
        s[2] = d;
        s[3] = vida;
    }

    // ================= COMBATE =================

    public static void ajustarVelocidadInicial(int[] j1, int[] j2, String n1, String n2) {
        System.out.println("\nComprobando velocidad inicial...");
        if (j1[0] == j2[0]) {
            System.out.println("Velocidades iguales, se lanza moneda");
            if (random.nextInt(2) == 0) j1[0]++;
            else j2[0]++;
        }
        System.out.println((j1[0] > j2[0] ? n1 : n2) + " empieza atacando");
        System.out.println("Pulsa intro para que comienze la batalla!!!");
    }

    public static void combatir(int[] j1, int[] j2, String n1, String n2) {
        int ronda = 1;
        in.nextLine();
        in.nextLine();

        while (j1[3] > 0 && j2[3] > 0) {
            System.out.println("\nRONDA " + ronda++);
            if (j1[0] > j2[0]) {
                turno(j1, j2, n1, n2);
                if (j2[3] > 0) turno(j2, j1, n2, n1);
            } else {
                turno(j2, j1, n2, n1);
                if (j1[3] > 0) turno(j1, j2, n1, n2);
            }
            mostrarVida(n1, j1[3], n2, j2[3]);
            pausa(j1[3], j2[3]);
        }
        mostrarGanador(j1[3], j2[3], n1, n2);
    }

    public static void turno(int[] atacante, int[] defensor, String nA, String nD) {
        System.out.println("\nTurno de " + nA);
        System.out.println("Elige una acción:");
        System.out.println("1 - Atacar");
        System.out.println("2 - Curarse");
        int opcion = in.nextInt();
        if (opcion == 1) atacar(atacante, defensor, nA, nD);
        else curar(atacante, nA);
    }

    public static void atacar(int[] atacante, int[] defensor, String nA, String nD) {

        int defensaReducida = defensor[2] / 2;
        int baseDanio = atacante[1] - defensaReducida;
        if (baseDanio < 5) baseDanio = 5;
        int danio = random.nextInt(baseDanio) + 1;
        if (danio > 50) danio = 50;
        int dadoCritico = random.nextInt(100) + 1;
        if (dadoCritico <= PROB_CRITICO) {
            danio *= 2;
            if (danio > 50) danio = 50;
            System.out.println("💥 ¡CRÍTICO! El daño se duplica");
        }
        defensor[3] -= danio;
        if (defensor[3] < 0) defensor[3] = 0;
        System.out.println(nA + " ataca a " + nD + " y causa " + danio + " de daño.");
    }
    public static void curar(int[] j, String nombre) {
        int curacion = Math.min(30, 200 - j[3]);
        j[3] += curacion;
        System.out.println(nombre + " se cura +" + curacion);
    }

    // ================= SALIDA =================

    public static void mostrarVida(String n1, int v1, String n2, int v2) {
        System.out.println(n1 + ": " + v1 + "/200");
        System.out.println(n2 + ": " + v2 + "/200");
    }

    public static void pausa(int vida1, int vida2) {
        if (vida1 > 0 && vida2 > 0) {
            System.out.println("\nPulsa ENTER para pasar a la siguiente ronda...");
            in.nextLine();
            in.nextLine();
        }
    }

    public static void mostrarGanador(int v1, int v2, String n1, String n2) {
        System.out.println("\nCOMBATE FINALIZADO");
        System.out.println("🏆 Gana " + (v1 > 0 ? n1 : n2));
    }
}
