package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio11 {
    static Scanner in = new Scanner(System.in);
public static void main(String[] args) {
    int numero = 0;
    int factorial;
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
                System.out.println("¿Qué quieres comprobar?");
                System.out.println("1. Si el número ES primo");
                System.out.println("2. Si el número NO es primo");
                int subOpcion = in.nextInt();

                if (subOpcion == 1) {
                    if (MyMath.esPrimo(numero)) {
                        System.out.println("El número es primo");
                    } else {
                        System.out.println("El número NO es primo");
                    }
                } else if (subOpcion == 2) {
                    if (MyMath.noEsPrimo(numero)) {
                        System.out.println("El número NO es primo");
                    } else {
                        System.out.println("El número SÍ es primo");
                    }
                } else {
                    System.out.println("Opción no válida");
                }
                break;

            case 'h':
                System.out.println("Introduce el numero");
                numero = in.nextInt();
                System.out.println("La cantidad de digitos es: " + MyMath.numDigitos(numero));
                break;
            case 'i':
                System.out.println("Introduce el numero");
                numero = in.nextInt();
                System.out.println("La cantidad de digitos pares es: " + MyMath.contarDigitosPares(numero));
                break;
            case 'j':
                System.out.println("Introduce el numero");
                numero = in.nextInt();
                System.out.println("La cantidad de digitos impares es: " + MyMath.contarDigitosImpares(numero));
                break;
            case 'k':
                System.out.println("Introduce el numero");
                factorial = in.nextInt();
                System.out.println("El factorial del numero es: " + MyMath.factorial(factorial));
                break;
            case 'l':
                System.out.println("Introduce el numero");
                factorial = in.nextInt();
                System.out.println("El factorial recurisvo del numero es: " + MyMath.factorialRecursivo(factorial));
                break;
            case 'm':
                System.out.println("Introduce el numero");
                numero = in.nextInt();
                System.out.println("La suma de los digitos del numero es: " + MyMath.sumarDigitos(numero));
                break;
            case 'n':
                System.out.println("Introduce numero a");
                int numa = in.nextInt();
                System.out.println("Introduce numero b");
                int numb= in.nextInt();
                System.out.println("Introduce numero c");
                int numc = in.nextInt();
                if(MyMath.ecuacion(numa, numb, numc)==0) {
                    System.out.println("No hay solucion real");
                } else if (MyMath.ecuacion(numa, numb, numc)==1) {
                    System.out.println("Hay una solucion");
                } else {
                    System.out.println("Hay dos soluciones reales distintas");
                }
                break;
            default:
                System.out.println("Error");
                break;
        }
    }
    public static void menu() {
        System.out.println("Introduce a si quieres saber el perimetro del circulo");
        System.out.println("Introduce b si quieres saber el area del circulo");
        System.out.println("Introduce c si quieres saber el perimetro del rectangulo:");
        System.out.println("Introduce d si quieres saber el area del rectangulo");
        System.out.println("Introduce e si quieres saber el perimetro del cuadrado");
        System.out.println("Introduce f si quieres saber el area del cuadrado");
        System.out.println("Introduce g si quieres saber si un numero es primo o no");
        System.out.println("Introduce h si quieres saber el numero de digitos de un numero entero");
        System.out.println("Introduce i si quieres saber la cantidad de digitos pares de un numero");
        System.out.println("Introduce j si quieres saber la cantidad de digitos impares de un numero :)");
        System.out.println("Introduce k si quieres saber el factorial de un numero");
        System.out.println("Introduce l si quieres saber el factorial recursivo de un numero");
        System.out.println("Introduce m si quieres sumar todos los digitos de un numero entero");
        System.out.println("Introduce n si quieres saber los resultados de la ecuacion");
    }
}

