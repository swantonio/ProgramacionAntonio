package Tema7.EjSerializacion;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nonbre = "";
        int edad;
        ArrayList<Objects> Personas = new ArrayList<>();
        boolean bucle = false;
        int opcion;
        while (bucle != true) {
            System.out.println("Pulsa 1 si quieres añadir un objeto persona y 2 para salir");
            opcion = in.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el nombre de la persona");
                    nonbre = in.nextLine();
                    System.out.println("Introduce la edad de la persona");
                    edad = in.nextInt();
                    Persona Antonio = new Persona(nonbre, edad);
                    try (FileOutputStream fos = new FileOutputStream("persona.dat");
                         ObjectOutputStream salida = new ObjectOutputStream(fos)) {
                        salida.writeObject(Antonio);
                        System.out.println("Objeto serializado");
                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    System.out.println("Saliendo...");
                    bucle = true;
                    break;
                default:
                    System.out.println("ahah");
            }
        }
    }
}
