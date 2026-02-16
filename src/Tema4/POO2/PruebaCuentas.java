package Tema4.POO2;

import java.util.Scanner;

public class PruebaCuentas {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Persona[] listaPersonas = new Persona[10];
        int totalPersonas = 0;
        int opcion;
        String dni;
        String nom;
        String ape;
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
         opcion = in.nextInt();
         in.nextLine();
            switch (opcion) {
             case 1:
                 if (totalPersonas < listaPersonas.length) {
                     System.out.print("DNI: ");
                     dni = in.nextLine();
                     System.out.print("Nombre: "); nom = in.nextLine();
                     System.out.print("Apellido: "); ape = in.nextLine();

                     listaPersonas[totalPersonas] = new Persona(dni, nom, ape);
                     Persona p1 = new Persona(dni, nom, ape);
                     listaPersonas[totalPersonas].crearPersona(dni, nom, ape);
                     totalPersonas++;
                     System.out.println("Registrado.");
                 }
                 break;
             case 2:
                 System.out.print("DNI del titular: ");
                 dni = in.nextLine();
                 int posicion = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dni)) {
                         posicion = i;
                         break;
                     }
                 }
                 if (posicion != -1) {
                     System.out.print("Num Cuenta: "); String n = in.next();
                     System.out.print("Saldo: "); double s = in.nextDouble();
                     listaPersonas[posicion].añadirCuenta(n, s);
                 } else {
                     System.out.println("No encontrado.");
                 }
                 break;
             case 3:
                 System.out.print("DNI: ");
                 String dni3 = in.nextLine();
                 posicion = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dni3)) {
                         posicion = i;
                         break;
                     }
                 }
                 if (posicion != -1) listaPersonas[posicion].print();
                 break;
             case 4:
                 System.out.print("DNI: ");
                 String dni4 = in.nextLine();
                 posicion = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dni4)) {
                         posicion = i;
                         break;
                     }
                 }
                 if (posicion != -1) {
                     System.out.print("Cuenta: "); String cuenta = in.next();
                     System.out.print("Cantidad: "); double cantidad = in.nextDouble();
                     listaPersonas[posicion].recibirNomina(cuenta, cantidad);
                 }
                 break;
             case 5:
                 System.out.print("DNI: ");
                 dni = in.nextLine();
                 posicion = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dni)) {
                         posicion = i;
                         break;
                     }
                 }
                 if (posicion != -1) {
                     System.out.print("Cuenta: "); String cta = in.next();
                     System.out.print("Cantidad: "); double cant = in.nextDouble();
                     listaPersonas[posicion].pagarRecibo(cta, cant);
                 }
                 break;
             case 6:
                 System.out.print("DNI Origen: ");
                 String dniOrigen = in.nextLine();
                 int posicionOrigen = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dniOrigen)) { posicionOrigen = i; break; }
                 }

                 System.out.print("DNI Destino: ");
                 String dniDestino = in.nextLine();
                 int posicionDestino = -1;
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].getDni().equalsIgnoreCase(dniDestino)) { posicionDestino = i; break; }
                 }

                 if (posicionOrigen != -1 && posicionDestino != -1) {
                     System.out.print("Cuenta Origen: "); String cO = in.nextLine();
                     System.out.print("Cuenta Destino: "); String cD = in.nextLine();
                     System.out.print("Cantidad: "); double cant = in.nextDouble();
                     listaPersonas[posicionOrigen].transferir(cO, listaPersonas[posicionDestino], cD, cant);
                 }
                 break;
             case 7:
                 for (int i = 0; i < totalPersonas; i++) {
                     if (listaPersonas[i].esMorosa()) {
                         System.out.println("Moroso: " + listaPersonas[i].getNombre());
                     }
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

