package Tema6.POO3.Actividad2;

public class Murcielago extends Animal {
    // Atributos
    private double envergaduraAlar;
    // Constantes (defaults)
    private final double ENVERGADURA_DEFAULT = 20;
    // Constructor
    public Murcielago (String nombre, String raza, int edad, double envergaduraAlar) {
        super(edad, raza, nombre);
        this.envergaduraAlar = envergaduraAlar;
    }
    // Constructor vacío
    public Murcielago () {
        super();
        this.envergaduraAlar = ENVERGADURA_DEFAULT;
    }
    // Metodos

    @Override
    public void hacerRuido() {
        System.out.println(nombre + " emite un chillido agudo");
    }

    public void entrarEnHibernacion () {
        System.out.println(nombre + " entra en hibernacion");
    }

    // Setters y Getters

    public double getEnvergaduraAlar() {
        return envergaduraAlar;
    }

    public void setEnvergaduraAlar(double envergaduraAlar) {
        this.envergaduraAlar = envergaduraAlar;
    }

    // ToString
    @Override
    public String toString() {
        return "Murcielago" + " [" + super.toString() + "Envergadura alar: " + envergaduraAlar + "] ";
    }
}
