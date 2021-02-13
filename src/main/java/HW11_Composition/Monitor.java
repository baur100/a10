package HW11_Composition;

public class Monitor {
    private String brand;
    private String typeMonitors;
    private int screenResolution;

    public Monitor(String brand, String typeMonitors, int screenResolution) {
        this.brand = brand;
        this.typeMonitors = typeMonitors;
        this.screenResolution = screenResolution;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getTypeMonitors() {
        return typeMonitors;
    }

    public void setTypeMonitors(String typeMonitors) {
        this.typeMonitors = typeMonitors;
    }

    public int getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(int screenResolution) {
        this.screenResolution = screenResolution;
    }
}
