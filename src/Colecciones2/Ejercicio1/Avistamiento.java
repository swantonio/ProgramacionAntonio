package Colecciones2.Ejercicio1;

public class Avistamiento {
    // Atributos
    protected int hora;

    // Constantes (defaults)
    private final int DEFAULT_HORA = 12;

    // Constructor
    public Avistamiento(int hora) {
        this.hora = hora;
    }

    // Constructor vacío
    public Avistamiento() {
        this.hora = DEFAULT_HORA;
    }

    // Metodos

    // Setters y Getters
    public int getHora() { return hora; }
    public void setHora(int hora) { this.hora = hora; }

    // ToString
    @Override
    public String toString() {
        return "Hora: " + hora + "h";
    }
}
