package HW10_Enum;

public class Ship2 {
    private String Type;
    private String Name;
    private Destinations[] destinations;

    public Ship2(String type, String name, Destinations[] destinations) {
        Type = type;
        Name = name;
        this.destinations = destinations;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Destinations[] getDestinations() {
        return destinations;
    }

    public void setDestinations(Destinations[] destinations) {
        this.destinations = destinations;
    }
    public void printinfo(){ //Метод принт класс для распечатки всех полей с array  в поле (с лупом)
        System.out.println("Type of ship = "+this.Type+"Name of ship = "+this.Name+", Destinations = ");
        for(Destinations v : this.destinations){
            System.out.println(v);
        }
    }
}
