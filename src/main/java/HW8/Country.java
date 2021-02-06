package HW8;

public class Country {
    public String name;
    public String continent;
    public int population;
    public int sizeOfarea;

    public void infoMaker(String aName) {
        System.out.println(aName + " was built in " + name + ".");
    }

    public void distination(String aaName) {
        System.out.println(aaName + " is flying to the " + name + ".");


    }
    public void distination1(String bName){
        System.out.println(bName+" is flying to the " + name + ".");
    }
}
