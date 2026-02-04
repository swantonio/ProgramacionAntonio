package Tema4;

import java.util.Scanner;

public class PersonaMain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Persona 1");
        System.out.println("Introduce el dni de la primera persona");
        Persona persona1 = new Persona(in.nextLine());
        System.out.println("Introduce el nombre de la primera persona");
        persona1.setNombre(in.nextLine());
        System.out.println("Introduce el apellido de la primera persona");
        persona1.setApellido(in.nextLine());
        System.out.println("Introduce la edad de la primera persona");
        persona1.setEdad(in.nextInt());

        in.nextLine();

        System.out.println("Persona 2");
        System.out.println("Introduce el dni de la segunda persona");
        Persona persona2 = new Persona(in.nextLine());
        System.out.println("Introduce el nombre de la segunda persona");
        persona2.setNombre(in.nextLine());
        System.out.println("Introduce el apellido de la segunda persona");
        persona2.setApellido(in.nextLine());
        System.out.println("Introduce la edad de la segunda persona");
        persona2.setEdad(in.nextInt());

        persona1.print();
        persona2.print();

        System.out.println(persona1.isAdult(persona1.getEdad()));
        System.out.println(persona2.isAdult(persona2.getEdad()));

        System.out.println(persona1.isRetired(persona1.getEdad()));
        System.out.println(persona2.isRetired(persona2.getEdad()));

        persona1.imprimirValidezDNI();
        persona2.imprimirValidezDNI();
        System.out.println(persona1.ageDifference(persona2));
    }
}
