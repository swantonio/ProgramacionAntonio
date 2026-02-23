package Tema6.POO3.Actividad1;
enum tipoTurismo {
    PROFESIONAL,PARTICULAR
}
public class Turismo extends Vehiculo {
    private int plazas;
    private tipoTurismo tipo;

    private final int PLAZAS_DEFAULT = 1;
    private final tipoTurismo TIPO_DEFAULT = tipoTurismo.PARTICULAR;

    public Turismo (int anio, String marca, String modelo, int plazas, tipoTurismo tipo) {
        super(marca, modelo, anio);
        this.plazas = plazas;
        this.tipo = tipo;
    }
    public Turismo () {
        super();
        this.plazas = PLAZAS_DEFAULT;
        this.tipo = TIPO_DEFAULT;
    }

    public int getPlazas() {
        return plazas;
    }

    public tipoTurismo getTipo() {
        return tipo;
    }

    public int getPLAZAS_DEFAULT() {
        return PLAZAS_DEFAULT;
    }

    public tipoTurismo getTIPO_DEFAULT() {
        return TIPO_DEFAULT;
    }

    public void setTipo(tipoTurismo tipo) {
        this.tipo = tipo;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }

    @Override
    public String toString() {
        return super.toString() + " | Turismo (" + " tipo " + tipo + " plazas " + plazas + " )";
    }
}
