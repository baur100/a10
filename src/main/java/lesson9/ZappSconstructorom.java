package lesson9;

public class ZappSconstructorom {
    public static void main(String[] args) {
        Person anna = new Person();
        anna.name = "Anna";
        anna.lastName = "Morrison";
        anna.year=1995;

        ZPerson1sConstructorom jane=new ZPerson1sConstructorom("Jane","Fonda",1901);
//        jane.setName("Jane");
//        jane.setLastName("Fonda");
//        jane.setYear(1901);
        System.out.println(jane.getName());
        System.out.println(jane.getLastName());
        System.out.println(jane.getYear());

        ZPerson1sConstructorom mira=new ZPerson1sConstructorom("Mira", "Smith");
        System.out.println(mira.getName());
        System.out.println(mira.getLastName());
        mira.setYear(1999);//если надо добавтьб год в последствии
    }

}

