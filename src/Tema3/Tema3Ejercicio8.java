package Tema3;
import java.util.Scanner;
public class Tema3Ejercicio8 {
    public static boolean esBisiesto(int anio) {
        return (anio % 400 == 0) || (anio % 4 == 0 && anio % 100 != 0);
    }
    public static boolean fechaValida(int dia, int mes, int anio) {
        if (anio <= 0) return false;
        if (mes < 1 || mes > 12) return false;

        int diasDelMes;
        switch (mes) {
            case 2:
                diasDelMes = esBisiesto(anio) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                diasDelMes = 30;
                break;
            default:
                diasDelMes = 31;
        }

        return dia >= 1 && dia <= diasDelMes;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Indica el dia");
        int dia = in.nextInt();
        System.out.println("Indica el mes");
        int mes = in.nextInt();
        System.out.println("Indica el anio");
        int anio = in.nextInt();

        if (fechaValida(dia, mes, anio)) {
            System.out.println("La fecha es correcta");
        } else {
            System.out.println("La fecha es incorrecta");
        }
        }
    }


