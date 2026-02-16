package Tema6.POO3;

public class Vehiculo {
        protected String marca;
        protected String modelo;
        protected int anio;

        public Vehiculo(String marca, String modelo, int anio) {
            this.marca = marca;
            this.modelo = modelo;
            this.anio = anio;
        }

        public Vehiculo() {
            this.anio = 1990;
            this.marca = "Ford";
            this.modelo = "Focus";
    }
}
