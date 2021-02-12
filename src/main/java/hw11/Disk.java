package hw11;

public class Disk {
    private String type;
    private String brand;
    private  int memory;

    public Disk(String type, String brand, int memory) {
        this.type = type;
        this.brand = brand;
        this.memory = memory;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                '}';
    }
}
