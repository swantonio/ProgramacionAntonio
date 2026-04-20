package Practicas.EjVideojuego;

enum state {
    NUEVO, USADO
}

public class VideojuegoFisico extends Videojuego {
    private String shopBought;
    private state state;

    private final String SHOPBOUGHT_DEFAULT = "Game";
    private final state STATE_DEFAULT = Practicas.EjVideojuego.state.NUEVO;

    public VideojuegoFisico (String tittle, String platform, int note, String shopBought, state state) {
        super(tittle, platform, note);
        this.shopBought = shopBought;
        this.state = state;
    }

    public VideojuegoFisico () {
        super();
        this.shopBought = SHOPBOUGHT_DEFAULT;
        this.state = STATE_DEFAULT;
    }

    @Override
    public String getTipo () {
        return "Fisico";
    };

    public String getShopBought() {
        return shopBought;
    }

    public void setShopBought(String shopBought) {
        this.shopBought = shopBought;
    }

    public state getState() {
        return state;
    }

    public void setState(state state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Tienda: " + shopBought + "\n" +
                "Estado: " + state + "\n";
    }
}
