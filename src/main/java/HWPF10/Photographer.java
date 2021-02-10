package HWPF10;

public class Photographer extends Human{

    private String subject;

    public  Photographer(String name, String lastName,int year,String subject){
        super(name, lastName, year);
        this.name = name;
        this.lastName = lastName;
        this.year = year;
        this.subject = subject;

    }


    public String getrsubject() {
        return subject;
    }

    public void setsubject() {
        this.subject = subject;
    }
}
