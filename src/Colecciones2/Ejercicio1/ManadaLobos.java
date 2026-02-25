package Colecciones2.Ejercicio1;

public class ManadaLobos extends Avistamiento {
    // Atributos
    private int numeroLobos;
    private String observaciones;

    // Constantes (defaults)
    private final int DEFAULT_NUM = 1;

    // Constructor
    public ManadaLobos(int hora, int numeroLobos, String observaciones) {
        super(hora);
        this.numeroLobos = numeroLobos;
        this.observaciones = observaciones;
    }

    // Constructor vacío
    public ManadaLobos() {
        super();
        this.numeroLobos = DEFAULT_NUM;
        this.observaciones = "Ninguna";
    }

    // Setters y Getters
    public int getNumeroLobos() { return numeroLobos; }
    public void setNumeroLobos(int numeroLobos) { this.numeroLobos = numeroLobos; }
    public String getObservaciones() { return observaciones; }
    public void setObservaciones(String observaciones) { this.observaciones = observaciones; }

    // ToString
    @Override
    public String toString() {
        return "[LOBOS] " + super.toString() + " | Cantidad: " + numeroLobos + " | Obs: " + observaciones;
    }
}
