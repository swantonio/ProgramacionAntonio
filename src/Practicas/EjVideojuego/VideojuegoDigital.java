package Practicas.EjVideojuego;

public class VideojuegoDigital extends Videojuego {
    private String onlineShop;
    private double gB;

    private final String ONLINESHOP_DEFAULT = "g2a";
    private final double GB_DEFAULT = 100;

    public VideojuegoDigital (String tittle, String platform, int note, String onlineShop, double gB) {
        super(tittle, platform, note);
        this.onlineShop = onlineShop;
        this.gB = gB;
    }

    public VideojuegoDigital () {
        super();
        this.onlineShop = ONLINESHOP_DEFAULT;
        this.gB = GB_DEFAULT;
    }

    @Override
    public String getTipo () {
        return "Digital";
    }

    public String getOnlineShop() {
        return onlineShop;
    }

    public void setOnlineShop(String onlineShop) {
        this.onlineShop = onlineShop;
    }

    public double getgB() {
        return gB;
    }

    public void setgB(double gB) {
        this.gB = gB;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tienda Online: " + onlineShop + "\n" +
                "Tamaño: " + gB + " GB\n";
    }
}
