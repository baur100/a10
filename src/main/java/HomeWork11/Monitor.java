package HomeWork11;

public class Monitor {
    private String brand;
    private String model;
    private int size;
    private int res;

    public Monitor(String brand, String model, int size, int res) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.res = res;
    }

    public Monitor() {}

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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
