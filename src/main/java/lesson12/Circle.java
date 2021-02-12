package lesson12;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw(){
        System.out.println("I draw a circle with radius = " + radius);
    }
    @Override
    public double getPerimeter(){
        return 2*radius*Math.PI;
    }
    @Override
    public double getArea(){
        return Math.PI*radius*radius;
    }
}
