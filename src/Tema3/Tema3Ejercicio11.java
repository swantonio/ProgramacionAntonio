package Tema3;

import java.util.Scanner;
import static Tema3.MyMath.menu;
import static Tema3.MyMath.opciones;
public class Tema3Ejercicio11 {
    static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Introduce alguna de las siguientes opciones");
    menu();
    char opcion = in.next().charAt(0);
    opciones(opcion);
    }
}

