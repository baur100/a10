package homework10AF18;

public class ComboMeal extends Sandwiches{
    private String comboName;
    private Beverages beverage;
    private int amount;

    public ComboMeal(String typeMeat, String roast, double ounce, String cheese, Souses souse, String comboName,Beverages beverage,int amount){
        super(typeMeat, roast, ounce, cheese, souse);
        this.comboName=comboName;
        this.beverage=beverage;
        this.amount=amount;
    }
    public void setComboName(String comboName){
        this.comboName=comboName;
    }
    public String getComboName(){
        return comboName;
    }

    public Beverages getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverages beverage) {
        this.beverage = beverage;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
