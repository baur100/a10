package homework10AF18;

public class Meal extends Hamburger                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             {
    private String type;
    private Beverages beverage;

    public Meal(String typeMeat, String roast, double ounce, String vegetables, String bun, Souses souse, String type, Beverages beverage) {
        super(typeMeat, roast, ounce, vegetables, bun, souse);
        this.type = type;
        this.beverage = beverage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Beverages getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverages beverage) {
        this.beverage = beverage;
    }
}
