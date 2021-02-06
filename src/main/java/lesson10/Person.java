package lesson10;

public class Person {
    private String name;
    private String lastName;
    private int year;

    public Person (String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return name;
    }

}
