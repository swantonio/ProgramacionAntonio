package Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Tragaperras {
    static void main() {
        int valor = 1;
        String numero = "10542154";
        String numero2 = "45646546";
        double saldo = 25;
        double credito = 40;

        Billete Billete1 = new Billete(valor);
        Billete Billete2 = new Billete(valor);
        Billete Billete3 = new Billete(valor);

        Tarjeta Tarjeta1 = new Tarjeta(numero, saldo, credito);
        Tarjeta Tarjeta2 = new Tarjeta(numero2, saldo, credito);

        List<Billete> ListaBillete = new ArrayList<>();
        ListaBillete.add(Billete1);
        ListaBillete.add(Billete2);
        ListaBillete.add(Billete3);
        List<Tarjeta> ListaTarjeta = new ArrayList<>();
        ListaTarjeta.add(Tarjeta1);
        ListaTarjeta.add(Tarjeta2);

        Cartera Cartera1 = new Cartera(ListaBillete, ListaTarjeta);
    }
}
