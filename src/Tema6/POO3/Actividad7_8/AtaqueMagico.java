package Tema6.POO3.Actividad7_8;

public class AtaqueMagico implements IAtaque {
    // Atributos
    private String hechizo;
    private int inteligencia;

    // Constantes (defaults)
    private final String DEFAULT_HECHIZO = "Chispa";
    private final int DEFAULT_INT = 15;

    // Constructor
    public AtaqueMagico(String hechizo, int inteligencia) {
        this.hechizo = hechizo;
        this.inteligencia = inteligencia;
    }

    // Constructor vacío
    public AtaqueMagico() {
        this.hechizo = DEFAULT_HECHIZO;
        this.inteligencia = DEFAULT_INT;
    }

    // Metodos
    @Override
    public void lanzar() {
        System.out.println("Se conjura el ataque mágico: " + hechizo + "!");
    }

    @Override
    public double coste() {
        // El coste mágico es el maná consumido
        return inteligencia * 1.2;
    }

    @Override
    public int dañoInfligido() {
        return inteligencia * 2;
    }

    // Setters y Getters
    public String getHechizo() { return hechizo; }
    public void setHechizo(String hechizo) { this.hechizo = hechizo; }

    public int getInteligencia() { return inteligencia; }
    public void setInteligencia(int inteligencia) { this.inteligencia = inteligencia; }

    // ToString
    @Override
    public String toString() {
        return "[MAGICO] " + hechizo + " | Daño: " + dañoInfligido() + " | Mana: " + coste();
    }
}
