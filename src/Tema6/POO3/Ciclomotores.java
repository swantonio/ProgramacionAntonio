package Tema6.POO3;

public class Ciclomotores extends Vehiculo{
    int cilindrada;
    boolean necesitaCarnet;

    public Ciclomotores (int anio, String modelo, String marca, int cilindrada) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
    }
    public Ciclomotores () {
        this.cilindrada = 125;
    }
    public boolean necesitaCarnet (int cilindrada) {
        necesitaCarnet = cilindrada > 125;
        return necesitaCarnet;
    }
}
