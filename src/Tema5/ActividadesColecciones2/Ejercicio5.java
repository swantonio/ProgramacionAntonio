package Tema5.ActividadesColecciones2;

public class Ejercicio5 {
    public static void main(String[] args) {
        int opcion;
    }
    public static void imprimePositivo (int p) throws Exception {
        if (p < 0) {
            throw new Exception("El numero no es positivo");
        }
            System.out.println("Numero positivo correcto");
        }

    public static void imprimerNegativo (int n) throws Exception{
        if (n >= 0) {
            throw new Exception("El numero no es negativo");
        }
        System.out.println("Numero negativo correcto ");
    }
}
