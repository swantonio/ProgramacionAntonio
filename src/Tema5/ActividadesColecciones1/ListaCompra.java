package Tema5.ActividadesColecciones1;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ListaCompra {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Set<String> lista = new HashSet<>();
        Set<String> carro = new HashSet<>();
        boolean continuar = true;
        String producto;
        int opcion = 0;
        boolean parar = true;
        while (parar) {
            menu();
            opcion = in.nextInt();
            in.nextLine();
            switch (opcion) {
                case 1:
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
                                System.out.println("\nLista final de la compra: " + lista);
                            }
                        }
                    }
                    System.out.println("\nLista final de la compra: " + lista);
                    break;
                case 2:
                    System.out.println("Elige el producto de la lista");
                    producto = in.nextLine().toLowerCase();
                    if (lista.contains(producto)) {
                        carro.add(producto);
                        System.out.println("'" + producto + "' metido en el carro.");
                    } else {
                        System.out.println("Ese producto no estaba en tu lista original.");
                    }
                    break;
                case 3:
                    System.out.println("Carro de la compra:" + carro);
                    break;
                case 4:
                    Set<String> faltan = new HashSet<>(lista);
                    faltan.removeAll(carro);
                    System.out.println("Te falta por comprar: " + faltan);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    parar = false;
                    break;
            }
            }
        }
    public static void menu () {
        System.out.println("Elige una de las siguientes opciones");
        System.out.println("1 Introduce los productos en la lista de la compra");
        System.out.println("2.Introduce ");
        System.out.println("-. Salir");
    }
}

