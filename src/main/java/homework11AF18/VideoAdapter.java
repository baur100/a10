package homework11AF18;

public class VideoAdapter {
    private String brand;
    private int memory;
    private String gpu;

    public VideoAdapter(String brand, int memory, String gpu) {
        this.brand = brand;
        this.memory = memory;
        this.gpu = gpu;
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

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }
}
