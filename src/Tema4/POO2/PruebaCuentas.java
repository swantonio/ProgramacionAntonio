package Tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Persona persona = new Persona();
        Persona persona2 = new Persona();
        int opcion;
        do {
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
         opcion = in.nextInt();
         in.nextLine();
            switch (opcion) {
             case 1:
                 System.out.print("Nombre: ");
                 persona.setNombre(in.next());
                 System.out.print("Apellido: ");
                 persona.setApellido(in.next());
                 System.out.print("DNI: ");
                 persona.setDni(in.next());
                 System.out.println("Persona creada correctamente");
                 break;
             case 2:
                 if (!persona.estaCreada()) {
                     System.out.println("Primero debes crear la persona");
                     break;
                 }
                 System.out.print("Numero de cuenta: ");
                 String numCuenta = in.next();
                 System.out.print("Saldo inicial: ");
                 double saldo = in.nextDouble();
                 if (persona.añadirCuenta(numCuenta, saldo)) {
                     System.out.println("Cuenta añadida");
                 } else {
                     System.out.println("No se pueden añadir más cuentas");
                 }
             case 3:
                 if (!persona.estaCreada()) {
                     System.out.println("Persona no creada");
                 } else {
                     persona.print();
                 }
                 break;
             case 4:
                 if (!persona.estaCreada()) {
                     System.out.println("Persona no creada");
                     break;
                 }
                 System.out.print("Numero de cuenta: ");
                 String cuentaNomina = in.next();

                 System.out.print("Cantidad: ");
                 double nomina = in.nextDouble();
                 persona.recibirNomina(cuentaNomina, nomina);
                 break;
             case 5:
                 if (!persona.estaCreada()) {
                     System.out.println("Persona no creada");
                     break;
                 }
                 System.out.print("Numero de cuenta: ");
                 String cuentaPago = in.next();
                 System.out.print("Cantidad: ");
                 double pago = in.nextDouble();
                 persona.pagarRecibo(cuentaPago, pago);
                 break;
             case 6:
                 System.out.print("Cuenta origen: ");
                 String origen = in.nextLine();
                 System.out.print("Cuenta destino: ");
                 String destino = in.nextLine();
                 System.out.print("Cantidad: ");
                 double cantidad = in.nextDouble();
                 persona.transferir(origen, persona2,
                         destino, cantidad);
                 break;
             case 7:
                 if (persona.estaCreada() && persona.esMorosa()) {
                     System.out.println(persona + "es morosa");
                 } else {
                     System.out.println(persona + "No es morosa o no está creada");
                 }
                 break;
             case 8:
                 System.out.println("Saliendo...");
                 break;
             default:
                 System.out.println("Opcion invalida");
         }
     }  while (opcion != 8) ;
    }
}
