package Tema4;

public class Persona {
    private final String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private int edadDefault = 21;
    private final int adultAge = 18;
    private final int retiredAge = 65;

    public Persona() {
        this.dni = "0";
        this.nombre = "0";
        this.apellido = "0";
        this.edad = 0;
    }

    public Persona(String dni, String nombre, String apellido, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public Persona(String dni) {
        this.dni = dni;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 999) {
            this.edad = edad;
        } else {
            this.edad = edadDefault;
        }
    }
    public String isAdult(int edad) {
        if (edad <= adultAge) {
            return nombre + " es mayor de edad";
        } else {
            return nombre + " es menor de edad";
        }
    }
    public String isRetired(int edad) {
        if (edad > retiredAge ) {
            return nombre + " esta jubilado";
        } else {
            return nombre + " no esta jubilado";
        }
    }
    public String ageDifference(Persona persona) {
        if (this.edad == persona.edad) {
            return this.nombre + " y " + persona.nombre +
                    " tienen la misma edad";
        }
        int diferencia;
        if (this.edad > persona.edad) {
            diferencia = this.edad - persona.edad;
            return this.nombre + " es mayor que " + persona.nombre +
                    " por " + diferencia + " años";
        } else {
            diferencia = persona.edad - this.edad;
            return persona.nombre + " es mayor que " + this.nombre +
                    " por " + diferencia + " años";
        }
    }
    public void print () {
        System.out.println("Nombre:" + nombre + " Apellido:" + apellido + " Edad:" + edad + " Dni:" + dni);
    }

    public String checkDNI(String dni) {
        dni = dni.toUpperCase();
        int numDNI = Integer.parseInt(dni.substring(0, 8));
        char letraDNI = dni.charAt(8);

        if (letraDNI == 'I' || letraDNI == 'O' || letraDNI == 'U' || letraDNI == 'Ñ') {
            return "El dni de " + nombre + " es falso";
        }
        char letraCorrecta;
        int resto = numDNI % 23;
        switch (resto) {
            case 0:  letraCorrecta = 'T'; break;
            case 1:  letraCorrecta = 'R'; break;
            case 2:  letraCorrecta = 'W'; break;
            case 3:  letraCorrecta = 'A'; break;
            case 4:  letraCorrecta = 'G'; break;
            case 5:  letraCorrecta = 'M'; break;
            case 6:  letraCorrecta = 'Y'; break;
            case 7:  letraCorrecta = 'F'; break;
            case 8:  letraCorrecta = 'P'; break;
            case 9:  letraCorrecta = 'D'; break;
            case 10: letraCorrecta = 'X'; break;
            case 11: letraCorrecta = 'B'; break;
            case 12: letraCorrecta = 'N'; break;
            case 13: letraCorrecta = 'J'; break;
            case 14: letraCorrecta = 'Z'; break;
            case 15: letraCorrecta = 'S'; break;
            case 16: letraCorrecta = 'Q'; break;
            case 17: letraCorrecta = 'V'; break;
            case 18: letraCorrecta = 'H'; break;
            case 19: letraCorrecta = 'L'; break;
            case 20: letraCorrecta = 'C'; break;
            case 21: letraCorrecta = 'K'; break;
            case 22: letraCorrecta = 'E'; break;
            default: return "El dni de " + nombre + " es falso";

        }
        return (letraDNI == letraCorrecta) ? "El dni de " +  nombre + " es válido" : "El dni de" + nombre + " es falso";
    }

}
