package HW10_NEW_Inheritance;

public class App {
    public static void main(String[] args) {
        String[] devices = {"Radio", "ABS", "ParkTronik"};
        PassMechVehicleSUV myCar = new PassMechVehicleSUV("Toyota", "RAV4",
                "Japan", devices, 6, "AWD");
        myCar.printInfo();
        myCar.printInfo1();
        myCar.printInfo2();
        myCar.printInfo3();


        PassMechVehicleSedan myWifeCar = new PassMechVehicleSedan("Honda", "Civik",
                "Japan", devices, 6, "4");
        myWifeCar.printInfo();
        myWifeCar.printInfo1();
        myWifeCar.printInfo2();
        myWifeCar.printInfo4();

    }
}
