package Tema3;

public class MyArray {

    public static void devolverArray(int[] devueltaArray) {
        //for (int i = 0; i < devueltaArray.length; i++)
        //{
        //    System.out.println(devueltaArray[i]);
        //}
        for (int j : devueltaArray) {
            System.out.println(j);
        }
    }

    public static int mayorArray(int[] mayorArray) {
        int max = mayorArray[1];
        for (int i = 0; i < mayorArray.length; i++) {
            if (mayorArray[i] > max) {
                max = mayorArray[i];
            }
        }
        return max;
    }

    public static int menorArray(int[] menorArray) {
        int menor = menorArray[1];
        for (int i = 0; i < menorArray.length; i++) {
            if (menorArray[i] < menor) {
                menor = menorArray[i];
            }
        }
        return menor;
    }

    public static int mediaArray(int[] mediaArray) {
        int sumamedia = 0;
        for (int i = 0; i < mediaArray.length; i++) {
            sumamedia = sumamedia + mediaArray[i];
        }
        return sumamedia / mediaArray.length;
    }

    public static boolean elementoArray(int[] elementoArray, int numeroelemento) {
        for (int i = 0; i < elementoArray.length; i++) {
            if (elementoArray[i] == numeroelemento) {
                return true;
            }
        }
        return false;
    }
    public static int []sumaVectores(int [] a, int [] b) {
        int [] resultado = new int [a.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = a[i] + b[i];
        }
        return resultado;
    }
    public static int []restaVectores(int [] a, int [] b){
        int [] resultado = new int[a.length];
        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = a[i] - b[i];
        }
        return resultado;
    }
    public static int productoVectores (int [] a, int [] b) {
        int resultado= 0;
        for (int i = 0; i < a.length; i++) {
            resultado += a[i] * b[i];
        }
        return resultado;
    }
    public static int[] inversionArray(int[] a) {
        int[] resultado = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            resultado[i] = a[a.length - 1 - i];
        }
        return resultado;
    }
    public static void inversionArray2 (int [] inversionArray2) {
            int inicio = 0;
            int fin = inversionArray2.length - 1;
            while (inicio < fin) {
                int temp = inversionArray2[inicio];
                inversionArray2[inicio] = inversionArray2[fin];
                inversionArray2[fin] = temp;
                inicio++;
                fin--;
            }
        }
    public static boolean capicuaArray (int [] capicuaArray) {
    }
    }
