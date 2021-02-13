package hw11;

public class Monitor {
    private String brand;
    private String model;
    private String monitorType;

    public Monitor(String brand, String model, String monitorType) {
        this.brand = brand;
        this.model = model;
        this.monitorType = monitorType;
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

    public String getMonitorType() {
        return monitorType;
    }

    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
}
