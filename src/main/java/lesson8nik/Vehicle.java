package lesson8nik;

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String color;

    public void drive(){
        System.out.println(make+ " "+ model +" is driving");
    }
    public void beep(){
        System.out.println(color+" car is beeping");
    }
}
