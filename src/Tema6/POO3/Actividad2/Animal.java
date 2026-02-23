package Tema6.POO3.Actividad2;

public abstract class Animal {
    protected String nombre;
    protected int edad;
    protected String raza;

    protected final int EDAD_DEFAULT = 1;
    protected final String RAZA_DEFAULT = "Blancos";
    protected final String NOMBRE_DEFAULT = "Juanito";

    public Animal(int edad, String raza, String nombre) {
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
    }

    public Animal () {
        this.edad = EDAD_DEFAULT;
        this.raza = RAZA_DEFAULT;
        this.nombre = NOMBRE_DEFAULT;
    }

    public void comer () {
        System.out.println(nombre + " esta comiendo");
    }

    public void dormir () {
        System.out.println(nombre + " esta durmiendo");
    }

    public abstract void hacerRuido ();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Raza: " + raza + " Edad: " + edad;
    }
}


