package Practicas;

import java.util.Objects;
import java.util.Scanner;

enum type {
    Libre, Ocupado
}
public class TaquilleroDigital {
    static String[] pos = new String[10];
    static String[] users = new String[10];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < pos.length; i++) {
            pos[i] = String.valueOf(type.Libre);
        }
        int option;
        do {
            menu();
            option = Integer.parseInt(in.nextLine());
            switch (option) {
                case 1 -> showSeat();
                case 2 -> reserveSeat();
                case 3 -> cancelSeat();
                case 4 -> searchClient();
                case 5 -> option = 5;
                default -> System.out.println("Error, has introducido una opcion invalida");
            }

        } while (option != 5);
    }

    public static void menu() {
        System.out.println("Elige una opcion");
        System.out.println("1. Ver asientos");
        System.out.println("2. Reservar asiento");
        System.out.println("3. Cancelar reserva");
        System.out.println("4. Buscar clientes");
        System.out.println("5. Salir");
    }

    public static void showSeat() {
        for (int i = 0; i < pos.length; i++) {
            System.out.println("Asiento nº " + i + pos[i]);
        }
    }

    public static void reserveSeat() {
        boolean continuar = false;
        System.out.println("Selecciona el asiento que te gustaria reservar del 0 al 9");
        do {
            int seat = Integer.parseInt(in.nextLine());
            if (seat >= 0 && seat < pos.length) {
                String name;
                if (Objects.equals(pos[seat], String.valueOf(type.Libre))) {
                    pos[seat] = String.valueOf(type.Ocupado);
                    System.out.println("Asiento libre, indica tu nombre para guardarlo en el asiento");
                    name = in.nextLine();
                    users[seat] = name;
                    System.out.println("Asiento " + pos[seat] + "para " + name);
                    continuar = true;
                } else {
                    System.out.println("EL asiento esta ocupado, indica de nuevo cual deseas");
                }
            }
        } while (!continuar);
    }

    public static void cancelSeat() {
        System.out.println("Introduce el numero del asiento que quieres cancelar");
        int seat;
        seat = Integer.parseInt(in.nextLine());
        if (seat >= 0 && seat < pos.length) {
            if (Objects.equals(pos[seat], String.valueOf(type.Libre))) {
                System.out.println("El asiento ya esta libre");
            } else {
                pos[seat] = String.valueOf(type.Libre);
                System.out.println("Asiento " + seat + " cancelado con exito");
            }
        } else {
            System.out.println("Error numero de asiento no valido");
        }
    }

    public static void searchClient() {
        System.out.println("Indica tu nombre");
        String name;
        boolean encontrado = false;
        name = in.nextLine();
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && users[i].equalsIgnoreCase(name)) {
                System.out.println("EL usuario " + name + " se encuentra en el asiento " + i );
                return;
            }
        }
        if (!encontrado) {
            System.out.println("El usuario no fue encontrado");
        }
    }
}



