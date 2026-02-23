package Tema6.POO3;

public class AtaqueMagicoYFisico implements IAtaque {
    // Atributos
    private String tecnica;
    private int fuerza;
    private int inteligencia;

    // Constantes (defaults)
    private final String DEFAULT_TECNICA = "Hoja Rúnica";
    private final int DEFAULT_FUERZA = 8;
    private final int DEFAULT_INT = 8;

    // Constructor
    public AtaqueMagicoYFisico(String tecnica, int fuerza, int inteligencia) {
        this.tecnica = tecnica;
        this.fuerza = fuerza;
        this.inteligencia = inteligencia;
    }

    // Constructor vacío
    public AtaqueMagicoYFisico() {
        this.tecnica = DEFAULT_TECNICA;
        this.fuerza = DEFAULT_FUERZA;
        this.inteligencia = DEFAULT_INT;
    }

    // Metodos
    @Override
    public void lanzar() {
        System.out.println("Se ejecuta la técnica híbrida: " + tecnica + "!");
    }

    @Override
    public double coste() {
        // Combina ambos costes
        return (fuerza * 0.3) + (inteligencia * 0.8);
    }

    @Override
    public int dañoInfligido() {
        return fuerza + inteligencia;
    }

    // Setters y Getters
    public String getTecnica() { return tecnica; }

    public void setTecnica(String tecnica) { this.tecnica = tecnica; }

    public int getFuerza() { return fuerza; }

    public void setFuerza(int fuerza) { this.fuerza = fuerza; }

    public int getInteligencia() { return inteligencia; }

    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    // ToString
    @Override
    public String toString() {
        return "[HIBRIDO] " + tecnica + " | Daño total: " + dañoInfligido() + " | Coste total: " + coste();
    }
}
