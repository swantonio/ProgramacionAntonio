package Colecciones2.Ejercicio1;

public class Pajaro extends Avistamiento {
    // Atributos
    private double peso;
    private String especie;

    // Constantes (defaults)
    private final double DEFAULT_PESO = 0.1;

    // Constructor
    public Pajaro(int hora, double peso, String especie) {
        super(hora);
        this.peso = peso;
        this.especie = especie;
    }

    // Constructor vacío
    public Pajaro() {
        super();
        this.peso = DEFAULT_PESO;
        this.especie = "Desconocida";
    }

    // Setters y Getters
    public double getPeso() { return peso; }
    public void setPeso(double peso) { this.peso = peso; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    // ToString
    @Override
    public String toString() {
        return "[PÁJARO] " + super.toString() + " | Especie: " + especie + " | Peso: " + peso + "kg";
    }
}