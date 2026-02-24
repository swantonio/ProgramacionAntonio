package Tema6.POO3;

public class AtaqueFisico implements IAtaque {
    // Atributos
    private String nombre;
    private int fuerza;

    // Constantes (defaults)
    private final String DEFAULT_NOMBRE = "Golpe básico";
    private final int DEFAULT_FUERZA = 10;

    // Constructor
    public AtaqueFisico(String nombre, int fuerza) {
        this.nombre = nombre;
        this.fuerza = fuerza;
    }

    // Constructor vacío
    public AtaqueFisico() {
        this.nombre = DEFAULT_NOMBRE;
        this.fuerza = DEFAULT_FUERZA;
    }

    // Metodos
    @Override
    public void lanzar() {
        System.out.println("Se lanza el ataque físico: " + nombre + "!");
    }

    @Override
    public double coste() {
        // El coste físico podría ser el cansancio (stamina)
        return fuerza * 0.5;
    }

    @Override
    public int dañoInfligido() {
        return fuerza;
    }

    // Setters y Getters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getFuerza() { return fuerza; }
    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    // ToString
    @Override
    public String toString() {
        return "[FISICO] " + nombre + " | Daño: " + dañoInfligido() + " | Coste: " + coste();
    }
}
