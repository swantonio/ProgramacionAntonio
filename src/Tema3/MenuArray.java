package Tema3;

import java.util.Scanner;

public class MenuArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce alguna de las siguientes opciones");
        menu();
        char opcion = in.next().charAt(0);
        switch (opcion) {
            case 'a':
                int [] devueltaArray = new int[] {1,2,3,4,5,6,7,8,9,10};
                MyArray.devolverArray(devueltaArray);
            case 'b':
        }
    }

    public static void menu() {
        System.out.println("Introduce a si quieres ver el array");
        System.out.println("Introduce b si quieres saber el numero maximo del array");
        System.out.print("Introduce c si quieres saber el numero minimo del array");
        System.out.println("Introduce d si quieres saber la media del array");
        System.out.println("Introduce e si quieres saber si el elemento que introduzcas existe en el array");
        System.out.println("Introduce f para sumar 2 vectores del array");
        System.out.println("Introduce g para restar 2 vectores del array");
        System.out.println("Introduce h para saber el producto de 2 vectores del array");
        System.out.println("Introduce i si quieres invertir el orden del array");
        System.out.println("Introduce j si quieres invertir del orden del array sin devolver nada");
        System.out.println("Introduce k si quieres saber si el array es capicua");
    }
}
