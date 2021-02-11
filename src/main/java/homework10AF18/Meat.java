package homework10AF18;

public class Meat {
    private String typeMeat;
    private String roast;
    private double ounce;

    public Meat(String typeMeat, String roast, double ounce){
        this.typeMeat =typeMeat;
        this.roast=roast;
        this.ounce=ounce;
    }
    public void setTypeMeat(String typeMeat){
        this.typeMeat = typeMeat;
    }
    public String getTypeMeat(){
        return typeMeat;
    }

    public String getRoast() {
        return roast;
    }

    public void setRoast(String roast) {
        this.roast = roast;
    }

    public double getOunce() {
        return ounce;
    }

    public void setOunce(double ounce) {
        this.ounce = ounce;
    }
}
