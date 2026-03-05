package Actividad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TiendaPokemosTPV {
    public static void main() {
        int opcion;
        List<Articulo> lista = new ArrayList<>();
        do {
            menu2();
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Dime el nombre de la pocion que quieres añadir");
                    String nombre = in.nextLine();
                    System.out.println("Dime el nivel que quieres ");
                    int nivel = in.nextInt();
                    boolean gratis = true;
                    Pocion Pocion1 = new Pocion(nombre, gratis, nivel);
                    lista.add(Pocion1);
                    break;
                default:

            }
        } while (opcion != 7);
    }

    public static void menu2() {
        System.out.println("1.Añadir pocion al ticket");
        System.out.println("2.Añadir pokebola al ticket");
        System.out.println("3.Añadir accesorio al ticket");
        System.out.println("4.Borrar el articulo del ticket (por posicion del ticket)");
        System.out.println("5.Mostrar todos los articulos del ticket");
        System.out.println("6.Mostrat total");
        System.out.println("7.Salir");
    }
}
