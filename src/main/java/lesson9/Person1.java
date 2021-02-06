package lesson9;


public class Person1 {
    private String name;
    private String lastName;
    private int year;

    public Person1(String name, String lastName,int year){
        setYear(year);
        this.lastName=lastName;
        this.name=name;
    }
    public Person1(String name, String lastName){
        this.name=name;
        this.lastName=lastName;
    }
    public Person1(){}

    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
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
}
