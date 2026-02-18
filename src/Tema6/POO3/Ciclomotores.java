package Tema6.POO3;

public class Ciclomotores extends Vehiculo{
    private int cilindrada;

    private final int CILINDRADA_DEFAULT = 125;

    public Ciclomotores (int anio, String modelo, String marca, int cilindrada, boolean necesitaCarnet) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }

    public Ciclomotores () {
        super();
        this.cilindrada = CILINDRADA_DEFAULT;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    public boolean necesitaCarnet () {
        return cilindrada >= 125;
    }

    @Override
    public String toString() {
        return super.toString() + " | Ciclomotor (Cilindrada: " + cilindrada + ")";
    }
}
