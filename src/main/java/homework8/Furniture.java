package homework8;

public class Furniture {
    public String name;
    public String size;
    public String color;
    public String type;
    public int price;


    public void delivery () {
        System.out.println(color + ", " + size + ", " + type+ " " +name+ " for " + price + " can be delivered tomorrow");

    }
        public String getIngo() {
        return size+  " " +type+ " " +name;

        }
    }

