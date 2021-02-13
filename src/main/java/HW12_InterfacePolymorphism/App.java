package HW12_InterfacePolymorphism;

public class App {
    public static void main(String[] args) {
        Truck mack100=new Truck("Mack","100");
        Truck volvo=new Truck("Volvo","XC90");

        Car ford=new Car("Ford","Escort");
        Car toyota=new Car("Toyta","Camy");


        mack100.useDieselFuel();
        volvo.useDieselFuel();

        ford.useDieselFuel();
        toyota.useDieselFuel();

        mack100.carryHeavyCaro();
        volvo.carryHeavyCaro();

        ford.carryPassenger();
        toyota.carryPassenger();


    }
}
