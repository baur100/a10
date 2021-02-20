package HW10_NEW_Inheritance;

import java.util.Arrays;

public class PassMechVehicleSUV extends PassengerMechanVehicle{
    protected String TypeOfWeelsDrive;

    public PassMechVehicleSUV(String brand, String model, String makeOfCounty, String[] devices, int numberOfSets, String typeOfWeelsDrive) {
        super(brand, model, makeOfCounty, devices, numberOfSets);
        TypeOfWeelsDrive = typeOfWeelsDrive;
    }

    public String getTypeOfWeelsDrive() {
        return TypeOfWeelsDrive;
    }

    public void setTypeOfWeelsDrive(String typeOfWeelsDrive) {
        TypeOfWeelsDrive = typeOfWeelsDrive;
    }

    public void printInfo3(){
        System.out.println("Type of WeelsDive = "+this.TypeOfWeelsDrive);
    }
}

