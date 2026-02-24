package Tema6.POO3;

enum TipoDVD {
    ANIMACION, ACCION, DOCUMENTAL, CIENCIA_FICCION
}

public class DVD extends Ficha {
    // Atributos
    private String director;
    private int anio;
    private TipoDVD tipo;

    // Constantes (defaults)
    private final String DEFAULT_DIRECTOR = "Desconocido";
    private final int DEFAULT_ANIO = 2000;
    private final TipoDVD DEFAULT_TIPO = TipoDVD.ACCION;

    // Constructor
    public DVD(int numero, String titulo, String director, int anio, TipoDVD tipo) {
        super(numero, titulo);
        this.director = director;
        this.anio = anio;
        this.tipo = tipo;
    }

    // Constructor vacío
    public DVD() {
        super();
        this.director = DEFAULT_DIRECTOR;
        this.anio = DEFAULT_ANIO;
        this.tipo = DEFAULT_TIPO;
    }

    // Metodos
    public void reproducir() {
        System.out.println("Reproduciendo el DVD: " + titulo + " (Género: " + tipo + ")");
    }

    public void mostrarCreditos() {
        System.out.println("Director: " + director + " | Año de estreno: " + anio);
    }

    // Setters y Getters
    public String getDirector() { return director; }

    public void setDirector(String director) { this.director = director; }

    public int getAnio() { return anio; }

    public void setAnio(int anio) { this.anio = anio; }

    public TipoDVD getTipo() { return tipo; }

    public void setTipo(TipoDVD tipo) { this.tipo = tipo; }

    // ToString
    @Override
    public String toString() {
        return "[DVD] " + super.toString() + " | Director: " + director + " | Año: " + anio + " | Género: " + tipo;
    }
}
