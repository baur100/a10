package hw11;

public class Disk {
    private String brand;
    private String model;
    private String diskType;

    public Disk(String brand, String model, String diskType) {
        this.brand = brand;
        this.model = model;
        this.diskType = diskType;
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

    public String getDiskType() {
        return diskType;
    }

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
}
