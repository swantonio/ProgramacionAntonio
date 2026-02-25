package Actividad1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorDeLibros {

    List<Libro> libroArrayList = new ArrayList<>();
    public static void main() {
        int opcion;
        String ISBN;
        String autor;
        String nombre;
        int totalpeso;

        List<Libro> libroArrayList = new ArrayList<>();
        do {
            menu();
            Scanner in = new Scanner(System.in);
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el ISBN del libro");
                    ISBN = in.nextLine();
                    System.out.println("Introduce el autor del libro");
                    autor = in.nextLine();
                    System.out.println("Introduce el nombre del libro");
                    nombre = in.nextLine();

                    Libro libro1 = new Libro(ISBN, autor, nombre);
                    libroArrayList.add(libro1);
                    break;
                case 2:
                    System.out.println("Introduce el ISBN del libro para mostrar su informacion");
                    ISBN = in.nextLine();
                case 3:
                    System.out.println("Introduce el ISBN del libro para cambiar su genero");

                case 4:
                    System.out.println("Introduce el nombre del autor para ver sus librps");
                default:
                    throw new IllegalStateException("Valor inesperado " + opcion);
            }
        }
        while (opcion != 5);

    }

    public static void menu() {
        System.out.println("Indica que quieres hacer");
        System.out.println("1. Introducir Libro");
        System.out.println("2. Mostrar informacion de un libro (Por ISBN)");
        System.out.println("3. Modificar el genero de un libro (POR ISBN)");
        System.out.println("4. Mostrar todos los libros de un autor");
        System.out.println("5. Salir");
    }


}

