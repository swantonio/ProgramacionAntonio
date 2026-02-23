package Tema6.POO3;

public class Ficha {
    // Atributos
    protected int numero;
    protected String titulo;

    // Constantes (defaults)
    private final int DEFAULT_NUMERO = 0;
    private final String DEFAULT_TITULO = "Sin título";

    // Constructor
    public Ficha(int numero, String titulo) {
        this.numero = numero;
        this.titulo = titulo;
    }

    // Constructor vacío
    public Ficha() {
        this.numero = DEFAULT_NUMERO;
        this.titulo = DEFAULT_TITULO;
    }

    // Metodos
    public void mostrarInfoBasica() {
        System.out.println("Ficha técnica - ID: " + numero + " | Nombre: " + titulo);
    }

    public void verificarEstado() {
        System.out.println("Verificando integridad física de la ficha nº " + numero + "...");
    }

    // Setters y Getters
    public int getNumero() { return numero; }
    public void setNumero(int numero) { this.numero = numero; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    // ToString
    @Override
    public String toString() {
        return "Nº: " + numero + " - Título: " + titulo;
    }
}