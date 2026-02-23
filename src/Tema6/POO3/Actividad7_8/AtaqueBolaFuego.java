package Tema6.POO3.Actividad7_8;

public class AtaqueBolaFuego implements IAtaqueAvanzado {
    // Atributos
    private String nombre;
    private int potenciaMagica;

    // Constantes (defaults)
    private final String DEFAULT_NOMBRE = "Bola de Fuego";
    private final int DEFAULT_POTENCIA = 50;

    // Constructor
    public AtaqueBolaFuego(String nombre, int potenciaMagica) {
        this.nombre = nombre;
        this.potenciaMagica = potenciaMagica;
    }

    // Constructor vacío
    public AtaqueBolaFuego() {
        this.nombre = DEFAULT_NOMBRE;
        this.potenciaMagica = DEFAULT_POTENCIA;
    }

    // Metodos
    @Override
    public void lanzar() {
        System.out.println("¡" + nombre + " lanzada!");
    }

    @Override
    public double[] coste() {
        // [Físico, Maná] -> Casi todo maná
        return new double[]{2.0, potenciaMagica * 1.5};
    }

    @Override
    public int[] danioInfligido() {
        return new int[]{0, potenciaMagica};
    }

    // Setters y Getters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPotenciaMagica() {
        return potenciaMagica;
    }

    public void setPotenciaMagica(int potenciaMagica) {
        this.potenciaMagica = potenciaMagica;
    }

    // ToString
    @Override
    public String toString() {
        return "[MAGIA] " + nombre + " | Daño Mágico: " + this.danioInfligido()[1];
    }
}
