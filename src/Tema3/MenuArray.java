package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MenuArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("=== INTRODUCE EL PRIMER VECTOR ===");
        int[] vector1 = leerVector();

        System.out.println("¿Quieres introducir un segundo vector? (s/n)");
        char r = in.next().charAt(0);

        int[] vector2 = null;
        if (r == 's') {
            System.out.println("=== INTRODUCE EL SEGUNDO VECTOR ===");
            vector2 = leerVector();
        }

        menu();
        char opcion = in.next().charAt(0);
        switch (opcion) {
            case 'a':
                System.out.println("El primer vector es: ");
                MyArray.devolverArray(vector1);
                break;

            case 'b':
                System.out.println("El numero mayor del array es: " + MyArray.mayorArray(vector1));
                break;
            case 'c':
                System.out.println("El numero menor del array es: " + MyArray.menorArray(vector1));
                break;
            case 'd':
                System.out.println("La media del array es: " + MyArray.mediaArray(vector1));
                break;
            case 'e':
                System.out.println("Introduce un numero para comprobar si esta en el array");
                int numeroelemento = in.nextInt();
                boolean existencia = MyArray.elementoArray(vector1, numeroelemento);
                if (existencia) {
                    System.out.println("El numero esta en el array");
                } else {
                    System.out.println("El numero no esta en el array");
                }
            case 'f':
                int[] resultado = MyArray.sumaVectores(vector1, vector2);
                System.out.println("La suma de los vectores es: " + Arrays.toString(resultado));
                break;
            case 'g':
                int[] resultadoresta = MyArray.restaVectores(vector1, vector2);
                System.out.println("La resta de los vectores es: " + Arrays.toString(resultadoresta));
                break;
            case 'h':
                int resultadoproducto = MyArray.productoVectores(vector1,vector2);
                System.out.println("El producto escalado es: " + resultadoproducto);
                break;
            case 'i':
                int[] resultadoinversion = MyArray.inversionArray(vector1);
                System.out.println("El array invertido es: " + Arrays.toString(resultadoinversion));
                break;
            case 'j':
                MyArray.inversionArray2(vector1);
                System.out.println("El array invertido en procedimiento es: " + Arrays.toString(vector1));
                break;
            case 'k':
                if (MyArray.esCapicua(vector1)) {
                    System.out.println("El array es capicua");
            } else {
                    System.out.println("El array no es capicua");
                }
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static int[] leerVector() {
        System.out.print("Tamaño: ");
        int tam = in.nextInt();
        int[] v = new int[tam];

        System.out.println("Introduce los valores:");
        for (int i = 0; i < tam; i++) v[i] = in.nextInt();

        return v;
    }

    public static void menu() {
        System.out.println("Introduce a si quieres ver el array");
        System.out.println("Introduce b si quieres saber el numero maximo del array");
        System.out.print("Introduce c si quieres saber el numero minimo del array");
        System.out.println("Introduce d si quieres saber la media del array");
        System.out.println("Introduce e si quieres saber si el elemento que introduzcas existe en el array");
        System.out.println("Introduce f para sumar 2 vectores del array");
        System.out.println("Introduce g para restar 2 vectores del array");
        System.out.println("Introduce h para saber el producto de 2 vectores del array");
        System.out.println("Introduce i si quieres invertir el orden del array");
        System.out.println("Introduce j si quieres invertir del orden del array con un procedimiento");
        System.out.println("Introduce k si quieres saber si el array es capicua");
    }
}
