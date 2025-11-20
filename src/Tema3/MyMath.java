package Tema3;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
    }

    public static double squarePerimeter(double lado) {
        return 4 * lado;
    }

    public static double squareArea(double lado) {
        return lado * lado;
    }

    public static double rectanglePerimeter(double base, double altura) {
        return 2 * (base + altura);
    }

    public static double rectangleArea(double base, double altura) {
        return base * altura;
    }

    public static double circlePerimeter(double radio) {
        return 2 * Math.PI * radio;
    }

    public static double circleArea(double radio) {
        return Math.PI * radio * radio;
    }
}


