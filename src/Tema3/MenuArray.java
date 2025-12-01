package Tema3;

import java.util.Arrays;
import java.util.Scanner;

public class MenuArray {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce alguna de las siguientes opciones");
        menu();
        char opcion = in.next().charAt(0);
        switch (opcion) {
            case 'a':
                int [] devueltaArray = new int[] {1,2,3,4,5,6,7,8,9,10};
                MyArray.devolverArray(devueltaArray);
                break;
            case 'b':
                int [] mayorArray = new int [] {1,2,3,4,5,6,7,8,9,10};
                System.out.println("El numero mayor del array es: " + MyArray.mayorArray(mayorArray));
                break;
            case 'c':
                int [] menorArray = new int [] {1,2,3,4,5,6,7,8,9,10};
                System.out.println("El numero menor del array es: " + MyArray.menorArray(menorArray));
                break;
            case 'd':
                int [] mediaArray = new int [] {1,2,3,4,5,6,7,8,9,10};
                System.out.println("La media del array es: " + MyArray.mediaArray(mediaArray));
                break;
            case 'e':
                int [] elementArray = new int [] {1,2,3,4,5,6,7,8,9,10};
                System.out.println("Introduce un numero para comprobar si esta en el array");
                int numeroelemento = in.nextInt();
                boolean existencia = MyArray.elementoArray(elementArray, numeroelemento);
                if (existencia) {
                    System.out.println("El numero esta en el array");
                } else {
                    System.out.println("El numero no esta en el array");
                }
            case 'f':
                int [] array1 = new int [] {1,2,3,4,5,6,7,8,9,10};
                int [] array2 = new int [] {1,2,3,4,5,6,7,8,9,10};
                int[] resultado = MyArray.sumaVectores(array1, array2);
                System.out.println("La suma de los vectores es: " + Arrays.toString(resultado));
                break;
            case 'g':
                int [] array1resta = new int [] {2,4,6,8,10,12,14,16,18,20};
                int [] array2resta = new int [] {1,2,3,4,5,6,7,8,9,10};
                int [] resultadoresta = MyArray.restaVectores(array1resta, array2resta);
                System.out.println("La resta de los vectores es: " + Arrays.toString(resultadoresta));
                break;
            case 'h':
                int [] producto1 = new int [] {1,2,3,4,5,6,7,8,9,10};
                int [] producto2 = new int [] {1,2,3,4,5,6,7,8,9,10};
                int resultadoproducto = MyArray.productoVectores(producto1, producto2);
                System.out.println("El producto escalado es: " + resultadoproducto);
                break;
            case 'i':
                int [] inversion = new int [] {1,2,3,4,5,6,7,8,9,10};
                int[] resultadoinversion = MyArray.inversionArray(inversion);
                System.out.println("El array invertido es: " + Arrays.toString(resultadoinversion));
                break;
            case 'j':
                int [] inversion2 = new int [] {1,2,3,4,4,5,6,7,8,9,10};
                MyArray.inversionArray2(inversion2);
                System.out.println("El array invertido en procedimiento es: " + Arrays.toString(inversion2));
        }
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
