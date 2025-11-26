package Tema3;


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
    public static void esPrimo(int numero) {
        if (numero <= 1) {
            System.out.println("El número no es primo");
            return;
            }
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                System.out.println("El número es primo");
            } else {
                System.out.println("El número no es primo");
            }
    }
        public static int numDigitos ( int numero){
            numero = Math.abs(numero);
            if (numero == 0) return 1;
            return String.valueOf(numero).length();
        }
    public static int contarDigitosPares(int numero) {
        numero = Math.abs(numero);
        int contador = 0;
        if (numero == 0) {
            return 1;
        }
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 == 0) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }
    public static int contarDigitosImpares(int numero) {
        numero = Math.abs(numero);
        int contador = 0;
        if (numero == 0) {
            return 0;
        }
        while (numero > 0) {
            int digito = numero % 10;
            if (digito % 2 != 0) {
                contador++;
            }
            numero /= 10;
        }
        return contador;
    }
    public static long factorial(int factorial) {
        if (factorial < 0) {
            System.out.println("El factorial no existe para números negativos.");
            return -1;
        }
        long resultado = 1;
        for (int i = 2; i <= factorial; i++) {
            resultado *= i;
        }
        return resultado;
    }
    public static long factorialRecursivo(int factorial) {
        if (factorial < 0) {
            System.out.println("El factorial no existe para números negativos.");
            return -1;
        }
        if (factorial == 0 || factorial == 1) {
            return 1;
        }
        return factorial * factorialRecursivo(factorial - 1);
    }
    public static int sumarDigitos(int numero) {
        numero = Math.abs(numero);
        int suma = 0;
        while (numero > 0) {
            int digito = numero % 10;
            suma += digito;
            numero /= 10;
        }
        return suma;
    }
}




