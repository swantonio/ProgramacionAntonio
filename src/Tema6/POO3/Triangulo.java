package Tema6.POO3;

public class Triangulo extends Figura2D {
    // Atributos
    private double lado1;
    private double lado2;
    private double base;

    // Constantes (defaults)
    private final double DEFAULT_LADO1 = 5;
    private final double DEFAULT_LADO2 = 5;
    private final double DEFAULT_BASE = 4;

    // Constructor
    public Triangulo(String nombre, double lado1, double lado2, double base) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.base = base;
    }

    // Constructor vacío
    public Triangulo() {
        super();
        this.lado1 = DEFAULT_LADO1;
        this.lado2 = DEFAULT_LADO2;
        this.base = DEFAULT_BASE;
    }

    // Métodos

    @Override
    public double area() {
        double semiperimetro = perimetro() / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - base));
    }

    @Override
    public double perimetro() {
        return lado1 + lado2 + base;
    }

    // Setters y Getters

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    // ToString

    @Override
    public String toString() {
        return nombre + " [" + super.toString() + "Cm lado 1: " + lado1 + " Cm lado 2: " + lado2 + " Cm base: " + base + "]";
    }
}