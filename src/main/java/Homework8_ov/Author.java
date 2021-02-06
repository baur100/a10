package Homework8_ov;

public class Author {

    public String authorFirstName;
    public String authorLastName;
    public String authorStyle;
    public int authorYearOfBirth;
    public String authorCountry;
    public String nameOfBook;

    public void write(){
        System.out.println( authorFirstName+" "+ authorLastName+" "+"has written"+ " "+nameOfBook);
    }

    public void style(){
        System.out.println("The book is a "+ authorStyle);
    }

    public void authorWasBorn(){
        System.out.println("Author was born in "+ authorYearOfBirth +"in "+ authorCountry);
    }

}
