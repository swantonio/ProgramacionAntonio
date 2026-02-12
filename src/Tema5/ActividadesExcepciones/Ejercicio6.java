package Tema5.ActividadesExcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean gatoCreado = false;
        do {
            try {
                Gato g = new Gato();

                System.out.println("Introduce el nombre del gato:");
                String nombre = in.nextLine();
                g.setNombre(nombre);

                System.out.println("Introduce la edad del gato:");
                int edad = in.nextInt();
                in.nextLine();
                g.setEdad(edad);


                System.out.println("Éxito: " + g.toString());
                gatoCreado = true;

            } catch (InputMismatchException ex) {
                System.err.println("Error: La edad debe ser un número entero.");
                in.nextLine();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        } while (!gatoCreado);
        System.out.println("Saliendo del programa");
    }
}