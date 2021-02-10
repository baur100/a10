package HW10_Inheritance;

public class MechanicleVehicle extends Vehicle{
    protected String[] devices;

    public MechanicleVehicle(String brand, String model, String make, String[] devices) {
        super(brand, model, make);
        this.devices = devices;
    }

    public String[] getDevices() {
        return devices;
    }

    public void setDevices(String[] devices) {
        this.devices = devices;
    }
}
