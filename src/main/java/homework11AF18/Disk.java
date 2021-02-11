package homework11AF18;

public class Disk {
    private String type;
    private int memory;
    private String brand;

    public Disk(String type, int memory, String brand) {
        this.type = type;
        this.memory = memory;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
