package hw11;

public class Device {
    private  String brand;
    private  String modal;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModal() {
        return modal;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }

    public Device(String brand, String modal) {
        this.brand = brand;
        this.modal = modal;

    }
}

