package homework11AF18;

public class PowerSuply {
    private int wattage;
    private String fanType;
    private String brand;

    public PowerSuply(int wattage, String fanType, String brand) {
        this.wattage = wattage;
        this.fanType = fanType;
        this.brand = brand;
    }

    public int getWattage() {
        return wattage;
    }

    public void setWattage(int wattage) {
        this.wattage = wattage;
    }

    public String getFanType() {
        return fanType;
    }

    public void setFanType(String fanType) {
        this.fanType = fanType;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
