package homework9;

public class Furniture1 {
    private String name;
    private String type;
    private String size;
    private int price;
    private String [] materials;

    public Furniture1(String name, String type, String size, int price) {
        this.name = name;
        this.type = type;
        this.size = size;
        setPrice(price);
    }
    public void printClass() {
        System.out.println(type + " " + name + " " + size + " size, cost " + price + " $");
    }


    public Furniture1(String name, String type, String size){
        this.name = name;
        this.type = type;
        this.size = size;
    }
    public void printClass1(){
        System.out.println(type+ " " +name+ " just in " +size+ " size");
    }


    public Furniture1(String name, String size, int price, String[] materials){
        this.name = name;
        this.size = size;
        setPrice(price);
        this.materials = materials;
    }
    public void printInfo(){
        System.out.println("Name = " +name+ "\nSize= " +size+ "\nPrice of this item is= " +price+ " $"+ "\nMaterials are:");
        for (String v: materials){
            System.out.println(v);
        }
    }


    public Furniture1(){}


    public void setName (String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getType(){
        return type;
    }
    public void setSize(String size){
        this.size=size;
    }
    public String getSize(){
        return size;
    }
    public void setPrice (int price){
        if (price<200){
        System.out.println("Your price is less then required. You provide " +price);
        }
        this.price=price;
    }
    public int getPrice (){
        return price;
    }
    public void setMaterials(String[] materials){
        this.materials = materials;
    }
    public String[] getMaterials (){
        return materials;
    }

}
