package model;

public class MobilePhone extends Product {
    private String brand;
    private String model;
    private int storageCapacity;

    public MobilePhone(String id, String name, double price, int quantity, String brand, String model,
            int storageCapacity) {
        super(id, name, price, quantity);
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand.trim();
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.trim().isEmpty()) {
            this.model = model.trim();
        }
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        if (storageCapacity > 0) {
            this.storageCapacity = storageCapacity;
        }
    }
}
