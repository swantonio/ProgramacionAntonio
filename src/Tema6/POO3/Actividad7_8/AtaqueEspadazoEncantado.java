package Tema6.POO3.Actividad7_8;

    public class AtaqueEspadazoEncantado implements IAtaqueAvanzado {
        // Atributos
        private String nombre;
        private int fuerza;
        private int magia;

        // Constantes (defaults)
        private final String DEFAULT_NOMBRE = "Filo Arcano";
        private final int DEFAULT_FUERZA = 25;
        private final int DEFAULT_MAGIA = 20;

        // Constructor
        public AtaqueEspadazoEncantado(String nombre, int fuerza, int magia) {
            this.nombre = nombre;
            this.fuerza = fuerza;
            this.magia = magia;
        }

        // Constructor vacío
        public AtaqueEspadazoEncantado() {
            this.nombre = DEFAULT_NOMBRE;
            this.fuerza = DEFAULT_FUERZA;
            this.magia = DEFAULT_MAGIA;
        }

        // Metodos
        @Override
        public void lanzar() {
            System.out.println("¡" + nombre + "! El acero brilla con energía azul.");
        }

        @Override
        public double[] coste() {
            return new double[]{fuerza * 0.5, magia * 1.0};
        }

        @Override
        public int[] danioInfligido() {
            return new int[]{fuerza, magia};
        }

        // Setters y Getters
        public String getNombre() { return nombre; }
        public void setNombre(String nombre) { this.nombre = nombre; }
        public int getFuerza() { return fuerza; }
        public void setFuerza(int fuerza) { this.fuerza = fuerza; }
        public int getMagia() { return magia; }
        public void setMagia(int magia) { this.magia = magia; }

        // ToString
        @Override
        public String toString() {
            int[] danios = danioInfligido();
            return "[HIBRIDO] " + nombre + " | Daño F: " + danios[0] + " | Daño M: " + danios[1];
        }
    }
