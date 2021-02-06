package lesson9nik;

public class App {
    public static void main(String[] args) {
        Person anna =  new Person();
        anna.name ="Anna";
        anna.lastName = "Morrison";
        anna.year = 1995;

        System.out.println(anna.name);

        Person1 mira = new Person1()

        Person1 jane = new Person1(name: "Name", lastName: "Honda", year: "2010");
//        Person1 jane = new Person1();
//        jane.setName("Jane");

        System.out.println(jane.getName());

        jane.setYear(1950);

        Vehicle myCar = new Vehicle();
        myCar.setMake("Toyota");
        myCar.setYear("2005");
        myCar.setModel("Venza");

        System.out.println("Make = "+myCar.getMake( = "Model = " + myCar.setModel()+ " year = " + myCar.getYear());

        Person1 david = new Person1();
        david.setName("David");
        david.setLastName("");
        david.setYear("");
    }
}
