package Tema4;

public class Persona2 {
    private String dni;
    private Cuenta[] cuentasBancarias;
    private String nombre;
    private String apellido;
    private int numCuentas;

    public Persona2() {
        this.dni = "Hola";
        this.cuentasBancarias = new Cuenta[0];
        this.nombre = "Paco";
        this.apellido = "payo";
        this.numCuentas = 3;
    }

    public Persona2(String dni, Cuenta[] cuentasBancarias, String nombre, String apellido, int numCuentas) {
        this.dni = dni;
        this.cuentasBancarias = new Cuenta [3];
        this.nombre = nombre;
        this.apellido = apellido;
        this.numCuentas = numCuentas;
    }

    public Cuenta[] getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(Cuenta[] cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumCuentas(int numCuentas) {
        this.numCuentas = numCuentas;
    }
    public int getNumCuentas() {
        return numCuentas;
    }
    public boolean añadirCuenta(String numCuenta, double saldoInicial) {
        if (numCuentas < 3) {
            cuentasBancarias[numCuentas] = new Cuenta(numCuenta, saldoInicial);
            numCuentas++;
            return true;
        }
        return false;
    }

    public void print () {
        System.out.println("Nombre: " + nombre + " | DNI: " + dni);
        for (int i = 0; i < numCuentas; i++) {
            System.out.println("Cuenta: " + cuentasBancarias[i].getNumeroDeCuenta()
                    + " Saldo: " + cuentasBancarias[i].getSaldoDisponible());
        }
    }
    public boolean esMorosa() {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentasBancarias[i].getSaldoDisponible() < 0) {
                return true;
            }
        }
        return false;
    }
    public void recibirNomina(String numCuenta, double cantidad) {
        Cuenta cuenta = buscarCuenta(numCuenta);
        if (cuenta != null) {
            cuenta.recibirAbonos(cantidad);
            }
        }
    public void pagarRecibo(String numeroCuenta, double cantidad) {
        Cuenta cuenta = buscarCuenta(numeroCuenta);
        if (cuenta != null) {
            cuenta.pagarRecibos(cantidad);
        }
    }

    public void transferir(String cuentaOrigen, Persona destino,
                           String cuentaDestino, double cantidad) {
        Cuenta cuenta1 = buscarCuenta(cuentaOrigen);
        Cuenta cuenta2 = destino.busca
        if (cuenta1 != null && cuenta2 != null) {
            cuenta1.transferir(cuenta2 , cantidad);
        }
    }
    private Cuenta buscarCuenta(String numeroCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentasBancarias[i].getNumeroDeCuenta().equals(numeroCuenta)) {
                return cuentasBancarias[i];
            }
        }
        return null;
    }
    }

