package hw11;

public class Keyboard {
    private String brand;
    private String model;
    private int keys;


    public Keyboard(String brand, String model, int keys) {
        this.brand = brand;
        this.model = model;
        this.keys = keys;
    }

    public Keyboard () {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getKeys() {
        return keys;
    }

    public void setKeys(int keys) {
        this.keys = keys;
    }
}
