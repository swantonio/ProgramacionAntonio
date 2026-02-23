package Tema6.POO3.Actividad1;

public class Vehiculo {
        protected String marca;
        protected String modelo;
        protected int anio;

        protected final String MARCA_DEFAULT = "Ford";
        protected final String MODELO_DEFAULT = "Focus";
        protected final int ANIO_DEFAULT = 1990;

        public Vehiculo(String marca, String modelo, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        public Vehiculo() {
            this.anio = ANIO_DEFAULT;
            this.marca = MARCA_DEFAULT;
            this.modelo = MODELO_DEFAULT;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getMARCA_DEFAULT() {
        return MARCA_DEFAULT;
    }

    public String getMODELO_DEFAULT() {
        return MODELO_DEFAULT;
    }

    public int getANIO_DEFAULT() {
        return ANIO_DEFAULT;
    }

    @Override
    public String toString() {
        return "Vehiculo: " + anio + " " + modelo +  " " + marca;
    }
}
