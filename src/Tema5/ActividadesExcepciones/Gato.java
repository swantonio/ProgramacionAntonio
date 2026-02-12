package Tema5.ActividadesExcepciones;

public class Gato {
    private String nombre;
    private int edad;

    public Gato() {
        this.nombre = "Juanito";
        this.edad = 7;
    }

    public Gato(String nombre, int edad) throws Exception {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void setNombre(String nombre) throws Exception {
        if (nombre.length() < 3) {
            throw new Exception("Error: El nombre debe tener al menos 3 caracteres.");
        }
        this.nombre = nombre;
    }
    public void setEdad(int edad) throws Exception {
        if (edad < 0) {
            throw new Exception("Error: La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String toString() {
        return "Gato [Nombre=" + nombre + ", Edad=" + edad + "]";
    }
}