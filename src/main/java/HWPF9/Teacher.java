package HWPF9;

public class Teacher {
    private String name;
    private String lastName;
    private int year;
    private String[] subjects;

    public Teacher(String name, String lastName, int year, String[] subjects){
        this.name=name;
        this.lastName=lastName;
        this.year=year;
        this.subjects=subjects;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setYear(){
        this.year=year;
    }
    public int getYear(){
        return year;
    }
    public void setSubject(String[] subjects){
        this.subjects=subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }
    public void printClass(){
        System.out.println("Name="+this.name+"\nlastName ="+ this.lastName+"\nYear = "+this.year+"\nSubjects:");
        for (String v : subjects){
            System.out.println(v);
        }
    }

}
