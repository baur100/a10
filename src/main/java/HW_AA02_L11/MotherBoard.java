package HW_AA02_L11;

public class MotherBoard {
    private String brand;
    private String cpu;

    public MotherBoard(String brand, String cpu) {
        this.brand = brand;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
}
