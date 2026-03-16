package Tema7.EjerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EjercicioB3 {
    public static void main(String[] args) throws IOException {
        System.out.println("Introduce el nombre del archivo que quieres leer");
        Scanner in = new Scanner(System.in);
        String archivo1 = in.nextLine();
        System.out.println("Introduce el nombre del archivo donde lo quieres escribir");
        String archivo2 = in.nextLine();
        String fileName = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/";

        try {
            List<String> lineasOrdenadas = Files.lines(Paths.get(fileName +archivo1))
                    .sorted()
                    .collect(Collectors.toList());
            Files.write(Paths.get(fileName + archivo2), lineasOrdenadas);

            System.out.println("Archivo ordenado correctamente en el nuevo");

        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
        }
    }

