package homework11AF18;

public class Mouse {
    private String brand;
    private String model;
    private int lengthCable;

    public Mouse(String brand, String model, int lengthCable) {
        this.brand = brand;
        this.model = model;
        this.lengthCable = lengthCable;
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

    public int getLengthCable() {
        return lengthCable;
    }

    public void setLengthCable(int lengthCable) {
        this.lengthCable = lengthCable;
    }
}
