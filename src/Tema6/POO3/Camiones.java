package Tema6.POO3;

public class Camiones extends Vehiculo {
    private int pesoMaximo;
    private boolean mercanciaPeligrosa;

    private final int PESOMAXIMO_DEFAULT = 5;
    private final boolean MERCAPELIGROSA_DEFAULT = true;

    public Camiones(String marca, String modelo, int anio, int pesoMaximo, boolean mercanciaPeligrosa) {
        super(marca, modelo, anio);
        this.pesoMaximo = pesoMaximo;
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    public Camiones() {
        super();
        this.pesoMaximo = PESOMAXIMO_DEFAULT;
        this.mercanciaPeligrosa = MERCAPELIGROSA_DEFAULT;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    public boolean isMercanciaPeligrosa() {
        return mercanciaPeligrosa;
    }

    public void setPesoMaximo(int pesoMaximo) {
        this.pesoMaximo = pesoMaximo;
    }

    public void setMercanciaPeligrosa(boolean mercanciaPeligrosa) {
        this.mercanciaPeligrosa = mercanciaPeligrosa;
    }

    @Override
    public String toString() {
        return super.toString() + " | Camión (" + pesoMaximo + " peso, mercancia peligrosa: " + mercanciaPeligrosa + ")";
    }
}

