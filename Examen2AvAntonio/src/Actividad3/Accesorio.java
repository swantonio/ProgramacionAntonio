package Actividad3;

public class Accesorio extends Articulo{
    String nombreAccesorio;

    public static final String NOMBRE_DEFAULT = "Cuerda";

    public Accesorio (String nombre, boolean gratis ,String nombreAccesorio) {
        super(nombre, gratis);
        this.nombre = nombre;
    }

    public Accesorio () {
        this.nombreAccesorio = NOMBRE_DEFAULT;
    }
    @Override
    public void tipoArticulo() {
    }

    @Override
    public int precioArticulo(int precio) {
        precio = 7;
        return precio;
    }

    @Override
    public String getNombre() {
        return nombreAccesorio;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombreAccesorio = nombreAccesorio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
