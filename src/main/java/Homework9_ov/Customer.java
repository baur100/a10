package Homework9_ov;

enum Genre {DETECTIVE, FICTION, NOVEL, NON_FICTION, FANTASY, MYSTERY, SCIENCE_FICTION}
public class Customer  extends Person{

    private String bookStyle;
    private Genre genre= Genre.SCIENCE_FICTION;


    public Customer(String customerFirstName, String customerLastName, int year, String city,String country, String bookStyle) {
        super(customerFirstName,  customerLastName, year,  city, country);

        this.bookStyle = bookStyle;
    }

    public Customer(){}




    public String getBookStyle() {
        return bookStyle;
    }

    public void setBookStyle(String bookStyle) {
        this.bookStyle = bookStyle;
    }

    public void like2Read(){
        System.out.println("Likes to read "+ Genre.SCIENCE_FICTION);

    }

    public void like(){
        System.out.println(getName()+""+getLastName()+" likes to read "+ getBookStyle());
    }

    public void live(){
        System.out.println(getName()+""+getLastName()+" lives in "+getCity());
    }

    public  void printInfo(){

        System.out.println("First name : "+ getName()+ "\nLast name : "+getLastName()+"\nCity :  "+ getCity()+"\nGenre : "+getBookStyle());
    }

}
