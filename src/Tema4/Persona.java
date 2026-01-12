package Tema4;

public class Persona {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private boolean isAdult;
    private int edadDefault = 21;

    public Persona(String dni, String nombre, String apellidos, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellidos;
        this.edad = edad;
    }

    public String isAdult(int edad) {
        if (edad <= 18) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }

    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEdad(int edad) {
        if (edad < 0 || edad > 100) {
            this.edad = edad;
        } else {
            this.edad = edadDefault;
        }
    }
    public static boolean checkDni (String dni) {
        return false;
    }
    public void print () {
        System.out.println("Nombre: " + nombre + " Apellido: " + apellido + " Edad:" + edad + " Dni:" + dni);
    }
}
