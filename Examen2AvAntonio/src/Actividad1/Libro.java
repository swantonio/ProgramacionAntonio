package Actividad1;

enum formato {
    TAPADURA, TAPABLANDA, BOLSILLO
}

public class Libro {
    //Atributos
    public final String ISBN;
    public final String nombre;
    public final String autor;
    public int numpag;
    public String genero;
    public formato tipo;
    public int totalpeso;

    //CONSTANTES

    public static final String ISBN_DEFAULT = "1057458A";
    public static final String NOMBRE_DEFAULT = "El quijote";
    public static final String AUTOR_DEFAULT = "Antonio";
    public static final int NUMPAG_DEFAULT = 5;
    public static final String GENERO_DEFAULT = "Accion";
    public static final formato TIPO_DEFAULT = formato.TAPADURA;
    public static final int PESO_DEFAULT = 800;

    //Constructor completo

    public Libro (String ISBN, String autor, String nombre) {
        this.autor = autor;
        this.ISBN = ISBN;
        this.nombre = nombre;
    }

    //Constructor vacio

    public Libro () {
        this.ISBN = ISBN_DEFAULT;
        this.nombre = NOMBRE_DEFAULT;
        this.autor = AUTOR_DEFAULT;
        this.numpag = NUMPAG_DEFAULT;
        this.genero = GENERO_DEFAULT;
        this.tipo = TIPO_DEFAULT;
    }

    //Metodos

    public int pesoLibro(int numpag, formato tipo) {
        if (tipo == formato.TAPADURA) {
            totalpeso = 50 + (2 * numpag);
        } else if (tipo == formato.TAPABLANDA ){
            totalpeso = 20 + (2 * numpag);
        } else if (tipo == formato.BOLSILLO) {
            totalpeso = 10 + numpag;
        }
        return totalpeso;
    }

    //Setters y Getters

    public String getISBN() {
        return ISBN;
    }

    public String getNombre() {
        return nombre;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getgenero() {
        return genero;
    }

    public void setgenero(String genero) {
        genero = genero;
    }

    public formato getTipo() {
        return tipo;
    }

    public void setTipo(formato tipo) {
        this.tipo = tipo;
    }


    //toString

    public String toString() {
        return "Nombre libro: " + nombre + " nombre autor: " + autor + " peso: " + totalpeso;
    }
}
