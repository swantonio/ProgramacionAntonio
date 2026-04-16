package Funkos;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

enum model {
    ROJO, VERDE, AZUL
}

public class Funko implements Serializable {
    private static final AtomicInteger cont = new AtomicInteger(0);
    private int idfunko;
    private String name;
    private double price;
    private model options;
    private int year;

    private final int IDFUNKO_DEFAULT = 1;
    private final String NAME_DEFAULT = "Paco";
    private final double PRICE_DEFAULT = 10.00;
    private final model OPTIONS_DEFAULT = Funkos.model.AZUL;
    private final int YEAR_DEFAULT = 2023;

    public Funko (String name, double price, model model, int year) {
        this.idfunko = cont.incrementAndGet();
        this.name = name;
        this.price = price;
        this.options = model;
        this.year = year;
    }

    public Funko() {
        this.idfunko = IDFUNKO_DEFAULT;
        this.name = NAME_DEFAULT;
        this.price = PRICE_DEFAULT;
        this.options = OPTIONS_DEFAULT;
        this.year = YEAR_DEFAULT;
    }

    public int getIdfunko() {
        return idfunko;
    }

    public void setIdfunko(int idfunko) {
        this.idfunko = idfunko;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public model getModel() {
        return options;
    }

    public void setModel(model options) {
        this.options = options;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toCSV() {
        // Formato: id,nombre,precio,modelo,año
        return idfunko + "," + name + "," + price + "," + options + "," + year;
    }

    @Override
    public String toString() {
        return "Funko: " +
                "Idfunko = " + idfunko +
                " Nombre = " + name  +
                " Precio = " + price +
                " Modelo = " + options +
                " Año = " + year;
    }
}

