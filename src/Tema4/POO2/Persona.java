package Tema4.POO2;

public class Persona {
    private String dni;
    private Cuenta[] cuentasBancarias;
    private String nombre;
    private String apellido;
    private int numCuentas;

    public Persona() {
        this.dni = "Hola";
        this.cuentasBancarias = new Cuenta[3];
        this.nombre = "Paco";
        this.apellido = "payo";
        this.numCuentas = 0;
    }

    public Persona(String dni, Cuenta[] cuentasBancarias, String nombre, String apellido, int numCuentas) {
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
    public boolean estaCreada() {
        return !dni.isEmpty();
    }

    public void crearPersona(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public boolean añadirCuenta(String numCuenta, double saldoInicial) {
        if (numCuentas < 3) {
            cuentasBancarias[numCuentas] =
                    new Cuenta(numCuenta, saldoInicial);
            numCuentas++;
            return true;
        }
        return false;
    }
    public void recibirNomina(String numCuenta, double cantidad) {
        int pos = buscarCuenta(numCuenta);
        if (pos != -1) {
            cuentasBancarias[pos].recibirAbonos(cantidad);
        }
    }
    public void pagarRecibo(String numCuenta, double cantidad) {
        int pos = buscarCuenta(numCuenta);
        if (pos != -1) {
            cuentasBancarias[pos].pagarRecibos(cantidad);
        }
    }
    public void transferir(String cuentaOrigen, Persona destino,
                           String cuentaDestino, double cantidad) {
        int posOrigen = buscarCuenta(cuentaOrigen);
        int posDestino = destino.buscarCuenta(cuentaDestino);

        if (posOrigen != -1 && posDestino != -1) {
            cuentasBancarias[posOrigen]
                    .transferir(destino.cuentasBancarias[posDestino],
                            cantidad);
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
    public void print() {
        System.out.println(nombre + " " + apellido + " | DNI: " + dni);
        for (int i = 0; i < numCuentas; i++) {
            System.out.println(
                    cuentasBancarias[i].getNumeroDeCuenta() +
                            " Saldo: " + cuentasBancarias[i].getSaldoDisponible()
            );
        }
    }
    private int buscarCuenta(String numeroCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentasBancarias[i].getNumeroDeCuenta()
                    .equals(numeroCuenta)) {
                return i;
            }
        }
        return -1;
    }
    }

