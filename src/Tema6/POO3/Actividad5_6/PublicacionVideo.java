package Tema6.POO3.Actividad5_6;

public class PublicacionVideo implements IPublicacionConReaccion, IAbrirPublicacion {
    // Atributos
    private int duracionSegundos;
    private String calidad;

    // Constantes (defaults)
    private final int DEFAULT_DURACION = 30;
    private final String DEFAULT_CALIDAD = "1080p";

    // Constructor
    public PublicacionVideo(int duracionSegundos, String calidad) {
        this.duracionSegundos = duracionSegundos;
        this.calidad = calidad;
    }

    // Constructor vacío
    public PublicacionVideo() {
        this.duracionSegundos = DEFAULT_DURACION;
        this.calidad = DEFAULT_CALIDAD;
    }

    // Metodos
    @Override
    public void publicar() {
        System.out.println("Subiendo video en " + calidad);
    }

    @Override
    public void compartir() {
        System.out.println("Enviando enlace del video...");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("Nuevo comentario en el video: " + texto);
    }

    @Override
    public void abrir() {
        System.out.println("Iniciando reproducción del video...");
    }

    // Setters y Getters
    public int getDuracionSegundos() { return duracionSegundos; }

    public void setDuracionSegundos(int duracionSegundos) { this.duracionSegundos = duracionSegundos; }

    public String getCalidad() { return calidad; }

    public void setCalidad(String calidad) { this.calidad = calidad; }

    // ToString
    @Override
    public String toString() {
        return "[VIDEO] " + calidad + " | " + duracionSegundos + "s";
    }
}
