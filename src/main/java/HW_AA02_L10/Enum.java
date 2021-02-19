package HW_AA02_L10;

public class Enum {
    private String name;
    private String lastName;
    private CarModel make;

    public Enum(String name, String lastName, CarModel make){
        this.name=name;
        this.lastName=lastName;
        this.make=make;
    }

    public Enum(){}

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public CarModel getMake(){
        return make;
    }

    public void setMake(CarModel make){
        this.make=make;
    }

    public void printClass(){
        System.out.println("Name: "+getName()+"\nLast name: "+getLastName()+"\nCar Model: "+getMake());
    }
}
