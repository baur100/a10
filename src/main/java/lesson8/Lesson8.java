package lesson8;

public class Lesson8 {
    public static void main(String[] args) {
        Person alex = new Person();
        alex.name = "Alex";
        alex.lastName = "Geiman";
        alex.yearOfBirth = 1999;

        System.out.println(alex.lastName);
        Person jane = new Person();
        jane.name = "Jane";
        jane.lastName = "Popper";
        jane.yearOfBirth = 2001;

        alex.hello(jane.name);
        Person maria = new Person();
        maria.name = "Maria";
        maria.lastName = "Small";
        maria.yearOfBirth = jane.yearOfBirth;

        Vehicle myCar = new Vehicle();
        myCar.color = "Green";
        myCar.make = "Toyota";
        myCar.model = "Supra";
        myCar.year = 2015;

        myCar.drive();



    }
}
