package Tema6.POO3.Actividad4;

public class Libro extends Ficha {
    // Atributos
    private String autor;
    private String editorial;

    // Constantes (defaults)
    private final String DEFAULT_AUTOR = "Anónimo";
    private final String DEFAULT_EDITORIAL = "Genérica";

    // Constructor
    public Libro(int numero, String titulo, String autor, String editorial) {
        super(numero, titulo);
        this.autor = autor;
        this.editorial = editorial;
    }

    // Constructor vacío
    public Libro() {
        super();
        this.autor = DEFAULT_AUTOR;
        this.editorial = DEFAULT_EDITORIAL;
    }

    // Metodos
    public void abrirLibro() {
        System.out.println("Abriendo el libro '" + titulo + "' de " + autor + "...");
    }

    public void citarAPA() {
        System.out.println("Cita APA: " + autor + ". " + titulo + ". Editorial " + editorial + ".");
    }

    // Setters y Getters
    public String getAutor() { return autor; }

    public void setAutor(String autor) { this.autor = autor; }

    public String getEditorial() { return editorial; }

    public void setEditorial(String editorial) { this.editorial = editorial; }

    // ToString
    @Override
    public String toString() {
        return "[LIBRO] " + super.toString() + " | Autor: " + autor + " | Editorial: " + editorial;
    }
}