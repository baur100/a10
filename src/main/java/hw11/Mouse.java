package hw11;

public class Mouse extends Device {

    private String type;

    public Mouse(String brand, String modal, String type) {
        super(brand, modal);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}