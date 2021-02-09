package lesson10;

public class Z_Person {
    protected String name;
    protected String lastname;
    protected int year;

    public Z_Person (String name,String lastname, int year){//Constructor
        this.name=name;
        this.lastname=lastname;
        this.year=year;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getLastname(){
        return this.lastname;
    }
    public void setLastname(String lastname){
        this.lastname=lastname;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year=year;
    }

}
