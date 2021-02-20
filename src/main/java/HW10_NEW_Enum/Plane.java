package HW10_NEW_Enum;

public class Plane {
    private Brand brand;
    private Manufacture manufacture;
    private Type type;
    private Destination [] destinations;

    public Plane(Brand brand, Manufacture manufacture, Type type, Destination[] destinations) {
        this.brand = brand;
        this.manufacture = manufacture;
        this.type = type;
        this.destinations = destinations;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Destination[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destination[] destinations) {
        this.destinations = destinations;
    }
    public void printInfo(){
        System.out.println("Brand = "+this.brand+
                ", Manufacture = "+this.manufacture+
                ", Type = "+this.type+", Destinations = ");
        for(Destination v :destinations){
            System.out.println(v);
        }
    }
}
