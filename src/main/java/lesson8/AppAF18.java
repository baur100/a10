package lesson8;

public class AppAF18 {
    public static void main(String[] args) {
        PersonAF18 Alex= new PersonAF18();
        Alex.name="Alex";
        Alex.lastName="Petrov";
        Alex.yearOfBirth=1999;

        System.out.println(Alex.lastName);
        Alex.hello("Jane");

    }
}
