package HomeWorkPF12;

public class FullSensorCamera implements MemoryForDSRLCamera{
    private String make;
    private int year;

    public FullSensorCamera(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void swichCameraOn(){
        System.out.println("Video is On");
    }
    public void swithCameraOff(){
        System.out.println("Swich Off");
    }

    @Override
    public void useCompactFlashCard() {
        System.out.println("I can shoot only in HD mode");

    }

    @Override
    public void useCFastCardFor4K() {
        System.out.println("I can shoot in 4K and HD");

    }
}
