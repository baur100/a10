package hw11;

public class Keyboard {
    private String brand;
    private String model;
    private String type;

    public Keyboard(String brand, String model, String type) {
        this.brand = brand;
        this.model = model;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
