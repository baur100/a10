package lesson11;

public class ZManager extends Person{

    private String position;

    public ZManager(Name name, int year, String position) {
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
