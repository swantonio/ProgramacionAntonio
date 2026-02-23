package Tema6.POO3.Actividad4;

public class Revista extends Ficha {
    // Atributos
    private int nroPublicacion;
    private int anio;

    // Constantes (defaults)
    private final int DEFAULT_NRO = 1;
    private final int DEFAULT_ANIO = 2024;

    // Constructor
    public Revista(int numero, String titulo, int nroPublicacion, int anio) {
        super(numero, titulo);
        this.nroPublicacion = nroPublicacion;
        this.anio = anio;
    }

    // Constructor vacío
    public Revista() {
        super();
        this.nroPublicacion = DEFAULT_NRO;
        this.anio = DEFAULT_ANIO;
    }

    // Metodos
    public void ojearRevista() {
        System.out.println("Hojeando la revista '" + titulo + "' edición nº " + nroPublicacion);
    }

    public void mostrarAntiguedad() {
        int antiguedad = 2026 - anio;
        System.out.println("Esta revista tiene " + antiguedad + " años de antigüedad.");
    }

    // Setters y Getters
    public int getNroPublicacion() { return nroPublicacion; }
    public void setNroPublicacion(int nroPublicacion) { this.nroPublicacion = nroPublicacion; }

    public int getAnio() { return anio; }
    public void setAnio(int anio) { this.anio = anio; }

    // ToString
    @Override
    public String toString() {
        return "[REVISTA] " + super.toString() + " | Edición: " + nroPublicacion + " | Año: " + anio;
    }
}
