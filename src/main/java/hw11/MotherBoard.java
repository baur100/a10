package hw11;

public class MotherBoard {
    private String cpu;
    private String memory;


    public MotherBoard(String cpu, String memory) {
        this.cpu = cpu;
        this.memory = memory;
    }


    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    public String getCpu() {
        return cpu;
    }
    public void setMemory(String memory) {
        this.memory = memory;
    }
    public String getMemory() {
        return memory;
    }


}

