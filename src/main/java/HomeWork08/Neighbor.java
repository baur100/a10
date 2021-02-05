package HomeWork08;

public class Neighbor {
    public String name;
    public String lastName;
    public int apartment;

    public void hi() {
        System.out.println(name+" from apartment "+apartment+" is saying hi to you");
    }
    public int floor() {
        return (apartment/4+1);     //предположим что на этаже 4 квартиры.
    }
}
