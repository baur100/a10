package lesson9nik;

import java.net.SocketOption;

public class Person1 {
    private String name;
    private String lastName;
    private int year;

    public Person1(String name, String lastName, int year){
        this.year=year;
        this.lastName=lastName;
        this.name=name;
    }
    public Person1(String name, String lastName) {
        this.name=name;
        this.lastName=lastName;
    }

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String(lastName){
        this.lastName=lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n){
        name=n;
    }

    public void setYear(int year1){
        if(year1>2021 || year1<1900)
            throw new IllegalAccessException("Wrong year");
    }
    year=year1;
}

