package HW10_NEW_Inheritance;

public class PassengerMechanVehicle extends MechanVehicle{
    protected int NumberOfSets;

    public PassengerMechanVehicle(String brand, String model, String makeOfCounty, String[] devices, int numberOfSets) {
        super(brand, model, makeOfCounty, devices);
        NumberOfSets = numberOfSets;
    }

    public int getNumberOfSets() {
        return NumberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        NumberOfSets = numberOfSets;
    }
    public void printInfo2(){
        System.out.println("Number of Sets = "+this.NumberOfSets);
    }



}
