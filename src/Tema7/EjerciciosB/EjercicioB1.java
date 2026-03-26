package Tema7.EjerciciosB;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class EjercicioB1 {
    public static void main(String[] args) throws IOException {
        String fileName = "/home/antdelmor2/IdeaProjects/ProgramacionAntonio/src/Tema7/Documentos/numeros.txt";

        //BufferedReader
        try {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                int min = 99999999;
                int max = 0;

                while ((line = br.readLine()) != null) {
                   if(Integer.parseInt(line) > max ){
                       max = Integer.parseInt(line);
                   }
                   if (Integer.parseInt(line) < min){
                       min = Integer.parseInt(line);
                   }
                }
                System.out.println(max);
                System.out.println(min);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}





