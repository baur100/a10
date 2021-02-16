package HW13_ArrayList;

public class Plane {
    private String brand;
    private String name;
    private int set;

    public Plane(String brand, String name, int set) {
        this.brand = brand;
        this.name = name;
        this.set = set;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSet() {
        return set;
    }

    public void setSet(int set) {
        this.set = set;


    }
    public void printInfo(){
        System.out.println("Brand = "+
        this.brand+", Name = "+this.name);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", set=" + set +
                '}';
    }
}
