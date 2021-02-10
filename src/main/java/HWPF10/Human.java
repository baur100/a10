package HWPF10;

public class Human {
    protected String name;
    protected String lastName;
    protected int year;

    public Human(String name,String lastName,int year){
        this.name = name;
        this.lastName = lastName;
        this.year = year;
    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getlastName(){
        return  lastName;
    }
    public void setLastName(){
        this.lastName = lastName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

