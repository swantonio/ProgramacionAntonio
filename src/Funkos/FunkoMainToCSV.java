package Funkos;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FunkoMainToCSV {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int option;
        ArrayList<Funko> listFunkos = new ArrayList<>();
        loadFunkos(listFunkos);
        System.out.println("Cargando funkos...");
       do {
           menu();
           try {
               option = Integer.parseInt(in.nextLine());
               switch (option) {
                   case 1 -> addFunko(listFunkos);
                   case 2 -> deleteFunko(listFunkos);
                   case 3 -> showfunkos(listFunkos);
                   case 4 -> showMostExpensiveFunko(listFunkos);
                   case 5 -> calculateAveragePrice(listFunkos);
                   case 6 -> showFunkosByModel(listFunkos);
                   case 7 -> showFunkosFrom2023(listFunkos);
                   case 8 -> System.out.println("Saliendo");
                   default -> System.out.println("Opción no válida intentalo de nuevo.");
               }
           } catch (NumberFormatException e) {
               System.out.println("Porfavor introduce un numero valido");
               option = 0;
           }
       } while (option != 8);
        updateCompleteFile(listFunkos);
    }

    public static void addFunko (ArrayList<Funko> listFunkos) {
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
        System.out.println("Funko creado y guardado en CSV con éxito.");
    }

    public static void deleteFunko (ArrayList<Funko> listFunkos) {
        System.out.println("Introduce el nombre del funko que deseas eliminar.");
        String nameDelete = in.nextLine();
        boolean delete = listFunkos.removeIf(funko -> funko.getName().equalsIgnoreCase(nameDelete));

        if (delete) {
            updateCompleteFile(listFunkos);
            System.out.println("Funko eliminado con exito.");
        } else {
            System.out.println("No se emcontro ningun Funko con ese nombre.");
        }
    }

    public static void updateCompleteFile(ArrayList<Funko> listFunkos) {
        try (java.io.FileWriter fw = new FileWriter("funkos.csv", false);
        java.io.PrintWriter pw = new java.io.PrintWriter(fw)){
            for (Funko funko : listFunkos) {
                pw.println(funko.getIdfunko() + "," + funko.getName() + "," + funko.getPrice() + "," + funko.getModel() + "," + funko.getYear());
            }
        } catch (IOException e) {
            System.err.println("Error al actualizar el archivo: " + e.getMessage());
        }
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

               listFunkos.add(new Funko(name, price, model, year));
           }
            System.out.println("Datos cargados correctamente desde el CSV");
        } catch (FileNotFoundException e) {
            System.out.println("No se encontró el archivo CSV. Se creará uno nuevo al añadir un Funko.");
        } catch (IOException e) {
            System.err.println("Error al cargar datos: " + e.getMessage());
        }
    }

    public static void saveFunkos (Funko funko) {
        try (java.io.FileWriter fw = new java.io.FileWriter("funkos.csv", true);
        java.io.PrintWriter pw = new java.io.PrintWriter(fw)) {
           pw.println(funko.getIdfunko() + "," +
                   funko.getName() + "," +
                   funko.getPrice() + "," +
                   funko.getModel() + "," +
                   funko.getYear());
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo CSV: " + e.getMessage());
        }
    }

    public static void showfunkos (ArrayList<Funko> listFunkos) {
        System.out.println("Lista de funkos");
        if (listFunkos.isEmpty()){
            System.out.println("No hay nada en la lista por lo tanto no se muestra nada");
        } else {
            for (Funko funko : listFunkos) {
                System.out.println(funko.toString());
            }
            System.out.println("Total de funkos: " + listFunkos.size());
        }
    }

    public static void showMostExpensiveFunko (ArrayList<Funko> listFunkos) {
        if (listFunkos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            Funko funkoExpensive = listFunkos.get(0);
            for (Funko funko : listFunkos) {
                if (funko.getPrice() > funkoExpensive.getPrice()) {
                    funkoExpensive = funko;
                }
            }
            System.out.println("El funko mas caro es:");
            System.out.println(funkoExpensive);
        }
    }

    public static void showFunkosByModel (ArrayList<Funko> listFunkos) {
        if (listFunkos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (model m : model.values()) {
                System.out.println("Modelo: " + m);
                boolean find = false;
                for (Funko funko : listFunkos) {
                    if (funko.getModel() == m) {
                        System.out.println(funko);
                        find = true;
                    }
                }if (!find) {
                    System.out.println("No hay funkos de este modelo");
                }
            }
        }
    }

    public static void calculateAveragePrice(ArrayList<Funko> listFunkos) {
        double total = 0;
        double average;
        if (listFunkos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            for (Funko funko : listFunkos) {
                total += funko.getPrice();
            }
            average = total / listFunkos.size();
            System.out.printf("La media de precio de los funkos es: %.2f\n", average);
        }
    }

    public static void showFunkosFrom2023(ArrayList<Funko> listFunkos) {
        if (listFunkos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            System.out.println("Funkos 2023: ");
            boolean find = false;

            for (Funko funko : listFunkos) {
                if (funko.getYear() == 2023) {
                    System.out.println(funko);
                    find = true;
                }
            }
            if (!find) {
                System.out.println("No se encontraron funkos del año 2023");
            }
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
