package lesson12_exerciseAtHome;

public class DesctopLight implements AmericanElectricalPlug,BulbE27 {
    private String model;
    private int price;

    public DesctopLight(String model, int price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void turnMeOn() {
        System.out.println("Lamp is on");
    }

    public void turnMeOff(){
        System.out.println("Lamp id off");
    }



    @Override
    public void useTwoFlatContacts() {
        System.out.println("I have two flat contacts with proper dimentions");
    }

    @Override
    public void useRoundContactForGround() {
        System.out.println("I do not have a ground contact because I do not need it");

    }

    @Override
    public void supportE27Bulb() {
        System.out.println("Can use E27 bulb");
    }
}
