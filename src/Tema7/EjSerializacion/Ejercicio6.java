package Tema7.EjSerializacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Persona> listaPersonas = new ArrayList<>();
        boolean salir = false;

        while (!salir) {
            System.out.println("\nDime que quieres hacer: \n1. Añadir persona\n2. Guardar y salir");
            int opcion = in.nextInt();
            in.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = in.nextLine();
                    System.out.print("Edad: ");
                    int edad = in.nextInt();
                    listaPersonas.add(new Persona(nombre, edad));
                    System.out.println("Añadido a la lista.");
                    break;
                case 2:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        File archivo = new File("personas.dat");
        try (ObjectOutputStream salida = new ObjectOutputStream(new FileOutputStream(archivo))) {
            salida.writeObject(listaPersonas);
            System.out.println("\nLista guardada con éxito en personas.dat");
        } catch (IOException e) {
            System.err.println("Error al guardar: " + e.getMessage());
        }

        System.out.println("\nLeyendo del archivo para comprobar...");
        try (ObjectInputStream entrada = new ObjectInputStream(new FileInputStream(archivo))) {
            ArrayList<Persona> listaLeida = (ArrayList<Persona>) entrada.readObject();
            for (Persona p : listaLeida) {
                System.out.println("Recuperado: " + p.getNombre() + " (" + p.getEdad() + " años)");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al leer: " + e.getMessage());
        }
    }
}