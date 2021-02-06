package lesson10nik;

public class OnlineStudent extends Student{
    private String location;

    public OnlineStudent(String name, String lastName, int year, String location) {
        super(name, lastName, year);
        this.location = location;
    }
}
