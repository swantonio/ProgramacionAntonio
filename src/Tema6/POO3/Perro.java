package Tema6.POO3;

public class Perro extends Animal {
    // Atributos
    private int pedigree;
    // Constantes (defaults)
    private final int PEDIGREE_DEFAULT = 5000;
    // Constructor
    public Perro (String nombre, String raza, int edad, int pedigree) {
        super(edad, raza, nombre);
        this.pedigree = pedigree;
    }
    // Constructor vacío
    public Perro () {
        super();
        this.pedigree = PEDIGREE_DEFAULT;
    }
    // Metodos

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " ladra");
    }

    public void traerPelota() {
        System.out.println(nombre + " trae la pelota");
    }
    // Setters y Getters

    public int getPedigree() {
        return pedigree;
    }

    public void setPedigree(int pedigree) {
        this.pedigree = pedigree;
    }
    // ToString

    @Override
    public String toString() {
        return "Perro" + " [" + super.toString() + "NºPedigree:" + pedigree + "] ";
    }
}
