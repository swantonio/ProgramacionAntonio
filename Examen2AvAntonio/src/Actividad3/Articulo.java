package Actividad3;

public abstract class Articulo {
    protected String nombre;
    protected boolean gratis;

    protected final String DEFAULT_NOMBRE = "hola";
    protected final boolean DEFAULT_GRATIS = true;

    public Articulo (String nombre, boolean gratis) {
        this.nombre = nombre;
        this.gratis = gratis;
    }

    public Articulo () {
        this.nombre = DEFAULT_NOMBRE;
        this.gratis = DEFAULT_GRATIS;
    }

    public abstract void tipoArticulo ();
    public abstract int precioArticulo (int precio);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isGratis() {
        return gratis;
    }

    public void setGratis(boolean gratis) {
        this.gratis = gratis;
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "gratis=" + gratis +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
