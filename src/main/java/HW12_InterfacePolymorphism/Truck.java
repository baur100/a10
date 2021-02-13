package HW12_InterfacePolymorphism;

public class Truck implements VehiclelFuel,Cargo {
    private String brand;
    private String model;

    public Truck(String brand, String model) {
        this.brand = brand;
        this.model = model;
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

    @Override
    public void useDieselFuel() {
        System.out.println("This vehicle can use Diesel Fuel");

    }

    @Override
    public void carryHeavyCaro() {
        System.out.println("This truck can carry very heavy cargo");
    }
}
