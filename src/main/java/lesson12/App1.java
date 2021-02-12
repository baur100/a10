package lesson12;

public class App1 {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
//        c1.draw();
//        System.out.println(c1.getArea());
//        System.out.println(c1.getPerimeter());
        Rectangle r1=new Rectangle(7,11);
//        r1.draw();
//        System.out.println(r1.getArea());
//        System.out.println(r1.getPerimeter());
        Square s1=new Square(8);
//        s1.draw();
//        System.out.println(s1.getArea());
//        System.out.println(s1.getPerimeter());

        Shape[] shapes = {new Square(6),new Circle(3),c1,r1,s1};

        for (Shape shape: shapes){
            shape.draw();
        }

        Rectangle sq1 = new Square(4);
//        Square qq = new Rectangle(1,1);

    }
}
