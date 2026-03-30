package Tema7.EjerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class EjercicioB4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        try {
            List<String> nombres = Files.readAllLines(Paths.get("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/usa_nombres.txt"));
            List<String> apellidos = Files.readAllLines(Paths.get("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/usa_apellidos.txt"));

            System.out.print("Cuántos nombres deseas generar?: ");
            int cantidad = sc.nextInt();
            sc.nextLine();

            System.out.print("Qué archivo deseas añadirlos? (ej: usa_personas.txt): ");
            String nombreArchivoDestino = sc.nextLine();

            StringBuilder contenido = new StringBuilder();
            for (int i = 0; i < cantidad; i++) {
                String nombreAzar = nombres.get(random.nextInt(nombres.size()));
                String apellidoAzar = apellidos.get(random.nextInt(apellidos.size()));

                contenido.append(nombreAzar).append(" ").append(apellidoAzar).append("\n");
            }

            Files.write(
                    Paths.get(nombreArchivoDestino),
                    contenido.toString().getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND
            );

            System.out.println("Se han añadido " + cantidad + " nombres a " + nombreArchivoDestino);

        } catch (IOException e) {
            System.err.println("Error al leer/escribir los archivos: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado: " + e.getMessage());
        }
    }
}
