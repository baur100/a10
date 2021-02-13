package lesson12;

public class Square extends Rectangle{
    public Square(double side) {
        super(side, side);
    }
    @Override
    public void draw(){
        System.out.println("I draw a square with side = "+wide);
    }
}
