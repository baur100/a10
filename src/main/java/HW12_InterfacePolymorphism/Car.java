package HW12_InterfacePolymorphism;

public class Car implements VehiclelFuel,Passenger {
    private String brand;
    private String model;

    public Car(String brand, String model) {
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
        System.out.println("Car can use only Gasoline");

    }

    @Override
    public void carryPassenger() {
        System.out.println("This car can carry passengers over 3");
    }
}
