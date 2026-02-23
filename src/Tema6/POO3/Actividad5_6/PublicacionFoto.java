package Tema6.POO3.Actividad5_6;

public class PublicacionFoto implements IPublicacionConReaccion, IAbrirPublicacion {
    // Atributos
    private String filtro;
    private double tamañoMB;

    // Constantes (defaults)
    private final String DEFAULT_FILTRO = "Normal";
    private final double DEFAULT_TAM = 1.5;

    // Constructor
    public PublicacionFoto(String filtro, double tamañoMB) {
        this.filtro = filtro;
        this.tamañoMB = tamañoMB;
    }

    // Constructor vacío
    public PublicacionFoto() {
        this.filtro = DEFAULT_FILTRO;
        this.tamañoMB = DEFAULT_TAM;
    }

    // Metodos
    @Override
    public void publicar() {
        System.out.println("Publicando foto con filtro " + filtro);
    }

    @Override
    public void compartir() {
        System.out.println("Compartiendo imagen de " + tamañoMB + " MB");
    }

    @Override
    public void comentar(String texto) {
        System.out.println("Nuevo comentario en la foto: " + texto);
    }

    @Override
    public void abrir() {
        System.out.println("Abriendo imagen en alta resolución...");
    }

    // Setters y Getters
    public String getFiltro() { return filtro; }
    public void setFiltro(String filtro) { this.filtro = filtro; }
    public double getTamanioMB() { return tamañoMB; }
    public void setTamanioMB(double tamañoMB) { this.tamañoMB = tamañoMB; }

    // ToString
    @Override
    public String toString() {
        return "[FOTO] Filtro: " + filtro + " | " + tamañoMB + "MB";
    }
}