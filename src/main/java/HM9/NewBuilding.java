package HM9;

public class NewBuilding {
    public static void main(String[] args) {

        int []  av = {22,23,77,77};
        Apartments b1 = new Apartments(22, 6, av);


        Apartments b2 = new Apartments();
        b2.building = 23;
        b2.floor = 5;
        b2.availability =av;



    b2.GetInfo();
    b1.GetInfo();
    }

}