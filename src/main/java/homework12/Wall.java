package homework12;

public class Wall implements Apartment {
    private double wide;
    private double length;
    private double height;

    public Wall(double wide, double length, double height){
        this.wide = wide;
        this.length = length;
        this.height = height;
    }

    public void setWide (double wide){
        this.wide= wide;
    }
    public double getWide(){
        return wide;
    }
    public void setLength (double length){
        this.length = length;
    }
    public double getLength(){
        return length;
    }
    public void setHeight (double height){
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void build() {
        System.out.println("I build this apartment with room ceiling height = " +height);

    }

    @Override
    public double getArea() {
        return (wide+wide+length+length)*height;
    }
}
