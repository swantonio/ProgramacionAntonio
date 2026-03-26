package Tema7.EjSerializacion;

import java.io.*;

public class Ejercicio4 {
    public static void main(String[] args) {
        Persona Antonio = new Persona("Antonio", 23);
        try (FileOutputStream fos = new FileOutputStream("persona.dat");
             ObjectOutputStream salida = new ObjectOutputStream(fos)) {
            salida.writeObject(Antonio);
            System.out.println("Objeto serializado");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

