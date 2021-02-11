package hw11;

public class VideoAdapter {
    private String brand;
    private String gpu;
    private int memory;

    public VideoAdapter(String brand, String gpu, int memory) {
        this.brand = brand;
        this.gpu = gpu;
        this.memory = memory;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGpu() {
        return gpu;
    }

    public void setGpu(String gpu) {
        this.gpu = gpu;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
