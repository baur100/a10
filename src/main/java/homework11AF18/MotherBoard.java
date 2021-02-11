package homework11AF18;

public class MotherBoard {
    private String brand;
    private String chipset;

    public MotherBoard(String brand, String chipset) {
        this.brand = brand;
        this.chipset = chipset;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getChipset() {
        return chipset;
    }

    public void setChipset(String chipset) {
        this.chipset = chipset;
    }
}
