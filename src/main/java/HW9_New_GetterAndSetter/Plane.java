package HW9_New_GetterAndSetter;

public class Plane {
    private String brand;
    private String name;
    private int numberOfSets;
    private String typeOfPlane;
    private String[] userCountry;


    public Plane(String brand, String name, int numberOfSets, String typeOfPlane, String[] userCountry) {
        this.brand = brand;
        this.name = name;
        this.numberOfSets = numberOfSets;
        this.typeOfPlane = typeOfPlane;
        this.userCountry = userCountry;
    }

    public Plane() {   //Empty constructor
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

    public int getNumberOfSets() {
        return numberOfSets;
    }

    public void setNumberOfSets(int numberOfSets) {
        this.numberOfSets = numberOfSets;
    }

    public String getTypeOfPlane() {
        return typeOfPlane;
    }

    public void setTypeOfPlane(String typeOfPlane) {
        this.typeOfPlane = typeOfPlane;
    }

    public String[] getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String[] userCountry) {
        this.userCountry = userCountry;
    }

//    @Override
//    public String toString() {
//        return "Plane{" +
//                "brand='" + brand + '\'' +
//                ", name='" + name + '\'' +
//                ", numberOfSets=" + numberOfSets +
//                ", typeOfPlane='" + typeOfPlane + '\'' +
//                ", userCountry=" + Arrays.toString(userCountry) +
//                '}';
//    }

    public void printinfo() {
        System.out.println("Brand = " + this.brand + ", Name = " + this.name + ", Number of Sets = " + numberOfSets + ", Type of Plane = " + typeOfPlane);
        for (String v : userCountry) {
            System.out.println(v);
        }
    }
}