package Homework8_ov;

public class Customer {

    String customerFirstName;
    String customerLastName;
    String city;
    String bookStyle;


    public void like(){
        System.out.println(customerFirstName+""+customerLastName+" likes to read "+ bookStyle);
    }

    public void live(){
        System.out.println(customerFirstName+""+customerLastName+" lives in "+city);
    }

}
