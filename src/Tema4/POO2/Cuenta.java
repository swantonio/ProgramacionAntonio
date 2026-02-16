package Tema4.POO2;

public class Cuenta {
    private String numeroDeCuenta;
    private double saldoDisponible;

    public Cuenta() {
        this.numeroDeCuenta = "Paco";
        this.saldoDisponible = 0;
    }

    public Cuenta (String numeroDeCuenta, double saldoDisponible) {
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldoDisponible = saldoDisponible;
    }


    public void recibirAbonos(double extra) {
        if (extra > 0) {
            this.saldoDisponible = this.saldoDisponible + extra;
            System.out.println("Tu saldo es: " + this.saldoDisponible);
        }
    }

    public void pagarRecibos (double pago) {
     if (this.saldoDisponible >= pago) {
         this.saldoDisponible = this.saldoDisponible - pago;
     }
    }

    public void transferir(Cuenta destino, double cantidad) {
        if (cantidad > 0) {
            this.pagarRecibos(cantidad);
            destino.recibirAbonos(cantidad);
        }
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public void setSaldoDisponible(double saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

}
