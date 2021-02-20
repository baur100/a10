package HW10_NEW_Inheritance;

public class ElectVehicle extends Vehicle{
    protected String TypeOfBattery;

    public ElectVehicle(String brand, String model, String makeOfCounty, String typeOfBattery) {
        super(brand, model, makeOfCounty);
        TypeOfBattery = typeOfBattery;
    }

    public String getTypeOfBattery() {
        return TypeOfBattery;
    }

    public void setTypeOfBattery(String typeOfBattery) {
        TypeOfBattery = typeOfBattery;
    }
}
