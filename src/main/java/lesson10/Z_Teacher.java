package lesson10;

public class Z_Teacher extends Person{
        private String subject;

    public Z_Teacher(String name, String lastname, int year, String subject) {
        super(name,lastname,year);

        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}


