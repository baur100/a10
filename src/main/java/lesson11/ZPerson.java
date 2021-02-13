package lesson11;

public class ZPerson {
    private Name name;
    private int year;

    public ZPerson(Name name, int year) {
        this.name = name;
        this.year = year;
    }

    public Name getName() {
        return name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
