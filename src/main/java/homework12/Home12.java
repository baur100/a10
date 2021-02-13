package homework12;

public class Home12 {
    public static void main (String[] args){

        Floor floor = new Floor(3, 5);
        floor.build();
        System.out.println(floor.getArea()+" m2");


        Wall wall = new Wall(3,5,2.5);
        wall.build();
        System.out.println(wall.getArea() +" m2");


        Apartment apt2 = new Floor(4,6);
        apt2.build();
        Apartment apt3 = new Wall(4,6,3);
        apt3.build();


        Apartment[] apartments = {floor, wall,apt2,apt3, new Floor(4.5,6.5)};
        for (Apartment apartment: apartments){
            apartment.build();
        }



    }
}
