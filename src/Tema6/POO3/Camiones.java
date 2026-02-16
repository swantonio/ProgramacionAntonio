package Tema6.POO3;

public class Camiones extends Vehiculo {
    private final int pesoMaximo;
    private final boolean mercanciaPeligrosa;

    public Camiones(String marca, String modelo, int anio, int pesoMaximo, boolean mercanciaPeligrosa) {
        super(marca, modelo, anio);
        this.pesoMaximo = pesoMaximo;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    public Camiones() {
        this.pesoMaximo = 1;
        this.mercanciaPeligrosa = true;
    }
}

