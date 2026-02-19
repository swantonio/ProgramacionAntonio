package Tema6.POO3;
enum tipoDePaso {
    FINO,TROTE,GALOPE
}
public class Caballo extends Animal {
    // Atributos
    private tipoDePaso paso;
    // Constantes (defaults)
    private final tipoDePaso PASO_DEFAULT = tipoDePaso.FINO;
    // Constructor
    public Caballo (String nombre, String raza, int edad, tipoDePaso Paso) {
        super(edad, raza, nombre);
        this.paso = Paso;
    }
    // Constructor vacío
    public Caballo () {
        super();
        this.paso = PASO_DEFAULT;
    }

    // Metodos

    @Override
    public void hacerRuido() {
        System.out.println("¡Iiiihhhh!");
    }

    public void pastar () {
        System.out.println(nombre + "esta pastando");
    }
    // Setters y Getters

    public tipoDePaso getPaso() {
        return paso;
    }

    public void setPaso(tipoDePaso paso) {
        this.paso = paso;
    }
    // ToString

    @Override
    public String toString() {
        return "Caballo" + " [" + super.toString() + "Tipo de paso: " + paso + "] ";
    }
}
