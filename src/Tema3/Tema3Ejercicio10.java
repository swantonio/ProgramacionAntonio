package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio10 {
    public static void opciones (char opcion, String[] args){
        switch (opcion) {
            case 'a' :
                Tema3Ejercicio1.main(args);
                break;
            case 'b' :
                Tema3Ejercicio2.main(args);
                break;
            case 'c' :
                Tema3Ejercicio3.main(args);
                break;
            case 'd' :
                Tema3Ejercicio4.main(args);
                break;
            case 'e' :
                Tema3Ejercicio5.main(args);
                break;
            case 'f' :
                Tema3Ejercicio6.main(args);
                break;
            case 'g' :
                Tema3Ejercicio7.main(args);
                break;
            case 'h' :
                Tema3Ejercicio8.main(args);
                break;
            case 'i' :
                Tema3Ejercicio9.main(args);
                break;
        }
    }

    public static void menu () {
        System.out.println("(a) Muestra el signo de un número introducido por el usuario");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c) Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
    }

    public static void main(String[] args) {
        System.out.println("Introduce alguna de las siguientes opciones");
        menu();
        Scanner in = new Scanner(System.in);
        char opcion = in.next().charAt(0);
        opciones(opcion, args);
    }
}
