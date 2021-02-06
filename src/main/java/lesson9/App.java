package lesson9;


public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Morrison";
        anna.year = 1995;

        Person1 jane = new Person1("Jane", "Morrison", 2005);
//        jane.setName("Jane");
        System.out.println(jane.getName());
//        jane.setYear(1989);
        System.out.println(jane.getYear());

        Venicle myCar = new Venicle();
        myCar.setMake("Toyota");
        myCar.setYear(2003);
        myCar.setModel("Supra");

        System.out.println("My car is "+myCar.getMake()+" "+myCar.getModel()+" "+myCar.getYear());

        Person1 david = new Person1();
    }
}