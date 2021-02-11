package hw11;

public class Keyboard {
    private String brand;
    private String model;

public Keyboard(String brand, String model){
    this.brand = brand;
    this.model = model;
}
public void setBrand (String brand){
    this.brand = brand;
}
public String getBrand(){
    return brand;
}
public void setModel(String model){
    this.model = model;
}
public String getModel (){
    return model;
}
}

