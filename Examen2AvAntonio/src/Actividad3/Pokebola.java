package Actividad3;
enum tipoPokebola {
    POKEBALL, GREATBALL, ULTRABALL
}
public class Pokebola extends Articulo{
    tipoPokebola tipo;

    public static final tipoPokebola TIPO_DEFAULT = tipoPokebola.POKEBALL;

    public Pokebola (String nombre, boolean gratis, tipoPokebola tipo) {
        super(nombre, gratis);
        this.tipo = tipo;
    }

    public Pokebola () {
        this.tipo = TIPO_DEFAULT;
    }
    @Override
    public int precioArticulo(int precio) {
        if (tipo.equals(tipoPokebola.POKEBALL)) {
            precio = 2;
        } else if (tipo.equals(tipoPokebola.GREATBALL)) {
            precio = 5;
        } else {
            precio = 10;
        }
        return precio;
    }

    @Override
    public void tipoArticulo() {

    }

    public tipoPokebola getTipo() {
        return tipo;
    }

    public void setTipo(tipoPokebola tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString() + "tipo pokebola: " + tipo;
    }
}
