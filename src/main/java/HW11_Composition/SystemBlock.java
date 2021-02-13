package HW11_Composition;

public class SystemBlock {
    private MotherBoard motherBoard;
    private PowerSuply powerSuply;
    private Disk disk;

    public SystemBlock(MotherBoard motherBoard, PowerSuply powerSuply, Disk disk) {
        this.motherBoard = motherBoard;
        this.powerSuply = powerSuply;
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public PowerSuply getPowerSuply() {
        return powerSuply;
    }

    public void setPowerSuply(PowerSuply powerSuply) {
        this.powerSuply = powerSuply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}
