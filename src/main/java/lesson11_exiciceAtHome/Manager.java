package lesson11_exiciceAtHome;

public class Manager extends Person{
    private String position;

    public Manager(Name name, int year, String position) {
        super(name, year);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
