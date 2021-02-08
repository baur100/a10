package Homework9_ov;

public class EReader extends Customer{

    private String account;
    private String[] books;


    public EReader(String name, String lastName, int year, String city, String country, String account, String bookstyle, String[] books){

        super(name, lastName, year, city, country,bookstyle);
                this.books= books;
                this.account = account;
    }

    public void setAccount(String account){
        this.account= account;
    }

    public String getAccount(){
        return account;
    }

    public void printInfo(){
        System.out.println("This is a EReader "+ account+ "\nFirst name:" +getName()+"\nLast name:  "+getLastName()+"\nCity :  "+ getCity()+"\nGenre : "+getBookStyle());
    }

}
