package Colecciones2.Ejercicio2;

import java.util.HashMap;
import java.util.Random;

public class AcortadorURL {
    // Atributos
    private HashMap<String, String> diccionario;
    private String baseUrl;
    private int longitudClave;

    // Constantes (defaults)
    private final HashMap<String, String> DEFAULT_DICCIONARIO = new HashMap<>();
    private final String DEFAULT_BASE_URL = "https://acortar.link/";
    private final int DEFAULT_LONGITUD = 5;

    // Constructor
    public AcortadorURL(String baseUrl, int longitudClave) {
        this.diccionario = new HashMap<>();
        this.baseUrl = baseUrl;
        this.longitudClave = longitudClave;
    }

    // Constructor vacío
    public AcortadorURL() {
        this.diccionario = DEFAULT_DICCIONARIO;
        this.baseUrl = DEFAULT_BASE_URL;
        this.longitudClave = DEFAULT_LONGITUD;
    }

    // Metodos
    public void crearRegistro(String urlLarga) {
        String clave = generarClaveAleatoria();
        diccionario.put(clave, urlLarga);
        System.out.println("Registro creado: " + baseUrl + clave + " -> " + urlLarga);
    }

    public void resolverDireccion(String cadena) {
        if (diccionario.containsKey(cadena)) {
            System.out.println("Redirigiendo a: " + diccionario.get(cadena));
        } else {
            System.out.println("Error: La URL acortada '" + cadena + "' no existe.");
        }
    }

    public void borrarRegistro(String cadena) {
        if (diccionario.remove(cadena) != null) {
            System.out.println("Registro '" + cadena + "' eliminado con éxito.");
        } else {
            System.out.println("Error: No se encontró la clave para borrar.");
        }
    }

    public void mostrarTodos() {
        System.out.println("--- Listado Completo de URLs ---");
        if (diccionario.isEmpty()) {
            System.out.println("No hay registros almacenados.");
        } else {
            for (String clave : diccionario.keySet()) {
                System.out.println("ID: " + clave + " | URL: " + diccionario.get(clave));
            }
        }
    }

    private String generarClaveAleatoria() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder sb = new StringBuilder();
        Random rnd = new Random();
        for (int i = 0; i < longitudClave; i++) {
            sb.append(caracteres.charAt(rnd.nextInt(caracteres.length())));
        }
        return sb.toString();
    }

    // Setters y Getters
    public HashMap<String, String> getDiccionario() { return diccionario; }
    public void setDiccionario(HashMap<String, String> diccionario) { this.diccionario = diccionario; }

    public String getBaseUrl() { return baseUrl; }
    public void setBaseUrl(String baseUrl) { this.baseUrl = baseUrl; }

    public int getLongitudClave() { return longitudClave; }
    public void setLongitudClave(int longitudClave) { this.longitudClave = longitudClave; }

    // ToString
    @Override
    public String toString() {
        return "Servicio Acortador [" + baseUrl + "] - Registros actuales: " + diccionario.size();
    }
}