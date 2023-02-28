
public class Tivi {
    protected String id;
    protected String model;
    protected int inche;
    protected double price;

    public Tivi() {
        id = "TV123";
        inche = 40;
        model = "Sony";
        price = 0.0;
    }

    public Tivi(String id, String model, int inche, double price) {
        this.id = id;
        this.model = model;
        this.price = price;
        if (inche == 32 || inche == 40 || inche == 43 || inche == 49 || inche == 50 || inche == 55) {
            this.inche = inche;
        } else {
            this.inche = 32;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getInche() {
        return inche;
    }

    public void setInche(int inche) {
        this.inche = inche;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "Tivi [id=" + id + ", model=" + model + ", inche=" + inche + ", price=" + price + "]";
    }

}