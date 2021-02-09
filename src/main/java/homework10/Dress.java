package homework10;

public class Dress {
    private String name;
    private String brand;
    private Size size;
    private Colors [] color;

    public Dress(String name, String brand, Size size, Colors [] color){
        this.name = name;
        this.brand = brand;
        this.size = size;
        this.color = color;
    }

    public Dress(){}



    public void printDress (){
        System.out.println(name+ " dress " +brand+ ", " +size+ " size, in colors:");
        for (Colors v: color){
            System.out.println(v);
        }
    }


public void setName(String name) {
    this.name = name;
}
public String getName(){
    return name;
}
public void setBrand(String brand){
    this.brand = brand;
}
public String getBrand (){
        return brand;
}
public void setSize (Size size){
    this.size = size;
}
public Size getSize (){
    return size;
}
public void setColor (Colors[] color){
        this.color = color;
}
public Colors [] getColor (){
        return color;
}
}
