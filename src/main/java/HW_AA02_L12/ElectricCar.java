package HW_AA02_L12;

import HW_AA02_L12.Ecology;
import HW_AA02_L12.Fuel;

public class ElectricCar implements Ecology, Fuel {
    public String model;
    public String make;

    public ElectricCar(String model, String make) {
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
        System.out.println("This is car ecology friendly");
    }

    @Override
    public void useFuel() {
        System.out.println("This is car use electrical engine");
    }
}
