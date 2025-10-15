package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio15 {
    public static void main(String[] args) {
        int mes = 0;
        int anio = 0;
        Scanner in = new Scanner(System.in);

        //do while
        while (mes <= 0 || mes > 12) {
            System.out.println("Indica el numero de mes:");
            mes = in.nextInt();
            if (mes <= 0 || mes > 12) {
                System.out.println("Introduce un numero de mes valido");
            }
        }
        do {
            System.out.println("Indica el año:");
            anio = in.nextInt();
            if (anio <=0){
                System.out.println("Indica un año correcto");
            }
        } while (anio <= 0);

        if(mes == 2 && (anio %400 == 0 || (anio %4 == 0 && anio %100 != 0))){
            System.out.println("El mes tiene 29 dias");
        } else if (mes == 2) {
            System.out.println("El mes tiene 28 dias");
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
            System.out.println("El mes tiene 30 dias");
        } else {
            System.out.println("El mes tiene 31 dias");
        }

        in.close();
    }
}
