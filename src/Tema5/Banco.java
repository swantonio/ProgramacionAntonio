package Tema5;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        String nombre = "";
        String dni = "";
        int opcion = 0;
        boolean continuar = true;
        ArrayList<Object> cola = new ArrayList<>();

            while (continuar) {
            menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre");
                    nombre = in.nextLine();
                    System.out.println("Introduce la edad");
                    edad = in.nextInt();
                    System.out.println("Introduce el dni");
                    dni = in.nextLine();
                    in.nextLine();
                    cola.add(new Usuario(nombre, edad, dni));
                    System.out.println("Usuario añadido al final de la cola");
                    break;
                case 2:
                    if (!cola.isEmpty()) {
                        Usuario atendido = (Usuario) cola.get(0);
                        System.out.println("Atendiendo al primero de la cola");
                        System.out.println(atendido.getNombre()+ " se ha ido");
                        cola.remove(0);
                    } else {
                        System.out.println("La cola esta vacia");
                    }
                    break;
                case 3:
                    System.out.println("Introduce el nombre de quien se va:");
                    String eliminado = in.nextLine();
                    for (int i = 0; i < cola.size(); i++) {
                        Usuario usuario = (Usuario) cola.get(i);
                        if (usuario.getNombre().equalsIgnoreCase(eliminado)) {
                            cola.remove(i);
                            System.out.println(eliminado + " ha sido eliminado de la cola.");
                        }
                    }
                    break;
                case 4:
                    System.out.println("--- GENTE EN LA COLA ---");
                    if (cola.isEmpty()) {
                        System.out.println("La cola está vacía.");
                    } else {
                        for (Object persona : cola) {
                            System.out.println(persona);
                        }
                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    continuar = false;
            }
        } ;
    }
    public static void menu () {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1. Añadir alguien a la cola");
        System.out.println("2. Quitar al primero de la cola");
        System.out.println("3. Quitar a cualquiera en cualquier posicion");
        System.out.println("4. Mostrar la cola");
        System.out.println("5. Salir");
    }
}
