package lesson12;

public class Rectangle implements Shape{
    protected double wide;
    private double length;

    public Rectangle(double wide, double length) {
        this.wide = wide;
        this.length = length;
    }
    @Override
    public void draw(){
        System.out.println("I draw a rectangle with wide = "+wide+" length = "+length);
    }
    @Override
    public double getPerimeter(){
        return (wide+length)*2;
    }
    @Override
    public double getArea(){
        return wide*length;
    }
}
