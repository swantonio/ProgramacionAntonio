package Tema6.POO3.Actividad2;

public class Pulpo extends Animal {
    // Atributos
    private int capacidadTinta;
    // Constantes (defaults)
    private int DEFAULT_TINTA = 100;
    // Constructor
    public Pulpo (String nombre, String raza, int edad, int capacidadTinta) {
        super(edad, raza, nombre);
        this.capacidadTinta = capacidadTinta;
    }

    // Constructor vacío
    public Pulpo () {
        super();
        this.capacidadTinta = DEFAULT_TINTA;
    }
    // Metodos
    public void soltarTinta () {
        if (capacidadTinta > 20) {
            System.out.println(nombre + " dispara un chorro de tinta");
            capacidadTinta -= 20;
        } else {
            System.out.println(nombre + " no tiene la tinta suficiente");
        }
    }

    @Override
    public void hacerRuido() {
        System.out.println("Plop Plop");
    }

    // Setters y Getters
    public int getCapacidadTinta() {
        return capacidadTinta;
    }

    public void setCapacidadTinta(int capacidadTinta) {
        this.capacidadTinta = capacidadTinta;
    }
    // ToString

    @Override
    public String toString() {
        return "Pulpo" + " [" + super.toString() + "Capacidad tinta: " + capacidadTinta + "] ";
    }
}
