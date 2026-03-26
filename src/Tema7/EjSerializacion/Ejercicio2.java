package Tema7.EjSerializacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejercicio2 {
    public static void main(String[] args) {
        String fileName = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/EjSerializacion/usuario.txt";
            try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
                stream.forEach(System.out::println);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

