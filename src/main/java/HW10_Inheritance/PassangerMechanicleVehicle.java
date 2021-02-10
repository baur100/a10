package HW10_Inheritance;

public class PassangerMechanicleVehicle extends MechanicleVehicle{

    private int numberOfsets;

    public PassangerMechanicleVehicle(String brand, String model, String make, String[] devices, int numberOfsets) {
        super(brand, model, make, devices);
        this.numberOfsets = numberOfsets;
    }

    public int getNumberOfsets() {
        return numberOfsets;
    }

    public void setNumberOfsets(int numberOfsets) {
        this.numberOfsets = numberOfsets;
    }
}
