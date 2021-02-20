package HW10_NEW_Inheritance;

public class PassMechVehicleSedan extends PassengerMechanVehicle{
    protected String NumberOfDoors;

    public PassMechVehicleSedan(String brand, String model, String makeOfCounty, String[] devices, int numberOfSets, String numberOfDoors) {
        super(brand, model, makeOfCounty, devices, numberOfSets);
        NumberOfDoors = numberOfDoors;
    }

    public String getNumberOfDoors() {
        return NumberOfDoors;
    }

    public void setNumberOfDoors(String numberOfDoors) {
        NumberOfDoors = numberOfDoors;
    }

public void printInfo4(){
    System.out.println("Number of Doors = "+this.NumberOfDoors);
}
}
