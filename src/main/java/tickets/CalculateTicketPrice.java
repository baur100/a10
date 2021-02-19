package tickets;

public class CalculateTicketPrice {
    private double basePrice;
    private int age;

    public CalculateTicketPrice(double basePrice, int age) {
        this.basePrice = basePrice;
        this.age = age;
    }
    public double getPrice(){
        if(this.age<=2){
            return 0;
        }
        if(this.age<13){
            return basePrice*0.5;
        }
        if(age>65){
            return this.basePrice*0.8;
        }
        return this.basePrice;
    }

}
