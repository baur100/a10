package lesson12;

public class DesktopLight implements AmericanElectricalPlug, BulbE27{
    private String model;
    private int price;

    public DesktopLight(String model, int price) {
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

    public void turnMeOn(){
        System.out.println("Lamp is on");
    }
    public void turnMeOff(){
        System.out.println("OFF");
    }
    @Override
    public void useTwoFlatContacts() {
        System.out.println("I have two flat contacts with proper dimensions");
    }

    @Override
    public void useRoundContactForGround() {
        System.out.println("I dont have a ground contact because I dont need it");
    }

    @Override
    public void supportE27Bulb() {
        System.out.println("Can use E27 bulb");
    }
}
