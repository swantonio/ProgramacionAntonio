package Tema7.EjerciciosB;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class EjerciciosB6 {


 public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            try {
                String contenidoPi = new String(Files.readAllBytes(Paths.get("/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/pi-million.txt")));

                System.out.print("Introduce el número a buscar: ");
                String buscar = sc.nextLine();

                int longitudBuscada = buscar.length();
                int longitudPi = contenidoPi.length();
                boolean encontrado = false;

                for (int i = 0; i <= longitudPi - longitudBuscada; i++) {

                    String trozo = contenidoPi.substring(i, i + longitudBuscada);

                    if (trozo.equals(buscar)) {
                        System.out.println("El número aparece en la posición: " + i);
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("El número no se encuentra en el primer millón de decimales.");
                }

            } catch (IOException e) {
                System.err.println("Error: No se pudo encontrar el archivo 'pi-million.txt'");
            }
        }
    }

