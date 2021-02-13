package HW_AA02_L12;

public class EngineCar implements Ecology, Fuel {
    public String model;
    public String make;

    public EngineCar(String model, String make) {
        this.model = model;
        this.make = make;
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

    @Override
    public void ecologyFriendly() {
        System.out.println("This is car not ecology");
    }

    @Override
    public void useFuel() {
        System.out.println("This is car use gasoline engine");
    }
}
