package Tema7.EjerciciosB;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EjerciciosB5 {
    public static void main(String[] args) {
        File carpeta = new File("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/Diccionario");
        File archivoOrigen = new File("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/diccionario.txt");

        if (!carpeta.exists()) {
            boolean creada = carpeta.mkdir();
            if (creada) {
                System.out.println("Carpeta 'Diccionario' creada con éxito.");
            } else {
                System.err.println("No se pudo crear la carpeta. Revisa los permisos.");
                return;
            }
        }

        try {
            List<String> palabras = Files.readAllLines(archivoOrigen.toPath());

            for (char letra = 'A'; letra <= 'Z'; letra++) {
                List<String> palabrasFiltradas = new ArrayList<>();

                for (String p : palabras) {
                    if (!p.isEmpty() && Character.toUpperCase(p.charAt(0)) == letra) {
                        palabrasFiltradas.add(p);
                    }
                }

                if (!palabrasFiltradas.isEmpty()) {
                    Path rutaArchivo = Paths.get("Diccionario", letra + ".txt");
                    Files.write(rutaArchivo, palabrasFiltradas);
                }
            }

            System.out.println("Proceso finalizado: Archivos generados dentro de /Diccionario");

        } catch (NoSuchFileException e) {
            System.err.println("Error: No se encuentra el archivo 'diccionario.txt'");
        } catch (IOException e) {
            System.err.println("Error de lectura/escritura: " + e.getMessage());
        }
    }
}
