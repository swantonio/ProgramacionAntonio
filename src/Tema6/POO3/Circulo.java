package Tema6.POO3;

public class Circulo extends Figura2D {
    // Atributos
    private double radio;

    // Constantes (defaults)
    private final double DEFAULT_RADIO = 1.0;

    // Constructor
    public Circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    // Constructor vacío
    public Circulo() {
        super();
        this.radio = DEFAULT_RADIO;
    }

    // Métodos

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    // Setters y Getters

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // ToString

    @Override
    public String toString() {
        return nombre + " [" + super.toString() + " Radio: " + radio + " Cm]";
    }
}