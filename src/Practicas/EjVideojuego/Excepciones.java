package Practicas.EjVideojuego;

public class Excepciones {

    public static class InvalidNoteException extends Exception {
        public InvalidNoteException(String mensaje) {
            super(mensaje);
        }
    }
    public static class GameNotFoundException extends Exception {
        public GameNotFoundException(String mensaje) {
            super(mensaje);
        }
    }
}
