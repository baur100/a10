package HW10_Inheritance;

public class ElectricVehicle extends Vehicle{

    private String typeOfBattery;

    public ElectricVehicle(String brand, String model, String make, String typeOfBattery) {
        super(brand, model, make);
        this.typeOfBattery = typeOfBattery;
    }

    public String getTypeOfBattery() {
        return typeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        this.typeOfBattery = typeOfBattery;
    }
}
