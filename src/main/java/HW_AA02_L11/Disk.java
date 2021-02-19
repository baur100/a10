package HW_AA02_L11;

public class Disk {
    private String brand;
    private int value;

    public Disk(String brand, int value) {
        this.brand = brand;
        this.value = value;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
