package lesson9;

public class ZStudent {
    private String name;
    private String lastname;
    private int year;
    private String[] subjects;

    public ZStudent(String name, String lastname, int year, String[] subjects) {// Constructor
        this.name = name;
        this.lastname = lastname;
        this.year = year;
        this.subjects = subjects;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String[] getSubjects() {
        return this.subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public void printinfo(){    //Метод принт класс для распечатки всех подей
        System.out.println("Name = "+this.name+" LastName = "+this.lastname+" Year = "+this.year+"Subjects:");
        for(String v : this.subjects){
            System.out.println(v);
        }
    }
}
