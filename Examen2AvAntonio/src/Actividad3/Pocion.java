package Actividad3;

public class Pocion extends Articulo {
    int nivel;

    public static final int DEFAULT_NIVEL = 1;
    String [] efectos = {"cura" , "veneno" , "electricidad"};

    public Pocion (String nombre, boolean gratis, int nivel) {
        super(nombre, gratis);
        this.nivel = nivel;
    }

    public Pocion () {
        this.nivel = DEFAULT_NIVEL;
    }
    @Override
    public int precioArticulo(int precio) {
        precio = 5 * nivel;
        return precio;
    }

    @Override
    public void tipoArticulo () {

    }

    public String[] getEfectos() {
        return efectos;
    }

    public void setEfectos(String[] efectos) {
        this.efectos = efectos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + nivel;
    }
}
