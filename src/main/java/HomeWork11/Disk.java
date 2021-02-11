package HomeWork11;

public class Disk {
    private String brand;
    private String model;
    private String type;
    private int volume;

    public Disk(String brand, String model, String type, int volume) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.volume = volume;
    }

    public Disk() {}

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

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
