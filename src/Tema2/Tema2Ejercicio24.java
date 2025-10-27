package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio24 {
    public static void main(String[] args) {
        int aprobados = 0;
        int suspendidos = 0;
        double nota = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Introduce notas, cuando quieras acabar introduce -1");
        nota = in.nextDouble();
        while (nota != -1) {
            if (nota < 0 || nota > 10) {
                System.out.println("Error introduce una nota valida ");
            } else {
                if (nota >= 5) {
                    aprobados++;
                } else {
                    suspendidos++;
                }
            }
            System.out.println("Introduce otra nota");
            nota = in.nextDouble();
        }

            System.out.println("La cantidad de aprobados es de " + aprobados + " y la de suspendidos " + suspendidos);
            in.close();
        }
    }
