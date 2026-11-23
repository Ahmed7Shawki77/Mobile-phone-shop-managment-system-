package model;

public class Accessory extends Product {
    private String type;
    private String color;
    private String compatibility;

    public Accessory(String id, String name, double price, int quantity, String type, String color,
            String compatibility) {
        super(id, name, price, quantity);
        this.type = type;
        this.color = color;
        this.compatibility = compatibility;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCompatibility() {
        return compatibility;
    }

    public void setCompatibility(String compatibility) {
        this.compatibility = compatibility;
    }
}
