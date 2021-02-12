package lesson9;

public class Student {
    private String name;
    private String lastName;
    private int year;
    private String[]subjects;

    public Student(String name, String lastName, int year, String[] subjects) {
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.subjects = subjects;
    }

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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }
    public void printInfo(){
        System.out.println("Name = "+this.name+"\nLastName = " + this.lastName +
                "\nYear = "+this.year+"\nSubjects:");
        for (String v : this.subjects){
            System.out.println(v);
        }
    }
}
