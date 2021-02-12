package HomeWorkL10;

public class Truck {
    private int year;
    private String size;
    private TruckModel make;

    public Truck(int year,String size,TruckModel make){
        this.year=year;
        this.size=size;
        this.make=make;


    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public TruckModel getMake() {
        return make;
    }

    public void setMake(TruckModel make) {
        this.make = make;
    }

    }
