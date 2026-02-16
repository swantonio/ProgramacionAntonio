package Tema6.POO3;
enum tipoTurismo {
    PROFESIONAL,PARTICULAR
}
public class Turismo extends Vehiculo {
    private final int plazas;
    private final tipoTurismo tipo;

    public Turismo (int anio, String marca, String modelo, int plazas, tipoTurismo tipo) {
        super(marca, modelo, anio);
        this.plazas = plazas;
        this.tipo = tipo;
    }
    public Turismo () {
        this.plazas = 1;
        this.tipo = tipoTurismo.PROFESIONAL;
    }
}
