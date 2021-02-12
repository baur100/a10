package lesson8;

public class App {
    public static void main(String[] args) {

        Person alex = new Person();
        alex.name = "Alex";
        alex.lastName= "Geiman";
        alex.yearOfBirth=1999;
        System.out.println(alex.lastName);
        alex.hello("Jane");

        Person jane = new Person();
        jane.name = "Jane";
        jane.yearOfBirth = 2001;
        jane.lastName = "Wilson";
        jane.hello("David");


        Person maria = new Person();
        maria.name="Maria";
        maria.lastName = "Small";
        maria.yearOfBirth = 1995;


        Vehicle myCar = new Vehicle();
        myCar.color="Yellow";
        myCar.make="Toyota";
        myCar.model="Prius";
        myCar.year=2015;

        myCar.beep();
        myCar.drive();

        Vehicle mazda6 = new Vehicle();
        mazda6.make = "Mazda";
        mazda6.model="6";
        mazda6.color="Red";
        mazda6.beep();
        mazda6.drive();



    }
}
