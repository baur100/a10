package HW8;

public class Plane {
    public String name;
    public int model;
    public String manufacturer;
    public String country;
    public int numberOfsets;

    public void info() {
        System.out.println("The plane " + name + " " + model + " was built by " + manufacturer + ".");

    }

    public void toCountry(String countryName){
        System.out.println(name+" is flying to "+countryName);

    }
    public void twoDistinations (String country1, String country2){
        System.out.println(name+ " is flying to "+country1+" and "+country2);
    }
}