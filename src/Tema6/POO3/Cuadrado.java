package Tema6.POO3;

public class Cuadrado extends Figura2D {
    // Atributos
    private double lado;
    // Constantes (defaults)
    private final double LADO_DEFAULT = 4;
    // Constructor
    public Cuadrado (String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }
    // Constructor vacío
    public Cuadrado () {
        super();
        this.lado = LADO_DEFAULT;
    }
    // Metodos

    @Override
    public double perimetro() {
        return lado * lado;
    }

    @Override
    public double area() {
        return (lado * lado) * 2;
    }

    // Setters y Getters

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    // ToString

    @Override
    public String toString() {
        return nombre + " [" + super.toString() + " Cm lado: " + lado + "] ";
    }
}
