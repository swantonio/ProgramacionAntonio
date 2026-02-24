package Tema6.POO3;

public class AtaqueEspadazo implements IAtaqueAvanzado {
    // Atributos
    private String nombre;
    private int fuerzaFisica;

    // Constantes (defaults)
    private final String DEFAULT_NOMBRE = "Tajo Vertical";
    private final int DEFAULT_FUERZA = 30;

    // Constructor
    public AtaqueEspadazo(String nombre, int fuerzaFisica) {
        this.nombre = nombre;
        this.fuerzaFisica = fuerzaFisica;
    }

    // Constructor vacío
    public AtaqueEspadazo() {
        this.nombre = DEFAULT_NOMBRE;
        this.fuerzaFisica = DEFAULT_FUERZA;
    }

    // Metodos
    @Override
    public void lanzar() {
        System.out.println("¡" + nombre + "! Un golpe seco de acero.");
    }

    @Override
    public double[] coste() {

        return new double[]{fuerzaFisica * 0.8, 0.0};
    }

    @Override
    public int[] danioInfligido() {
        return new int[]{fuerzaFisica, 0};
    }

    // Setters y Getters
    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getFuerzaFisica() { return fuerzaFisica; }

    public void setFuerzaFisica(int fuerzaFisica) { this.fuerzaFisica = fuerzaFisica; }

    // ToString
    @Override
    public String toString() {
        return "[FISICO] " + nombre + " | Daño Físico: " + danioInfligido()[0];
    }
}
