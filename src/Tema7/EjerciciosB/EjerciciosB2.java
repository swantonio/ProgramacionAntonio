package Tema7.EjerciciosB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EjerciciosB2 {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/alumnos_notas.txt";

        //BufferedReader
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                String [] nombre = new String[10];
                double [] media = new double[10];
                int posicion = 0;

                while ((line = br.readLine()) != null) {
                    String[] partes = line.split(" ");
                    nombre[posicion] = partes[0] + " " + partes[1];
                    double suma = 0;
                    int contador = 0;
                    for (int i = 2; i < partes.length; i++) {
                        suma = suma + Double.parseDouble(partes[i]);
                        contador++;
                    }
                    media [posicion] = suma/contador;
                    posicion++;
                }
                for (int i = 0; i < posicion; i++) {
                    double notaMax = -1;
                    int notaMaxActual = 0;
                    for (int j = 0; j < posicion; j++) {
                        if (media[j] > notaMax) {
                            notaMax = media[j];
                            notaMaxActual = j;
                        }
                    }
                    System.out.println(nombre[notaMaxActual] + " media: " + media[notaMaxActual]);
                    media[notaMaxActual] = -1;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
