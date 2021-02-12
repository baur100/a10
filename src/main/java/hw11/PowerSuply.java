package hw11;

public class PowerSuply {
    private String brand;
    private String fan;
    private int watt;

    public PowerSuply(String brand, String fan, int watt) {
        this.brand = brand;
        this.fan = fan;
        this.watt = watt;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFan() {
        return fan;
    }

    public void setFan(String fan) {
        this.fan = fan;
    }

    public int getPower() {
        return watt;
    }

    public void setPower(int power) {
        this.watt = power;
    }

    @Override
    public String toString() {
        return "PowerSuply{" +
                "brand='" + brand + '\'' +
                ", fan='" + fan + '\'' +
                ", watt=" + watt +
                '}';
    }
}
