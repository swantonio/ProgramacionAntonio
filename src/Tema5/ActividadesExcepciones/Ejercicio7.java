package Tema5.ActividadesExcepciones;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Gato> listaGatos = new ArrayList<>();

        int i = 0;
        while (i < 5) {
            try {
                System.out.println("\n--- Datos del Gato " + (i + 1) + " ---");
                Gato g = new Gato();

                System.out.println("Introduce el nombre:");
                String nombre = in.nextLine();
                g.setNombre(nombre);

                System.out.println("Introduce la edad:");
                int edad = in.nextInt();
                in.nextLine();
                g.setEdad(edad);

                listaGatos.add(g);
                System.out.println("Gato guardado correctamente.");

                i++;

            } catch (InputMismatchException ex) {
                System.err.println("Error: La edad debe ser un número entero.");
                in.nextLine();
            } catch (Exception ex) {
                System.err.println(ex.getMessage());
            }
        }
        System.out.println(" LISTA FINAL DE GATOS ");
        for (Gato gatoAux : listaGatos) {
            System.out.println(gatoAux.toString());
        }
    }
}