package HW10_NEW_Inheritance;

public class Vehicle {
    private String brand;
    private String model;
    private String makeOfCounty;

    public Vehicle(String brand, String model, String makeOfCounty) {
        this.brand = brand;
        this.model = model;
        this.makeOfCounty = makeOfCounty;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMakeOfCounty() {
        return makeOfCounty;
    }

    public void setMakeOfCounty(String makeOfCounty) {
        this.makeOfCounty = makeOfCounty;
    }
    public void printInfo(){
        System.out.println("Brand = "+this.brand+", Model = "+this.model+", Make of Country = "+this.makeOfCounty);

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", makeOfCounty='" + makeOfCounty + '\'' +
                '}';
    }
}
