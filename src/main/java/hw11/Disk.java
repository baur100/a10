package hw11;

public class Disk {
    private String types;
    private int diskMemory;

    public Disk(String types, int diskMemory) {
        this.types = types;
        this.diskMemory = diskMemory;
    }

    public String getTypes() {
        return types;
    }
    public void setTypes(String types) {
        this.types = types;
    }

    public int getDiskMemory() {
        return diskMemory;
    }
    public void setDiskMemory(int diskMemory) {
        this.diskMemory = diskMemory;
    }
}

