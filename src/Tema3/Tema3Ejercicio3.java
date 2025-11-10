package Tema3;

import java.util.Scanner;

public class Tema3Ejercicio3 {
    public static boolean validRadius (double radius){
        return radius > 0;
    }
    public static double calculateCirclePerimeter(double radius){
        return radius * 2 * Math.PI;
    }
    public static double calculateCircleArea(double radius){
        return Math.PI * Math.pow(radius, 2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        in.close();
    }
}
