package Funkos;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoMain {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int option;
        ArrayList<Funko> listFunkos = new ArrayList<>();
       do {
           menu();
           option = Integer.parseInt(in.nextLine());
           switch (option) {
               case 1 -> addFunko(listFunkos);
               case 2 ->
               case 3 ->
               case 4 ->
               case 5 ->
               case 6 ->
               case 7 ->
               case 8 ->
                   System.out.println("Saliendo");
               default:
           }
       } while (option != 8);
    }

    public static void addFunko (ArrayList<Funko> listFunkos) throws IOException {
        String name;
        int year;
        double price;
        model option = null;
        String modelOption;
        System.out.println("Añadiendo nuevo funko");
        System.out.println("Introduce el nombre del funko");
        name = in.nextLine();
        System.out.println("Introduce el precio del funko");
        price = Double.parseDouble(in.nextLine());
        System.out.println("Introduce uno de los siguientes modelos del funko");
        while (option == null) {
            System.out.println("Modelos: ROJO, AZUL, VERDE");
            modelOption = in.nextLine().toUpperCase().trim();

            try {
                option = model.valueOf(modelOption);
            } catch (IllegalArgumentException e) {
                System.err.println("Error: El modelo " + modelOption + " no existe");
            }
        }
        System.out.println("Introduce el año en el que se creo el funko");
        year = Integer.parseInt(in.nextLine());

        System.out.println("Nombre: " + name + " Precio: " + price + " Modelo: " + option + " Año: " + year);
        Funko funkonuevo = new Funko(name, price, option, year);
        listFunkos.add(funkonuevo);
        saveFunkos(funkonuevo);
        System.out.println("Funko creado y guardado en CSV con éxito");
    }

    public static void deleteFunko () {

    }
    public static void loadFunkos (ArrayList<Funko> listFunkos) {
        String line;
        String file = "funkos.csv";
        try (java.io.BufferedReader br = new java.io.BufferedReader(new java.io.FileReader(file))) {
           while ((line = br.readLine())!= null) {
               String[] data = line.split(",");
               String name = data[1];
               double price = Double.parseDouble(data[2]);
               model model = Funkos.model.valueOf(data[3]);
               int year = Integer.parseInt(data[4]);
           }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void saveFunkos (Funko funko) {
        try (java.io.FileWriter fw = new java.io.FileWriter("funkos.csv", true);
        java.io.PrintWriter pw = new java.io.PrintWriter(fw)) {
           pw.println(funko.getIdfunko() + "," +
                   funko.getName() + "," +
                   funko.getPrice() + "," +
                   funko.getModel() + ";" +
                   funko.getYear());
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public static void menu () {
        System.out.println("Elige la opcion que quieras");
        System.out.println("1. Añadir funko");
        System.out.println("2. Borrar funko");
        System.out.println("3. Mostrar todos los funkos");
        System.out.println("4. Mostrar el funko mas caro");
        System.out.println("5. Mostar la media de precio de los funkos");
        System.out.println("6. Mostrar funkos agrupados por modelos");
        System.out.println("7. Mostrar los funkos de 2023");
        System.out.println("8. Salir");
    }
}
