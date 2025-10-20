package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio30 {
    public static void main(String[] args) {
        double primernumero = 0;
        double segundonumero = 0;
        double resultado = 0;
        boolean continuar = true; // Controla el bucle
        String operador = "";


        Scanner in = new Scanner(System.in);

    while (continuar) {

        System.out.println("Introduce el primer numero, pon fin para salir" );
        String entrada = in.next();
        if (entrada.equalsIgnoreCase("fin")) {
            System.out.println("Fin de programa");
            continuar = false;
            break;
        }
        primernumero = Double.parseDouble(entrada);


        System.out.println("Introduce la operacion que quieres realizar, pon fin para salir ");
        operador = in.next();
        if (operador.equalsIgnoreCase("fin")) {
            System.out.println("Fin de programa");
            break;
        } else {
            switch (operador) {
                case "+":
                    System.out.println("Introduce el segundo numero");
                    segundonumero = in.nextDouble();
                    resultado = primernumero + segundonumero;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                case "-":
                    System.out.println("Introduce el segundo numero");
                    segundonumero = in.nextDouble();
                    resultado = primernumero - segundonumero;
                    System.out.println("El resultado de la resta es " +  resultado);
                    break;
                case "*":
                    System.out.println("Introduce el segundo numero");
                    segundonumero = in.nextDouble();
                    resultado = primernumero * segundonumero;
                    System.out.println("El resultado de la multiplicación es " +  resultado);
                    break;
                case "/":
                    System.out.println("Introduce el segundo numero");
                    segundonumero = in.nextDouble();
                    while (segundonumero == 0){
                        System.out.println("Error introduce un numero valido");
                        segundonumero = in.nextDouble();
                    }
                    resultado = primernumero / segundonumero;
                    System.out.println("El resultado de la division es " + resultado);
                    break;
                case "%":
                    System.out.println("Introduce el segundo numero");
                    segundonumero = in.nextDouble();
                    while (segundonumero == 0){
                        System.out.println("Error introduce un numero valido");
                        segundonumero = in.nextDouble();
                    }
                    resultado = primernumero % segundonumero;
                    System.out.println("El resultado del resto es " + resultado);
                    break;
                default: {
                    System.out.println("Operador no valido");
                    break;
                }
            }
        }
    }
    in.close();
    }
}
