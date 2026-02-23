package Tema6.POO3.Actividad5_6;

public class PublicacionTexto implements IPublicacionConReaccion {
    // Atributos
    private String contenido;
    private String autor;

    // Constantes (defaults)
    private final String DEFAULT_TEXTO = "Post vacío";
    private final String DEFAULT_AUTOR = "Usuario";

    // Constructor
    public PublicacionTexto(String contenido, String autor) {
        this.contenido = contenido;
        this.autor = autor;
    }

    // Constructor vacío
    public PublicacionTexto() {
        this.contenido = DEFAULT_TEXTO;
        this.autor = DEFAULT_AUTOR;
    }

    // Metodos
    @Override
    public void publicar() {
        System.out.println(autor + " ha posteado: " + contenido);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo texto de " + autor + "...");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("Nuevo comentario en el texto: " + texto);
    }

    // Setters y Getters
    public String getContenido() { return contenido; }
    public void setContenido(String contenido) { this.contenido = contenido; }
    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    // ToString
    @Override
    public String toString() {
        return "[TEXTO] " + autor + ": " + contenido;
    }
}