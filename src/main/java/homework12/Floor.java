package homework12;

public class Floor implements Apartment{
    public double wide;
    private double length;

    public Floor(double wide, double length){
        this.wide = wide;
        this.length = length;
    }

    public void setWide( double wide){
        this.wide = wide;
    }
    public double getWide() {
        return wide;
    }
    public void setLength (double length){
        this.length = length;
    }
    public double getLength (){
        return length;
    }


    @Override
    public void build() {
        System.out.println("I build this apartment with floor wide =" +wide+ " and length = " +length);

    }

    @Override
    public double getArea() {
        return wide*length;
    }
}
