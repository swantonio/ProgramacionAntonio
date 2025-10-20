package Tema2;


public class Tema2Ejercicio27 {
    public static void main(String[] args) {
        int numero = 2;
        int numeroprimo = 0;
        int contadordivisor = 0;
        int divisor = 1;


        while (numeroprimo < 20) {
                contadordivisor = 0;
                divisor = 2;
            while (divisor < numero){
                if (numero % divisor == 0){
                    contadordivisor++;
                }
                divisor++;
            }
            if (contadordivisor == 0) {
                System.out.println(numero);
                numeroprimo++;
            }
            numero++;

        }
    }
}

