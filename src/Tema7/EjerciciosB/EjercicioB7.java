package Tema7.EjerciciosB;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class EjercicioB7 {
    public static void main(String[] args) {
        String rutaArchivo = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/Libros/quijote_cervantes.txt";

        int nLineas = 0;
        int nCaracteres = 0;
        int nPalabras = 0;
        Map<String, Integer> frecuencias = new HashMap<>();

        try (BufferedReader br = Files.newBufferedReader(Paths.get(rutaArchivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                nLineas++;
                nCaracteres += linea.length();

                String[] palabrasEnLinea = linea.toLowerCase().split("[\\W]+");

                for (String pal : palabrasEnLinea) {
                    if (!pal.isEmpty()) {
                        nPalabras++;
                        frecuencias.put(pal, frecuencias.getOrDefault(pal, 0) + 1);
                    }
                }
            }

            System.out.println("Estadisticas");
            System.out.println("Líneas: " + nLineas);
            System.out.println("Palabras totales: " + nPalabras);
            System.out.println("Caracteres: " + nCaracteres);

            System.out.println("\n--- TOP 10 PALABRAS MÁS COMUNES ---");
            frecuencias.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .limit(10)
                    .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " veces"));

        } catch (IOException e) {
            System.err.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}
