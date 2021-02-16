package homework13;

public class Cars {
    private String model;
    private String color;

    public Cars(String model, String color){
        this.model = model;
        this.color = color;
    }

    public void setModel (String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }
    public void setColor (String color){
        this.color=color;
    }
    public String getColor(){
        return color;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
