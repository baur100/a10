package HWPF9;

public class Camera {
    private String make;
    private String model;
    private int year;

    public Camera(String make,String model, int year){
        this.make=make;
        this.model=model;
        this.year=year;

    }
    public void setMake(String make){
        this.make = make;
    }
    public String getMake(){
        return this.make;
    }
    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return this.model;

    }
    public void setYear(int year){
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}
