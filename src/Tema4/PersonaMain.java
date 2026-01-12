package Tema4;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Persona 1");
        System.out.println("Introduce el nombre de la primera persona");
        String nombre1 = in.nextLine();
        System.out.println("Introduce el dni de la primera persona");
        String dni1 = in.nextLine();
        System.out.println("Introduce el apellido de la primera persona");
        String apellido1 = in.nextLine();
        System.out.println("Introduce la edad de la primera persona");
        int edad1 = in.nextInt();
        Persona persona1 = new Persona(dni1, nombre1, apellido1, edad1 );

        System.out.println("Persona 2");
        System.out.println("Introduce el nombre de la primera persona");
        String nombre2 = in.nextLine();
        System.out.println("Introduce el dni de la primera persona");
        String dni2 = in.nextLine();
        System.out.println("Introduce el apellido de la primera persona");
        String apellido2 = in.nextLine();
        System.out.println("Introduce la edad de la primera persona");
        int edad2 = in.nextInt();
        Persona persona2 = new Persona(dni2, nombre2, apellido2, edad2);

        persona1.print();
        persona2.print();

        persona1.isAdult(edad1);
        persona2.isAdult(edad2);
    }
}
