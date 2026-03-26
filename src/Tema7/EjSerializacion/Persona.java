package Tema7.EjSerializacion;

import java.io.Serializable;

public class Persona implements Serializable {
    private String nombre;
    private int edad;

    private final String NOMBRE_DEFAULT = "Pabit";
    private final int EDAD_DEFAULT = 20;

    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona () {
        this.nombre = NOMBRE_DEFAULT;
        this.edad = EDAD_DEFAULT;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
