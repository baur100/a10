package lesson12_exerciseAtHome;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void drow(){

        System.out.println("I drow a circle with radius = "+radius);
    }

    public double getPerimetr(){
        return 2*radius+Math.PI;

    }

    @Override
    public void draw() {

    }

    @Override
    public double gePerimetr() {
        return 0;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }
}
