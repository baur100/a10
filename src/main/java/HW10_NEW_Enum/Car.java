package HW10_NEW_Enum;

public class Car {
    private Brand brand;
    private Type type;
    private Manufacture manufacture;

    public Car(Brand brand, Type type, Manufacture manufacture) {
        this.brand = brand;
        this.type = type;
        this.manufacture = manufacture;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Manufacture getManufacture() {
        return manufacture;
    }

    public void setManufacture(Manufacture manufacture) {
        this.manufacture = manufacture;
    }

    public void printInfo(){
        System.out.println("Brand = "+this.brand+", Type = "+this.type+", Manufacture = "+this.manufacture);

    }
}
