package Tema7.EjSerializacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.file.Files.readAllLines;

public class Ejercicio3 {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/EjSerializacion/texto.txt";
        try {
            List<String> lineas = readAllLines(Paths.get(fileName));
            long numPalabras;
            lineas.forEach(System.out::println);
            numPalabras = lineas.stream().filter(l -> !l.trim().isEmpty())
                    .mapToLong(linea -> (long) linea.trim().split("\\s+").length)
                    .sum();
            System.out.println("EL archivo tiene " + numPalabras + " palabras");
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
