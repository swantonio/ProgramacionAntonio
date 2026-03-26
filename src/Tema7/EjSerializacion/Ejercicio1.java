package Tema7.EjSerializacion;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) throws IOException {
        String nombre = "";
        int edad;
        Path filePath = Paths.get("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/EjSerializacion/texto.txt");
        System.out.println("Introduce tu nombre");
        Scanner in = new Scanner(System.in);
        nombre = in.nextLine();
        System.out.println("Introduce tu edad");
        edad = in.nextInt();
        try {
            Files.writeString(filePath, "Nombre: " + nombre + "\n" + " Edad: " + edad,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.CREATE);
            System.out.println("Datos guardados correctamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());        }
    }
}
