package Tema7.EjSerializacion;

import java.io.*;


public class Ejercicio5 {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("persona.dat");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            System.out.println("Leyendo fichero binario");
            Persona persona = (Persona) ois.readObject();
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
