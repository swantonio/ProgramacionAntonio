package Tema3;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaMinasAntonio {   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();

    int tamano = 20, minas = 6;
    String[] tablero = new String[tamano];
    boolean[] visible = new boolean[tamano];

    Arrays.fill(tablero, "0");
    int colocadas = 0;
    while (colocadas < minas) {
        int pos = rand.nextInt(tamano);
        if (!tablero[pos].equals("*")) { tablero[pos] = "*"; colocadas++; }
    }

    for (int i = 0; i < tamano; i++) {
        if (tablero[i].equals("*")) continue;
        int c = 0;
        if (i>0 && tablero[i-1].equals("*")) c++;
        if (i< tamano -1 && tablero[i+1].equals("*")) c++;
        tablero[i] = String.valueOf(c);
    }

    int seguras = tamano - minas, descubiertas = 0;
    boolean perdido = false;

    while (!perdido && descubiertas < seguras) {
        for (int i = 0; i < tamano; i++)
            System.out.print(visible[i]? tablero[i]+" " : "* ");
        System.out.println();
        System.out.print("Elige posición (1-20): ");
        int p = sc.nextInt()-1;
        if (p<0||p>= tamano || visible[p]) { System.out.println("Posición inválida."); continue; }

        if (tablero[p].equals("*")) perdido = true;
        else { visible[p]=true; descubiertas++; }
    }
    System.out.println(perdido ? "💥 ¡BOOM! Has perdido." : "🎉 ¡Has ganado!");
    System.out.println("Tablero final: " + Arrays.toString(tablero));
}
}
