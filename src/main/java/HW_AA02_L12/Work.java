package HW_AA02_L12;

public class Work {
    public static void main(String[]args){

        ElectricCar tesla = new ElectricCar("Model 3", "Tesla");
        ElectricCar Chevrolet = new ElectricCar("Bolt", "Chevrolet");

        EngineCar toyota = new EngineCar("Corolla", "Toyota");
        EngineCar bmw = new EngineCar("X5", "BMW");

        tesla.ecologyFriendly();
        tesla.useFuel();

        Chevrolet.ecologyFriendly();
        Chevrolet.useFuel();

        toyota.ecologyFriendly();
        toyota.useFuel();

        bmw.ecologyFriendly();
        bmw.useFuel();
    }
}
