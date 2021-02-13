package HW11_Composition;

public class MotherBoard{
    private CPU cpu;
    private RAM ram;

    public MotherBoard(CPU cpu, RAM ram) {
        this.cpu = cpu;
        this.ram = ram;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }
}
