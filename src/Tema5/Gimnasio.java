package Tema5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Gimnasio {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int edad;
        String nombre;
        String dni = "";
        int opcion = 0;
        Map<String, Object> usuarios = new HashMap<>();

        do {
            System.out.println("Elige una de las siguientes opciones");
            System.out.println("1. Dar usuario de alta");
            System.out.println("2. Dar usuario de baja");
            System.out.println("3. Mostrar datos de usuario");
            System.out.println("4. Modificar usuarios");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
            case 1:
                if (usuarios.containsKey(dni)) {
                System.out.println("El usuario ya existe o es incorrecto");
                } else {
                    System.out.println("Introduce el dni del usuario que quieras añadir");
                    dni = in.nextLine();
                     System.out.println("Introduce el nombre");
                    nombre = in.nextLine();
                    System.out.println("Introduce la edad");
                    edad = in.nextInt();
                    in.nextLine();
                    Usuario usuario = new Usuario(nombre, edad, dni);
                    usuarios.put(dni, usuario);
                }
                break;
            case 2:
                System.out.println("Introduce el dni del usuario que quieras eliminar");
                dni = in.nextLine();
                if (usuarios.containsKey(dni)) {
                    usuarios.remove(dni);
                    System.out.println("Usuario dado de baja correctamente");
                } else {
                    System.out.println("Error el usuario no existe o no es valido");
                }
                break;
            case 3:
                System.out.println("Introduce el dni para ver los datos del usuario");
                dni = in.nextLine();
                if (usuarios.containsKey(dni)) {
                    System.out.println("Datos =" + usuarios.get(dni));
                } else {
                    System.out.println("Error el usuario no existe o es incorrecto");
                }
                break;
            case 4:
                System.out.println("Introduce el DNI del usuario que quieras modificar");
                dni = in.nextLine();

                if (usuarios.containsKey(dni)) {
                    Usuario usuario = (Usuario) usuarios.get(dni);
                    System.out.println("Usuario encontrado: " + usuario);
                    System.out.println("Introduce el nuevo nombre:");
                    nombre = in.nextLine();
                    System.out.println("Introduce la nueva edad:");
                    edad = in.nextInt();
                    in.nextLine();
                    usuario.setNombre(nombre);
                    usuario.setEdad(edad);
                    System.out.println("Usuario modificado con éxito");
                } else {
                    System.out.println("Error: El usuario con DNI " + dni + " no existe.");
                }
                break;
            case 5:
                System.out.println("Saliendo...");
                break;
        }
        } while (opcion != 5);
    }
}
