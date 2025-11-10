package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio8 {
    public static void dia(int dia) {
        while (dia < 1 || dia > 31) {
            System.out.println("El dia es invalido");
        }
    }
    public static void mes (int mes, int anio) {
        if (mes < 1 || mes > 12) {
            System.out.println("El mes es invalido");
        } else if (mes == 2 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            System.out.println("El mes tiene 29 dias");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            System.out.println("El mes tiene 30 dias");
        } else {
            System.out.println("El mes tiene 31 dias");
        }
    }

    public static void anio(int anio) {
        if (anio <= 0) {
            System.out.println("Indica un año correcto");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indica el dia");
        int dia = in.nextInt();
        System.out.println("Indica el mes");
        int mes = in.nextInt();
        System.out.println("Indica el anio");
        int anio = in.nextInt();
    }
}

