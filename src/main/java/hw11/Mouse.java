package hw11;

public class Mouse {
    private String type;
    private String color;


public Mouse(String type, String color){
    this.type = type;
    this.color = color;
}

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
}
