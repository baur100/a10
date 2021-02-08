package Homework9_ov;

public class Person {
    protected String name;
    protected String lastName;
    protected int year;
    protected String  city;
    protected String country;

    public Person(String name, String lastName, int year,  String city, String country ) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.city = city;
        this.country = country;
    }

    public Person(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public void setYear(int year){
        if(year>2021 || year<1900){
            throw new IllegalArgumentException("Wrong year\n - year must be in the interval\n between 1900 and 2021 - you provided "+year);
        }
        this.year=year;
    }
    public int getYear(){
        return this.year;
    }

    public void setCountry(String country){ this.country = country; }
    public String getCountry(){ return country;}



}

