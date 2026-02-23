package Tema6.POO3;

public class Rectangulo extends Figura2D {
    // Atributos
    private double base;
    private double altura;
    // Constantes (defaults)
    private final double DEFAULT_BASE = 4;
    private final double DEFAULT_ALTURA = 2;
    // Constructor
    public Rectangulo (String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }
    // Constructor vacío
    public Rectangulo () {
        super();
        this.base = DEFAULT_BASE;
        this.altura = DEFAULT_ALTURA;
    }
    // Metodos

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base * altura);
    }

    // Setters y Getters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
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
        return nombre + " [" + super.toString() + " Cm base: " + base + " Cm altura: " + altura + "] ";
    }
}
