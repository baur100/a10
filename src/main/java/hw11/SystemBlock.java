package hw11;

public class SystemBlock {
    private MotherBoard motherBoard;
    private VideoAdapter videoAdapter;
    private PowerSupply powerSupply;
    private Disk disk;

    public SystemBlock(MotherBoard motherBoard, VideoAdapter videoAdapter, PowerSupply powerSupply, Disk disk) {
        this.motherBoard = motherBoard;
        this.videoAdapter = videoAdapter;
        this.powerSupply = powerSupply;
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

    public PowerSupply getPowerSupply() {
        return powerSupply;
    }

    public void setPowerSupply(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public Disk getDisk() {
        return disk;
    }

    public void setDisk(Disk disk) {
        this.disk = disk;
    }
}

