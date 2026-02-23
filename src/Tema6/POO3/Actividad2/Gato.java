package Tema6.POO3.Actividad2;

public class Gato extends Animal {
    // Atributos
    private int vidas;
    // Constantes (defaults)
    private final int VIDAS_DEFAULT = 7;
    // Constructor
    public Gato (String nombre, int edad, String raza, int vidas) {
        super(edad, raza, nombre);
        this.vidas = vidas;
    }
    // Constructor vacío
    public Gato () {
        super();
        this.vidas = VIDAS_DEFAULT;
    }

    // Metodos
    @Override
    public void hacerRuido () {
        System.out.println(nombre + " maulla y ronronea");
    }

    public void cazaPresasImaginarias () {
        System.out.println(nombre + " caza therians como el pabit");
    }

    public void vidasGato () {
        System.out.println(nombre + " tiene: " + vidas);
    }

    // Setters y Getters

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    // ToString

    @Override
    public String toString() {
        return "Gato" + " [" + super.toString() + " Vidas: " + vidas + "] ";
    }
}
