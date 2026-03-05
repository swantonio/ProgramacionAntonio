package Actividad2;

public class Billete implements IDinero {
    double valor;

    public static final int VALOR_DEFAULT = 5;

    public Billete (int valor) {
        this.valor = valor;
    }

    public Billete () {
        this.valor = VALOR_DEFAULT;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double valor() {
        return valor;
    }

    public String toString() {
        return "Valor" + valor;
    }
}
