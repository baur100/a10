package HW8;

public class House {
    public String type;
    public String location;
    public int sizeOfsf;
    public int numberOflevel;

    public void info(String aName) {
        System.out.println(aName+" is living in "+location);
    }
    public void info1(String aType){
        System.out.println("This bilding has type "+type+".");
    }

}
