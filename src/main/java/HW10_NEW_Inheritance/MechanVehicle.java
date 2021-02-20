package HW10_NEW_Inheritance;

import java.util.Arrays;

public class MechanVehicle extends Vehicle {
    protected String [] devices;

    public MechanVehicle(String brand, String model, String makeOfCounty, String[] devices) {
        super(brand, model, makeOfCounty);
        this.devices = devices;
    }

    public String[] getDevices() {
        return devices;
    }

    public void setDevices(String[] devices) {
        this.devices = devices;
    }
    public void printInfo1(){
        System.out.println("Devices = ");
        for(String v : devices) {
            System.out.println(v);
        }
    }


}
