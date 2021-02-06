package lesson8nik;

public class App1 {
    public static void main(String[] args) {
        Fruit apple = new Fruit();
        apple.color = "yellow";
        apple.name = "gala";

        Fruit orange = new Fruit();
        orange.name = "orange";
        orange.color = "orange";

        Person zarina = new Person();

        School newDorpHighSchool = new School();
        newDorpHighSchool.type = "public";
        newDorpHighSchool.ageGroup="High";
        newDorpHighSchool.name = "New Dorp High School";
        String info = newDorpHighSchool.getInfo();

        System.out.println(info);
    }
}
