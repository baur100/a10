package lesson9;

import java.time.temporal.ValueRange;

public class Person1 {
    private String name;
    private String lastName;
    private int year;

    public Person1(String name, String lastName, int year) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }

    public Person1(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public Person1() {}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name=name;
    }
    public void setYear (int year1) {
        if(year1>2021 || year1<1900) {
            throw new IllegalArgumentException("Wrong year");
        }
        year=year1;
    }

    public int getYear() {
        return year;
    }
    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
}
