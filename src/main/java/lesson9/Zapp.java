package lesson9;

public class Zapp {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Morrison";
        anna.year=1995;

        Person1 jane=new Person1();
        jane.setName("Jane");
        jane.setLastName("Fonda");
        jane.setYear(1901);
        System.out.println(jane.getName());
        System.out.println(jane.getYear());
    }

}

