package HW_AA02_L11;

public class SystemBlock {
    private MotherBoard motherBoard;
    private VideoAdapter videoAdapter;
    private PowerSuply powerSuply;
    private Disk disk;

    public SystemBlock(MotherBoard motherBoard, VideoAdapter videoAdapter, PowerSuply powerSuply, Disk disk) {
        this.motherBoard = motherBoard;
        this.videoAdapter = videoAdapter;
        this.powerSuply = powerSuply;
        this.disk = disk;
    }

    public MotherBoard getMotherBoard() {
        return motherBoard;
    }

    public void setMotherBoard(MotherBoard motherBoard) {
        this.motherBoard = motherBoard;
    }

    public VideoAdapter getVideoAdapter() {
        return videoAdapter;
    }

    public void setVideoAdapter(VideoAdapter videoAdapter) {
        this.videoAdapter = videoAdapter;
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
