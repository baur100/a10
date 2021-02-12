package lesson9;

public class Vehicle {
    private String make;
    private String model;
    private int year;

    public void setMake(String make){
        this.make=make;
    }
    public String getMake(){
        return this.make;
    }

    public void setModel(String model){
        this.model=model;
    }
    public String getModel(){
        return model;
    }

    public void setYear(int year) {
        if(year>2021 || year<1990){
            throw new IllegalArgumentException("Wrong year\n - year must be in the interval\n between 1990 and 2021 - you provided "+year);
        }
        this.year=year;
    }

    public int getYear() {
        return year;
    }
}
