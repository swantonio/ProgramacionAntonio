package Tema4;

public class RelojMain {
    public static void main(String[] args) {
        Reloj reloj = new Reloj();
        reloj.formato24 = false;
        reloj.setHora(25);
        reloj.setMinutos(24);
        reloj.setSegundos(24);
        System.out.println(reloj);
    }
}
