package Colecciones2.Ejercicio1;

public class Serpiente extends Avistamiento {
    // Atributos
    private double longitud;
    private String especie;

    // Constantes (defaults)
    private final double DEFAULT_LONGITUD = 0.5;
    private final String DEFAULT_ESPECIE = "Común";

    // Constructor
    public Serpiente(int hora, double longitud, String especie) {
        super(hora);
        this.longitud = longitud;
        this.especie = especie;
    }

    // Constructor vacío
    public Serpiente() {
        super();
        this.longitud = DEFAULT_LONGITUD;
        this.especie = DEFAULT_ESPECIE;
    }

    // Setters y Getters
    public double getLongitud() { return longitud; }
    public void setLongitud(double longitud) { this.longitud = longitud; }
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }

    // ToString
    @Override
    public String toString() {
        return "[SERPIENTE] " + super.toString() + " | Especie: " + especie + " | Longitud: " + longitud + "m";
    }
}
