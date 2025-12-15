package Tema3.Strings;

public class CifradoCesar {
    private static char cifrarCaracter(char c) {
        if (Character.isUpperCase(c)) {
            if (c == 'Z') {
                return 'A';
            } else {
                return (char) (c + 1);
            }
        } else if (Character.isDigit(c)) {
            if (c == '9') {
                return '0';
            } else {
                return (char) (c + 1);
            }
        } else {
            return c;
        }
    }
    public static String encrypt(String mensaje) {
        if (mensaje == null || mensaje.isEmpty()) {
            return "";
        }

        String mensajeMayusculas = mensaje.toUpperCase();
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensajeMayusculas.length(); i++) {
            resultado.append(cifrarCaracter(mensajeMayusculas.charAt(i)));
        }

        return resultado.toString();
    }
    private static char descifrarCaracter(char c) {
        if (Character.isUpperCase(c)) {
            if (c == 'A') {
                return 'Z';
            } else {
                return (char) (c - 1);
            }
        } else if (Character.isDigit(c)) {
            if (c == '0') {
                return '9';
            } else {
                return (char) (c - 1);
            }
        } else {
            return c;
        }
    }
    public static String decrypt(String mensajeCifrado) {
        if (mensajeCifrado == null || mensajeCifrado.isEmpty()) {
            return "";
        }

        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < mensajeCifrado.length(); i++) {
            resultado.append(descifrarCaracter(mensajeCifrado.charAt(i)));
        }

        return resultado.toString();
    }
    public static void main(String[] args) {
        String mensajeOriginal = "Hola Mundo 123";
        String cifrado = encrypt(mensajeOriginal);
        String descifrado = decrypt(cifrado);

        System.out.println("Original: " + mensajeOriginal);
        System.out.println("Cifrado:  " + cifrado);
        System.out.println("Descifrado: " + descifrado);
    }
}
