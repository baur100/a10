package hw11;

public class Mouse {
    private String brand;
    private String model;
    private boolean wireless;


    public Mouse(String brand, String model, boolean wireless) {
        this.brand = brand;
        this.model = model;
        this.wireless = wireless;
    }

    public Mouse() {}

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

    public boolean isWireless() {
        return wireless;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }


}
