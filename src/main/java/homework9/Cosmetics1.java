package homework9;

public class Cosmetics1 {
    private String name;
    private String brand;
    private double size;
    private String [] color;

    public Cosmetics1(String name, String brand, double size, String[]color){
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public void printInfoColor () {
        System.out.println("Name = " + name + "\nBrand is " + brand + "\nSize of this product is " + size + " ml" + "\nAvailable colors are:");
        for (String v : color) {
            System.out.println(v);
        }
    }


    public Cosmetics1(){}


    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }
    public void setSize(double size){
        this.size = size;
    }
    public double getSize(){
        return size;
    }
    public void setColor (String[] color){
        this.color = color;
    }
    public String[] getColor(){
        return color;
    }
}
