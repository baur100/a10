package HW10_Inheritance;

public class Vehicle {
    protected String brand;
    protected String model;
    protected String make;

    public Vehicle(String brand, String model, String make) {
        this.brand = brand;
        this.model = model;
        this.make = make;
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

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
