package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio11 {
    static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    System.out.println("Introduce alguna de las siguientes opciones");
    menu();
    char opcion = in.next().charAt(0);
        switch (opcion) {
            case 'a':
                System.out.println("Introduce el radio del círculo");
                double rc1 = in.nextDouble();
                System.out.println("Perímetro = " + MyMath.circlePerimeter(rc1));
                break;

            case 'b':
                System.out.println("Introduce el radio del círculo");
                double rc2 = in.nextDouble();
                System.out.println("Área = " + MyMath.circleArea(rc2));
                break;

            case 'c':
                System.out.println("Introduce la altura");
                double ar1 = in.nextDouble();
                System.out.println("Introduce la base");
                double br1 = in.nextDouble();
                System.out.println("Perímetro = " + MyMath.rectanglePerimeter(br1, ar1));
                break;

            case 'd':
                System.out.println("Introduce la altura");
                double ar2 = in.nextDouble();
                System.out.println("Introduce la base");
                double br2 = in.nextDouble();
                System.out.println("Área = " + MyMath.rectangleArea(br2, ar2));
                break;

            case 'e':
                System.out.println("Introduce el lado del cuadrado");
                double ls1 = in.nextDouble();
                System.out.println("Perímetro = " + MyMath.squarePerimeter(ls1));
                break;

            case 'f':
                System.out.println("Introduce el lado del cuadrado");
                double ls2 = in.nextDouble();
                System.out.println("Área = " + MyMath.squareArea(ls2));
                break;
            case 'g':
                System.out.println("Introduce el numero");
                boolean esprimo = true;
                int numero  = in.nextInt();
                if (numero <= 1) {
                    System.out.println("El numero no es primo");
                } else {
                    for (int i = 2; i <= Math.sqrt(numero); i++) {
                        if (numero % i == 0) {
                            esprimo = false;
                        }
                    }
                    if (esprimo) {
                        System.out.println("El numero es primo");
                    } else {
                        System.out.println("El numero no es primo");
                    }

                }
        }
    }
    public static void menu() {
        System.out.println("Introduce a si quieres saber el perimetro del circulo");
        System.out.println("Introduce b si quieres saber el area del circulo");
        System.out.print("Introduce c si quieres saber el perimetro del rectangulo:");
        System.out.println("Introduce d si quieres saber el area del rectangulo");
        System.out.println("Introduce e si quieres saber el perimetro del cuadrado");
        System.out.println("Introduce f si quieres saber el area del cuadrado");
        System.out.println("Introduce g si quieres saber si un numero es primo");
    }
}

