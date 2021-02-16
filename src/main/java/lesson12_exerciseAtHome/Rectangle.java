package lesson12_exerciseAtHome;

public class Rectangle implements Shape{
    private double wide;
    private double length;

    public Rectangle(double wide, double length) {
        this.wide = wide;
        this.length = length;
    }
    public void draw(){
        System.out.println("I draw a rectangle with wide = "+wide+" and length = "+length);

    }

    @Override
    public double gePerimetr() {
        return 0;
    }

    public double getPerimetr(){
        return (wide+length)*2;
    }

    public double getArea(){
        return (wide*length);
    }
}
