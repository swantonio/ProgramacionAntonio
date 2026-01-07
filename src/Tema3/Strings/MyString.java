package Tema3.Strings;

public class MyString {
    public static String invertirYMayusculas(String cadena) {
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString().toUpperCase();
    }
    private static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public static int contarVocales(String cadena) {
        int contador = 0;
        String cadenaMinusculas = cadena.toLowerCase();

        for (int i = 0; i < cadenaMinusculas.length(); i++) {
            if (esVocal(cadenaMinusculas.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    public static String palabraMasLarga(String cadena) {
        if (cadena == null || cadena.isEmpty()) {
            return "";
        }

        String[] palabras = cadena.trim().split("\\s+");
        String masLarga = "";

        for (String palabra : palabras) {
            if (palabra.length() > masLarga.length()) {
                masLarga = palabra;
            }
        }
        return masLarga;
    }

    public static int contarOcurrencias(String cadenaPrincipal, String subcadena) {
        if (subcadena.isEmpty()) {
            return 0;
        }

        int contador = 0;
        int desdeIndice = 0;

        while ((desdeIndice = cadenaPrincipal.indexOf(subcadena, desdeIndice)) != -1) {
            contador++;
            desdeIndice += subcadena.length();
        }
        return contador;
    }

    public static int contarPalabras(String cadena) {
        if (cadena == null || cadena.trim().isEmpty()) {
            return 0;
        }

        String[] palabras = cadena.trim().split("\\s+");

        if (palabras.length == 1 && palabras[0].isEmpty()) {
            return 0;
        }

        return palabras.length;
    }

    public static String formatearTelefono(String telefono) {
        if (telefono == null || telefono.length() != 11 || !telefono.matches("\\d{11}")) {
            return "Error: Formato de teléfono no válido (debe ser 11 dígitos numéricos).";
        }

        String prefijoPais = telefono.substring(0, 2);
        String codigoZona = telefono.substring(2, 5);
        String bloque1 = telefono.substring(5, 8);
        String bloque2 = telefono.substring(8);

        return "(+" + prefijoPais + ")-" + codigoZona + "-" + bloque1 + bloque2;
    }

    public static void mostrarHistogramaVocales(String cadena) {
        if (cadena == null) {
            System.out.println("Cadena nula. No hay histograma.");
            return;
        }

        String cadenaMinusculas = cadena.toLowerCase();
        int[] frecuencias = new int[5];
        char[] vocales = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < cadenaMinusculas.length(); i++) {
            char c = cadenaMinusculas.charAt(i);
            switch (c) {
                case 'a':
                    frecuencias[0]++;
                    break;
                case 'e':
                    frecuencias[1]++;
                    break;
                case 'i':
                    frecuencias[2]++;
                    break;
                case 'o':
                    frecuencias[3]++;
                    break;
                case 'u':
                    frecuencias[4]++;
                    break;
            }
        }
        System.out.println(cadena);
        for (int i = 0; i < vocales.length; i++) {
            int frecuencia = frecuencias[i];
            System.out.printf("%c %d ", vocales[i], frecuencia);

            for (int j = 0; j < frecuencia; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    }

