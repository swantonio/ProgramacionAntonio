package Tema5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> lista = new HashSet<>();
        boolean continuar = true;
        String producto;
        System.out.println("Introduce los productos (escribe 'salir' para acabar):");
        while (continuar) {
            System.out.print("Producto: ");
            producto = in.nextLine();
            if (producto.equalsIgnoreCase("salir")) {
                System.out.println("Saliendo");
                continuar = false;
            } else {
                if (lista.contains(producto)) {
                    System.out.println("El producto '" + producto + "' ya está en la lista.");
                } else {
                    lista.add(producto);
                    System.out.println(producto + " añadido");
                }
            }
        }
        System.out.println("\nLista final de la compra: " + lista);
    }
}