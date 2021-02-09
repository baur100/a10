package HM9;

public class Zoo extends Animal{
    private String ZooName;

    public Zoo(String name, String color, int id,  String ZooName) {
        super(name, color, id );
        this.ZooName = ZooName;

    }
    public String getZooName() {
        return ZooName;
    }

    public void setZooName(String zooName) {
        ZooName = zooName;
    }
         public void name(){
        System.out.println("Hi my name is" + " " + name);
    }
}

