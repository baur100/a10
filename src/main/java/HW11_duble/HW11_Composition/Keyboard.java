package HW11_duble.HW11_Composition;

public class Keyboard {
    private String brand;
    private String model;
    private KeyBoardType type;

    public Keyboard(String brand, String model, KeyBoardType type) {
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

    public KeyBoardType getType() {
        return type;
    }

    public void setType(KeyBoardType type) {
        this.type = type;
    }
}
