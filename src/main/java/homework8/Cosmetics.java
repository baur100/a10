package homework8;

public class Cosmetics {
    public String name;
    public String brand;
    public String color;
    public double size;
    public int price;

    public void inventory (){
        System.out.println("We need more inventory of " +brand+ " " +color+ " " +name+ " " +size+ " ml");
    }

    public  String orders (){
        return "Customers ordering many " +color+ " " +name+ " by " +size+ " ml";
    }








}
