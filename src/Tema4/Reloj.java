package Tema4;

public class Reloj {
    public int hora;
    public int Minutos;
    public int Segundos;
    boolean formato24;
    boolean ampm;
    public static final int hDefault = 0;
    public static final int hMinutos = 0;
    public static final int hSegundos = 0;

    public Reloj () {
        this.Hora = 0;
        this.Minutos = 60;
        this.Segundos = 60;
        this.formato24 = false;
    }
    public Reloj (boolean formato24, int Hora, int Minutos, int Segundos) {
        this.formato24 = formato24;
        this.Hora = Hora;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
    }

    public void horafinal () {
        if (formato24) {
            System.out.println("Son las " + Hora + ":" + Minutos + ":" + Segundos);
        } else if (ampm) {
            System.out.println("Son las " + Hora + ":" + Minutos + ":" + Segundos + "AM");
        } else {
            System.out.println("Son las " + Hora + ":" + Minutos + ":" + Segundos + "PM");
        }
    }
    public void setHora (int Hora) {
        if (formato24) {
            if (Hora >= 0 && Hora <= 24) {
                this.Hora = Hora;
            } else {
                this.Hora = 0;
            }
        } else {
            if (Hora >= 12 && Hora <= 24) {
                this.Hora = Hora - 12;
                this.ampm = false;
            } else {
                this.Hora = hDefault;
                this.ampm = true;
            }
        }
    }
    public void setMinutos (int Minutos) {
        if (Minutos >=0 && Minutos <= 60) {
            this.Minutos = Minutos;
        } else {
            this.Minutos = hMinutos;
        }
    }

    public void setSegundos(int Segundos) {
        if (Segundos >=0 && Segundos <= 60) {
            this.Segundos = Segundos;
        } else {
            this.Segundos = hSegundos;
        }
    }
    public void setFormato24 () {
        if (!formato24) {
            if (Hora >= 12) {
                this.Hora = Hora - 12;
            }
        }
    }
    public int getHora () {
        return Hora;
    }
    public int getMinutos () {
        return Minutos;
    }
    public int getSegundos () {
        return Segundos;
    }
    public boolean getFormato24 () {
        return formato24;
    }
    public String toString () {
        if (formato24) {
            return "Son las " + Hora + ":" + Minutos + ":" + Segundos;
        } else if (ampm) {
            return "Son las " + Hora + ":" + Minutos + ":" + Segundos + "AM";
        } else {
            return "Son las " + Hora + ":" + Minutos + ":" + Segundos + "PM";
        }
    }
}
