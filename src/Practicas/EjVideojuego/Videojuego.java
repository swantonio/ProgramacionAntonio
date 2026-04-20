package Practicas.EjVideojuego;

import java.io.Serializable;

public abstract class Videojuego implements Serializable {
    // Atributos
    protected String tittle;
    protected String platform;
    protected int note;

    // Constantes (defaults)
    protected final String TITTLE_DEFAULT = "Doom";
    protected final String PLATFORM_DEFAULT = "PS5";
    protected final int NOTE_DEFAULT = 10;

    // Constructor
    public Videojuego(String tittle, String platform, int note) {
        this.tittle = tittle;
        this.platform = platform;
        this.note = note;
    }

    // Constructor vacío
    public Videojuego() {
        this.tittle = TITTLE_DEFAULT;
        this.platform = PLATFORM_DEFAULT;
        this.note = NOTE_DEFAULT;
    }

    // Metodos
    public abstract String getTipo();

    public static void validarNota(double nota) throws Excepciones.InvalidNoteException {
        if (nota < 0 || nota > 10) {
            throw new Excepciones.InvalidNoteException("La nota debe estar entre 0 y 10.");
        }
    }

    // Setters y Getters

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    // ToString

    @Override
    public String toString() {
        return "=== " + getTipo().toUpperCase() + " ===\n" +
                "Título: " + tittle + "\n" +
                "Plataforma: " + platform + "\n" +
                "Nota: " + note + "/10\n";
    }
}
