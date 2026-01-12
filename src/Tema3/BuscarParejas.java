package Tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscarParejas { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    String[] animales = {
            "León", "León", "Mandril", "Mandril", "Suricata", "Suricata",
            "Facóquero","Facóquero", "Hiena", "Hiena",
            "Jirafa", "Jirafa","Elefante","Elefante",
            "Hipopótamo","Hipopótamo","Ñu","Ñu","Cebra","Cebra"
    };
    for (int i = 0; i < animales.length; i++) {
        int j = rand.nextInt(animales.length);
        String temp = animales[i];
        animales[i] = animales[j];
        animales[j] = temp;
    }
    boolean[] visible = new boolean[20];
    int parejasEncontradas = 0;
    System.out.println("🎮 ¡Bienvenido al juego BUSCAR PAREJAS!\n");
    while (parejasEncontradas < 10) {
        mostrarTablero(animales, visible);
        System.out.print("\nElige la primera posición (1-20): ");
        int p1 = sc.nextInt() - 1;
        System.out.print("Elige la segunda posición (1-20): ");
        int p2 = sc.nextInt() - 1;
        if (p1 == p2 || p1 < 0 || p1 >= 20 || p2 < 0 || p2 >= 20) {
            System.out.println("⚠ Posiciones no válidas. Inténtalo de nuevo.");
            continue;
        }
        if (visible[p1] || visible[p2]) {
            System.out.println("⚠ Una o ambas posiciones ya están descubiertas.");
            continue;
        }
        System.out.println("\nHas elegido:");
        System.out.println((p1+1) + ": " + animales[p1]);
        System.out.println((p2+1) + ": " + animales[p2]);
        if (animales[p1].equals(animales[p2])) {
            System.out.println("🎉 ¡Has encontrado una pareja!");
            visible[p1] = true;
            visible[p2] = true;
            parejasEncontradas++;
        } else {
            System.out.println("❌ No son iguales...");
            esperarYLimpiar();
        }
    }
    System.out.println("\n¡HAS ENCONTRADO TODAS LAS PAREJAS! 🎉🎉");
    mostrarTablero(animales, visible);
}
    public static void mostrarTablero(String[] animales, boolean[] visible) {
        System.out.println("\nTablero:");
        for (int i = 0; i < animales.length; i++) {
            if (visible[i]) {
                System.out.print("[" + animales[i] + "] ");
            } else {
                System.out.print("[ * ] ");
            }
        }
        System.out.println();
    }
    public static void esperarYLimpiar() {
        System.out.println("\nPulsa ENTER para continuar...");
        try { System.in.read(); } catch (Exception ignored) {}
        for (int i = 0; i < 40; i++) System.out.println();
    }

}
