package lesson9;

public class ZPerson1 {
    private String name;
    private String lastName;
    private int year;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name=n;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String l){
        lastName=l;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year1){
        if (year1>2021 || year1<1900){
            throw new IllegalArgumentException("Wrong year");//проверка года
        }
        year=year1;
    }
}
