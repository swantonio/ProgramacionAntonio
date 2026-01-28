package Tema4;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Persona2 persona = new Persona2();
        Persona2 persona2 = new Persona2();
        System.out.println("Introduce una de las opciones");
        System.out.println("1. Instanciar objetos de tipo Persona");
        System.out.println("2. Instanciar objetos de tipo Cuenta y asociarlo a una persona.");
        System.out.println("3. Mostrar datos de una persona (por su dni).");
        System.out.println("4. Recibir la nómina mensual de una persona (por dni y núm de cuenta).");
        System.out.println("5. Recibir un pago (por dni y núm de cuenta).");
        System.out.println("6. Realizar transferencia entre cuentas.");
        System.out.println("7. Imprimir las personas morosas.");
        System.out.println("8. Si quieres salir");

        Scanner in = new Scanner(System.in);
        int opcion = in.nextInt();
        switch (opcion) {
            case 1 :
                System.out.println("Introduce el nombre");
                persona.setNombre(in.nextLine());
                System.out.println("Introduce el dni");
                persona.setDni(in.nextLine());
                System.out.println("Introduce apellido");
                persona.setApellido(in.nextLine());
            case 2 :
                Cuenta Cuenta = new Cuenta();
                System.out.println("Introduce el numero de cuenta");
                Cuenta.setNumeroDeCuenta(in.nextLine());
            case 3 :
                System.out.println("Introduce el dni de la persona que quieras saber sus datos");
            case 4 :
                persona.recibirNomina(persona.getDni(), persona.getNumCuentas());
            case 5 :
                persona.pagarRecibo(persona.getDni(), persona.getNumCuentas());
            case 6 :
                persona.transferir(persona.getCuentasBancarias(), persona2, persona2.getCuentasBancarias(),300);
            case 7 :

            case 8 :
                break;
            default:
                System.out.println("Opcion invalida");
        }
    }
}
