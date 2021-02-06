package lesson9;

public class App {
    public static void main(String[] args) {
        Person anna = new Person();
        anna. name = "Anna";
        anna.lastName="Morrison";
        anna.year = 1950;

        System.out.println(anna.name);

        Person1 jane = new Person1("Jane","Fonda",1980);
//        jane.setName("Jane");
        System.out.println(jane.getName());
        jane.setYear(1950);
        Person1 mira = new Person1("Mira","Smith");
        mira.setYear(1999);

        Vehicle myCar = new Vehicle();
        myCar.setMake("Toyota");
        myCar.setYear(2005);
        myCar.setModel("Venza");

        System.out.println("Make = "+myCar.getMake() +
                " Model = " + myCar.getModel()+ " year = " + myCar.getYear());

        Person1 david = new Person1();
        david.setName("David");
        david.setLastName("Morris");
        david.setYear(1956);

    }
}
