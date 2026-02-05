package Tema5.ActividadesColecciones1;

public class Usuario {
    private String nombre;
    private int edad;
    private String dni;

    public Usuario(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public Usuario() {
        this.dni = "Hola";
        this.nombre = "Paco";
        this.edad = 22;
    }
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String toString() {
        return "Nombre: " + nombre + " | Edad: " + edad;
    }
}