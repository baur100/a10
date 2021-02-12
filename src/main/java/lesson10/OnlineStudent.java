package lesson10;

public class OnlineStudent extends Student{
    private String location;
    public OnlineStudent(String name, String lastName, int year, String[] listOfSubjects, String location) {
        super(name, lastName, year, listOfSubjects);
        this.location=location;
    }
}
