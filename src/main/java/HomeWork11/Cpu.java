package HomeWork11;

public class Cpu {
    private String model;
    private int clockSpeed;
    private int cores;

    public Cpu(String model, int clockSpeed, int cores) {
        this.model = model;
        this.clockSpeed = clockSpeed;
        this.cores = cores;
    }

    public Cpu () {}

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(int clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }
}
