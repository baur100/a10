package HW10_NEW_Enum;

public class App {
    public static void main(String[] args) {
        Car toyota = new Car(Brand.TOYOTA, Type.SEDAN, Manufacture.JAPAN);
        toyota.printInfo();

        Car ford = new Car(Brand.FORD, Type.SUV, Manufacture.JAPAN);
        ford.printInfo();
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        Destination[] destinationsAsia = {Destination.CHINA, Destination.INDIA, Destination.RUSSIA};
        Plane aeroflot = new Plane(Brand.SUHOI, Manufacture.RUSSIA, Type.PASSENGER, destinationsAsia);
        aeroflot.printInfo();

        Destination[] destinationsAmerica = {Destination.USA, Destination.CHILI, Destination.ARGENTINA};
        Plane boing=new Plane(Brand.BOING,Manufacture.USA,Type.CARGO,destinationsAmerica);
        boing.printInfo();


    }
}
