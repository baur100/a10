package homework10AF18;

public class Sandwiches extends Meat{
    private String Cheese;
    private Souses souse;

    public Sandwiches(String typeMeat, String roast, double ounce, String cheese, Souses souse) {
        super(typeMeat, roast, ounce);
        Cheese = cheese;
        this.souse = souse;
    }

    public String getCheese() {
        return Cheese;
    }

    public void setCheese(String cheese) {
        Cheese = cheese;
    }

    public Souses getSouse() {
        return souse;
    }

    public void setSouse(Souses souse) {
        this.souse = souse;
    }
}
