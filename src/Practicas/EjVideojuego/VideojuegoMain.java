package Practicas.EjVideojuego;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.PrintWriter;

public class VideojuegoMain {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int option = -1;
        ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
        loadBinary(listaVideojuegos);
        System.out.println("Cargando videojuegos...");
        do {
            menu();
            try {
                option = Integer.parseInt(in.nextLine());

                switch (option) {
                    case 1 -> addGame(listaVideojuegos);
                    case 2 -> showRanking(listaVideojuegos);
                    case 3 -> deleteGame(listaVideojuegos);
                    case 4 -> saveBinary(listaVideojuegos);
                    case 5 -> loadBinary(listaVideojuegos);
                    case 6 -> writeToFile(listaVideojuegos);
                    case 7 -> saveToCSV(listaVideojuegos);
                    case 0 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida, inténtalo de nuevo.");
                }
            } catch (NumberFormatException e) {
                System.err.println("Por favor, introduce un número válido para el menú.");
            }
        } while (option != 0);
        saveBinary(listaVideojuegos);
    }
    public static void addGame(ArrayList<Videojuego> listaVideojuegos) {
        boolean save = false;
        while (!save) {
            try {
                System.out.println("Seleccione el tipo de juego (1: Fisico, 2: Digital): ");
                int opcion = in.nextInt();
                in.nextLine();

                System.out.println("Ingresa el titulo del videojuego");
                String tittle = in.nextLine();

                System.out.println("Indica la plataforma en la que lo juegas");
                String platform = in.nextLine();

                System.out.println("Indica la nota que tiene");
                int note = in.nextInt();
                in.nextLine();
                Videojuego.validarNota(note);

                if (opcion == 1) {
                    System.out.println("Indica la tienda fisica en la que lo compraste");
                    String shopBought = in.nextLine();
                    System.out.println("Indica el estado del juego: Nuevo o usado");
                    state tipo = state.valueOf(in.nextLine().toUpperCase().trim());
                    listaVideojuegos.add(new VideojuegoFisico(tittle, platform, note, shopBought, tipo));
                } else if (opcion == 2) {
                    System.out.println("Indica la tienda online en la que lo compraste");
                    String onlineShop = in.nextLine();
                    System.out.println("Indica el tamaño del juego en GB");
                    double gB = in.nextDouble();
                    in.nextLine();
                    listaVideojuegos.add(new VideojuegoDigital(tittle, platform, note, onlineShop, gB));
                } else {
                    throw new IllegalArgumentException("La opción debe ser 1 o 2.");
                }
                System.out.println("El videojuego "  + tittle + "' se ha guardado correctamente.");
                save = true;
            } catch (InputMismatchException e) {
                System.err.println("Error: Debes introducir un número válido.");
                in.nextLine();
            } catch (Excepciones.InvalidNoteException e) {
                System.err.println("Error de rango: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.err.println("Error: " + e.getMessage() + " (Verifica la opción o el estado Nuevo/Usado)");
            } catch (Exception e) {
                System.err.println("Ocurrió un error inesperado: " + e.getMessage());
            }
            saveBinary(listaVideojuegos);
            System.out.println("Videojuego creado y guardado en el archivo binario con éxito");
        }
    }

    public static void showRanking (ArrayList<Videojuego> listaVideojuegos) {
        if (listaVideojuegos.isEmpty()) {
            System.out.println("La lista esta vacia");
        } else {
            listaVideojuegos.sort((v1, v2) -> Integer.compare(v2.getNote(), v1.getNote()));
            for (Videojuego videojuego : listaVideojuegos) {
                System.out.println(videojuego.toString());
            }
            System.out.println("Total de videojuegos " + listaVideojuegos.size());
        }
    }
    public static void deleteGame (ArrayList<Videojuego> listaVideojuegos) {
        try {
            String nameDelete;
            if (listaVideojuegos.isEmpty()) {
                    System.out.println("No hay ningun juego en la lista ");
                } else {
                    System.out.println("Introduce el nombre del juego que quieres elimiar");
                    nameDelete = in.nextLine();
                    boolean delete = listaVideojuegos.removeIf(videojuego -> videojuego.getTittle().equalsIgnoreCase(nameDelete));
                    if (delete) {
                        System.out.println("Videojuego eliminado correctamente");
                    } else {
                        throw new Excepciones.GameNotFoundException("El juego no existe en el arrayList");
                    }
                }
        } catch (Excepciones.GameNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.err.println("Valores introducidos erroneos " + e.getMessage());
        }
        catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
    public static void saveBinary(ArrayList<Videojuego> listaVideojuegos) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Videojuegos.dat"))) {
            oos.writeObject(listaVideojuegos);
            System.out.println("Datos guardados en binario correctamente");
        } catch (IOException e) {
            System.err.println("Error al guardar en binario: " + e.getMessage());
        }
    }
    public static void loadBinary(ArrayList<Videojuego> listaVideojuegos) {
        File file = new File("Videojuegos.dat");
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
                ArrayList<Videojuego> loadedList = (ArrayList<Videojuego>) ois.readObject();
                listaVideojuegos.clear();
                listaVideojuegos.addAll(loadedList);
                System.out.println("Datos cargados desde el archivo binario");
            } catch (IOException | ClassNotFoundException e) {
                System.err.println("Error al cargar el archivo binario: " + e.getMessage());
            }
        } else {
            System.out.println("No hay archivo previo asi que se inicia lista vacía");
        }
    }
    public static void writeToFile(ArrayList<Videojuego> listaVideojuegos) {
        if (listaVideojuegos.isEmpty()) {
            System.out.println("No hay ningun juego en la lista ");
        } else {
            try (PrintWriter pw = new PrintWriter(new FileWriter("RankingVideojuego.txt", true))) {
                pw.println("Ranking de Videojuegos");
                pw.println("Total de juegos: " + listaVideojuegos.size());

                for (Videojuego videojuego : listaVideojuegos) {
                    pw.println(videojuego.toString());
                }
                System.out.println("Ranking exportado correctamente a 'RankingVideojuegos'");
            } catch (IOException e) {
                System.err.println("Error al exportar a texto: " + e.getMessage());
            }
        }
    }
    public static void saveToCSV(ArrayList<Videojuego> listaVideojuegos) {
        if (listaVideojuegos.isEmpty()) {
            System.out.println("No hay datos para exportar a CSV.");
        } else {
            try (PrintWriter pw = new PrintWriter(new FileWriter("RankingVideojuegos.csv"))) {

                pw.println("Título;Plataforma;Nota;Tipo;Detalle");

                for (Videojuego videojuego : listaVideojuegos) {
                    String tipo = "";
                    String detalleExtra = "";

                    if (videojuego instanceof VideojuegoFisico) {
                        tipo = "Físico";
                        detalleExtra = "Tienda: " + ((VideojuegoFisico) videojuego).getShopBought();
                    } else if (videojuego instanceof VideojuegoDigital) {
                        tipo = "Digital";
                        detalleExtra = "Tamaño: " + ((VideojuegoDigital) videojuego).getgB() + "GB";
                    }

                    pw.println(videojuego.getTittle() + ";" +
                            videojuego.getPlatform() + ";" +
                            videojuego.getNote() + ";" +
                            tipo + ";" +
                            detalleExtra);
                }

                System.out.println("Ranking exportado correctamente a 'RankingVideojuegos.csv' (Compatible con Excel)");

            } catch (IOException e) {
                System.err.println("Error al crear el archivo CSV: " + e.getMessage());
            }
        }
    }
    public static void menu () {
        System.out.println("Elige la opcion que quieras.");
        System.out.println("1.Añadir videojuego (fisico o digital).");
        System.out.println("2.Mostrar ranking completo.");
        System.out.println("3.Eliminar videojuego por titulo.");
        System.out.println("4.Guardar ranking en fichero binario.");
        System.out.println("5.Cargar ranking desde fichero binario.");
        System.out.println("6.Exportar ranking a texto.");
        System.out.println("7.Exportar ranking a csv");
        System.out.println("0.Salir");
    }
}
