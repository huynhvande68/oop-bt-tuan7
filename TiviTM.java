public class TiviTM extends Tivi {
    protected int colorSystem;
    protected String typeScreen;

    public TiviTM() {
        super();
        colorSystem = 8;
        typeScreen = "4K";
    }

    public TiviTM(String id, String model, int inche,
            double price, int colorSystem, String typeScreen) {
        super(id, model, inche, price);
        this.typeScreen = typeScreen;
        if (colorSystem == 8 || colorSystem == 16 || colorSystem == 32) {
            this.colorSystem = colorSystem;
        } else {
            this.colorSystem = 16;
        }

        if (typeScreen == "HD" || typeScreen == "4K" || typeScreen == "QLED") {
            this.typeScreen = typeScreen;
        } else {
            this.typeScreen = "HD";
        }
    }

    public int getColorSystem() {
        return colorSystem;
    }

    public void setColorSystem(int colorSystem) {
        this.colorSystem = colorSystem;
    }

    public String getTypeScreen() {
        return typeScreen;
    }

    public void setTypeScreen(String typeScreen) {
        this.typeScreen = typeScreen;
    }

    public String toString() {
        return "TiviTM [id=" + id + ", model=" + model + ", inche=" + inche + ", price=" + price + " colorSystem="
                + colorSystem + ", typeScreen=" + typeScreen + "]";
    }

}
