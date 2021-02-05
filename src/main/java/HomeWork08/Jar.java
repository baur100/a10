package HomeWork08;

public class Jar {
    public String name;
    public int quarter;
    public int dime;
    public int nickel;
    public int cent;

    public void amount() {
        System.out.println("In the "+name+" Jar are total "+(quarter*25+dime*10+nickel*5+cent)+" cents");
    }

    public int totalCoins() {
        return (quarter+dime+nickel+cent);
    }
}
