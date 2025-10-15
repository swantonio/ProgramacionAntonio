package Tema2;

import java.util.Scanner;

public class Tema2Ejercicio17 {
    public static void main(String[] args) {
        double ladocuadrado = 0;
        double baserectangulo = 0;
        double alturarectangulo = 0;
        double basetriangulo = 0;
        double alturatriangulo = 0;
        int lecturaopcion = 0;
        Scanner in = new Scanner(System.in);
//switch
        System.out.println("Introduce 0 si quieres que muestre la superficie y el perímetro de un cuadrado\n" +
                "1 si quieres que muestre la superficie y el perímetro de un rectángulo\n" +
                "2 si quieres que muestre la superficie de un triángulo");
        lecturaopcion = in.nextInt();
        switch (lecturaopcion) {
            default:
            System.out.println("Error, Introduce una opcion valida:");
            lecturaopcion = in.nextInt();

            case 0:
            System.out.println("Necesito que me digas de cuanto es el lado del cuadrado");
            ladocuadrado = in.nextDouble();
            while (ladocuadrado <= 0) {
                System.out.println("Introduce un numero positivo que no sea 0");
                ladocuadrado = in.nextDouble();
            }
            System.out.printf("El perimetro del cuadrado es: %.2f%n" , (ladocuadrado * 4));
            System.out.printf("La superficie del cuadrado es: %.2f%n" , (ladocuadrado * ladocuadrado));
            break;

            case 1:
            System.out.println("Necesito que me digas la base y la altura del rectangulo");
            System.out.println("Base");
            baserectangulo = in.nextDouble();
            while (baserectangulo <= 0) {
                System.out.println("Introduce un numero positivo que no sea 0");
                baserectangulo = in.nextDouble();
            }
            System.out.println("Altura");
            alturarectangulo = in.nextDouble();
            while (alturarectangulo <= 0) {
                System.out.println("Introduce un numero positivo que no sea 0");
                alturarectangulo = in.nextDouble();
            }
            System.out.printf("El perimetro del rectangulo es: %.2f%n" , (alturarectangulo*2 + baserectangulo*2));
            System.out.printf("La superficie del rectangulo es: %.2f%n" ,(alturarectangulo * baserectangulo));
                break;

            case 2:
            System.out.println("Necesito que me digas la base y la altura del triangulo");
            System.out.println("Base");
            basetriangulo = in.nextDouble();
            while (basetriangulo <= 0) {
                System.out.println("Introduce un numero positivo que no sea 0");
                basetriangulo = in.nextDouble();
            }
            System.out.println("Altura");
            alturatriangulo = in.nextDouble();
            while (alturatriangulo <= 0) {
                System.out.println("Introduce un numero positivo que no sea 0");
                alturatriangulo = in.nextDouble();
            }
            System.out.printf("La superficie del triangulo es: %.2f%n" ,  ((basetriangulo*alturatriangulo) / 2));
                break;
        }
        in.close();
    }
}
