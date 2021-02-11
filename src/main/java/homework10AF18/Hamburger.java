package homework10AF18;

public class Hamburger extends Meat {
    private String vegetables;
    private String bun;
    private Souses souse;


    public Hamburger(String typeMeat, String roast, double ounce, String vegetables, String bun, Souses souse) {
        super(typeMeat, roast, ounce);
        this.vegetables = vegetables;
        this.bun = bun;
        this.souse = souse;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    public String getBun() {
        return bun;
    }

    public void setBun(String bun) {
        this.bun = bun;
    }

    public Souses getSouse() {
        return souse;
    }

    public void setSouse(Souses souse) {
        this.souse = souse;
    }
}
