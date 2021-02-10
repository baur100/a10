package homework9;

public class Device1 {
    private String name;
    private String color;
    private int size;

//    public Device1 = new Device1(String name, String color, int size);
//    public Device1 = new Device1(String name, String color);
//    public Device1 = new Device1();


    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setSize(int size){
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
