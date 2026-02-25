package Actividad2;

import java.util.ArrayList;
import java.util.List;

public class Cartera {
    public List <Billete> listaBillete = new ArrayList<>(5);
    public List <Tarjeta> listaTarjeta = new ArrayList<>(5);

    public List<Billete> BILLETE_DEFAULT = new ArrayList<>();
    public List<Tarjeta> TARJETA_DEFAULT = new ArrayList<>();

    public Cartera(List <Billete> listaBillete, List <Tarjeta> listaTarjeta) {
        this.listaBillete = listaBillete;
        this.listaTarjeta = listaTarjeta;
    }

    public Cartera () {
        this.listaBillete = BILLETE_DEFAULT;
        this.listaTarjeta = TARJETA_DEFAULT;
    }

    public List<Billete> getListaBillete() {
        return listaBillete;
    }

    public void setListaBillete(List<Billete> listaBillete) {
        this.listaBillete = listaBillete;
    }

    public List<Tarjeta> getListaTarjeta() {
        return listaTarjeta;
    }

    public void setListaTarjeta(List<Tarjeta> listaTarjeta) {
        this.listaTarjeta = listaTarjeta;
    }
}
