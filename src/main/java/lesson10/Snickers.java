package lesson10;

public class Snickers {
    private String brand;
    private String model;
    private Colors color;

    public Snickers(String brand, String model, Colors color) {
        this.brand = brand;
        this.model = model;
        this.color = color;
    }

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

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }
}
