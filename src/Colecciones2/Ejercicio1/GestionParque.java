package Colecciones2.Ejercicio1;

import java.util.ArrayList;

public class GestionParque {
    private ArrayList<Avistamiento> listado = new ArrayList<>();

    public void añadirAvistamiento(Avistamiento a) {
        listado.add(a);
        System.out.println("Avistamiento registrado correctamente.");
    }

    public void mostrarDesdeLas8() {
        System.out.println("--- Avistamientos a partir de las 8h ---");
        for (Avistamiento a : listado) {
            if (a.getHora() >= 8) System.out.println(a);
        }
    }

    public void mostrarNocturnos() {
        System.out.println("--- Avistamientos nocturnos (20h a 8h) ---");
        for (Avistamiento a : listado) {
            // Entre las 20 y las 24 O entre las 0 y las 8
            if (a.getHora() >= 20 || a.getHora() < 8) System.out.println(a);
        }
    }

    public void mostrarSoloManadas() {
        System.out.println("--- Listado de Manadas de Lobos ---");
        for (Avistamiento a : listado) {
            if (a instanceof ManadaLobos) System.out.println(a);
        }
    }

    public void mostrarSoloSerpientes() {
        System.out.println("--- Listado de Serpientes ---");
        for (Avistamiento a : listado) {
            if (a instanceof Serpiente) System.out.println(a);
        }
    }

    public void mostrarSoloPajaros() {
        System.out.println("--- Listado de Pájaros ---");
        for (Avistamiento a : listado) {
            if (a instanceof Pajaro) System.out.println(a);
        }
    }
}