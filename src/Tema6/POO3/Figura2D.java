package Tema6.POO3;

public abstract class Figura2D {
    // Atributos
    protected String nombre;
    // Constantes (defaults)
    protected String DEFAULT_NOMBRE = "Figura";
    // Constructor
    public Figura2D (String nombre) {
        this.nombre = nombre;
    }
    // Constructor vacío
    public Figura2D () {
        this.nombre = DEFAULT_NOMBRE;
    }
    // Metodos
    public abstract double area ();
    public abstract double perimetro ();
    // Setters y Getters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // ToString
    @Override
    public String toString() {
        return "Nombre: " + nombre ;
    }
}
