package Actividad2;

public class Tarjeta implements IDinero {
    public String numero;
    public double saldo;
    public double credito;

    public static final String NUMERO_DEFAULT = "1245367898";
    public static final double SALDO_DEFAULT = 20.00;
    public static final double CREDITO_DEFAULT = 20.00;

    public Tarjeta (String numero, double saldo, double credito) {
        this.numero = numero;
        this.credito = credito;
        this.saldo = saldo;
    }

    public Tarjeta () {
        this.saldo = SALDO_DEFAULT;
        this.credito = CREDITO_DEFAULT;
        this.numero = NUMERO_DEFAULT;
    }

    @Override
    public double valor() {
        return  saldo + credito;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getCredito() {
        return credito;
    }

    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Numero: " + numero + " Saldo: " + saldo + " Credito: " + credito;
    }
}
