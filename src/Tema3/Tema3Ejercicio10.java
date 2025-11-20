package Tema3;

import java.util.Scanner;

import static Tema3.Tema3Ejercicio1.numberSign;
import static Tema3.Tema3Ejercicio2.isAdult;
import static Tema3.Tema3Ejercicio3.*;
import static Tema3.Tema3Ejercicio4.*;
import static Tema3.Tema3Ejercicio5.multiplicacion;
import static Tema3.Tema3Ejercicio7.primo;
import static Tema3.Tema3Ejercicio8.fechaValida;
import static Tema3.Tema3Ejercicio9.triangulo;

public class Tema3Ejercicio10 {
    public static void opciones (char opcion){
        Scanner in = new Scanner(System.in);
        switch (opcion) {
            case 'a' :
                System.out.println("Introduce un numero");
                int num = in.nextInt();
                int resultado = numberSign (num);
                if (resultado == 0) {
                    System.out.println("El numero es 0");
                } else if (resultado == 1) {
                    System.out.println("El numero es positivo");
                }  else {
                    System.out.println("El numero es negativo");
                }
                break;
            case 'b' :
                int num2 = in.nextInt();
                int edad = (num2);
                int resultado2 = numberSign(num2);
                if (resultado2 == 0) {
                    System.out.println("El numero es 0");
                } else if (resultado2 == 1) {
                    System.out.println("El numero es positivo");
                } else {
                    while (num2 < 0) {
                        System.out.println("El numero no es valido, pon otro");
                        num2 = in.nextInt();
                    }
                }
                if (isAdult(resultado2)) {
                    System.out.println("Es mayor de edad");
                } else {
                    System.out.println("Es menor de edad");
                }
                break;
            case 'c' :
                System.out.println("Introduce un radio");
                double radio = in.nextDouble();
                while (!validRadius(radio)) {
                    System.out.println("Error introduce un radio valido");
                    radio = in.nextDouble();
                }
                double perimeter = calculateCirclePerimeter(radio);
                System.out.printf("El perímetro es: %.2f%n", perimeter);
                double area = calculateCircleArea(radio);
                System.out.printf("El área es: %.2f%n", area);
                break;
            case 'd' :
                showMenu();
                int opcion3 = in.nextInt();
                while (opcion3 != 1 && opcion3 != 2) {
                    System.out.println("Error: opción no válida. Debes elegir 1 o 2.");
                    showMenu();
                    opcion3 = in.nextInt();
                }
                System.out.println("Introduce el dinero que quieres pasar");
                double dinero = in.nextDouble();
                if (opcion3 == 1) {
                    System.out.println("El dinero cambiado es : " + euro2dollar(dinero));
                } else {
                    System.out.println("El dinero cambiado es : " + dollar2euro(dinero));
                }
                break;
            case 'e' :
                System.out.println("Ingrese un numero entre 1-10 para saber su tabla de multiplicar: ");
                int num4  = in.nextInt();
                while (num4 < 1 || num4 > 10) {
                    System.out.println("Error introduce un numero valido");
                    num4 = in.nextInt();
                }
                multiplicacion(num4);
                break;
            case 'f' :
                for (int numero = 1; numero <= 10; numero++) {
                    multiplicacion(numero);
                    System.out.println("\n");
                }
                break;
            case 'g' :
                System.out.println("Introduce numeros para saber si son primos, pon 0 para acabar");
                int numero2 = in.nextInt();
                while (numero2 != 0) {
                    if (numero2 < 0){
                        System.out.println("Error introduce un numero positivo");
                    }
                    if (primo(numero2) ==1){
                        System.out.println("El numero es primo");
                    } else {
                        System.out.println("El numero no es primo");
                    }
                    System.out.println("Introduce otro número (0 para salir):");
                    numero2 = in.nextInt();
                }
                break;
            case 'h' :
                System.out.println("Indica el dia");
                int dia = in.nextInt();
                System.out.println("Indica el mes");
                int mes = in.nextInt();
                System.out.println("Indica el anio");
                int anio = in.nextInt();

                if (fechaValida(dia, mes, anio)) {
                    System.out.println("La fecha es correcta");
                } else {
                    System.out.println("La fecha es incorrecta");
                }
                break;
            case 'i' :
                System.out.println("Introduce el caracter");
                char caracter = in.next().charAt(0);
                System.out.println("Introduce el numero de lineas del triangulo");
                int lineasTriangulo = in.nextInt();
                triangulo(caracter, lineasTriangulo);
                break;
        }
    }

    public static void menu () {
        System.out.println("(a) Muestra el signo de un número introducido por el usuario");
        System.out.println("b) Indica si el usuario es mayor de edad o no.");
        System.out.println("c) Calcula el área y perímetro de un círculo.");
        System.out.println("d) Conversor de euros a dólares y de dólares a euros.");
        System.out.println("e) Mostrar tabla de multiplicar de un número.");
        System.out.println("f) Mostrar tablas de multiplicar del 1 al 10.");
        System.out.println("g) Comprobador de números primos.");
        System.out.println("h) Comprobador de fechas.");
        System.out.println("i) Dibujar triángulos.");
    }

    public static void main(String[] args) {
        System.out.println("Introduce alguna de las siguientes opciones");
        menu();
        Scanner in = new Scanner(System.in);
        char opcion = in.next().charAt(0);
        opciones(opcion);
    }
}
