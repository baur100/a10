package hw11;

public class VideoAdapter {
    private String brand;
    private String model;
    private int vram;
    private String connector;

    public VideoAdapter(String brand, String model, int VRAM, String connector) {
        this.brand = brand;
        this.model = model;
        this.vram = VRAM;
        this.connector = connector;
    }

    public VideoAdapter() {}

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }

    public String getConnector() {
        return connector;
    }

    public void setConnector(String connector) {
        this.connector = connector;
    }
}


