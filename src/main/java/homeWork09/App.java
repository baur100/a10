package homeWork09;

public class App {
    public static void main(String[] args) {
        String[] davidTenants = {"David", "Nick", "Mattey"};
        String[] joeTenants = {"Joe"};
        String[] henryTenants = {};
        SimpleHouse david = new SimpleHouse("David's house", 1240, 2, davidTenants);
        david.printClass();

        SimpleHouse john = new SimpleHouse();
        String[] johnTenants = {"John", "Marge"};
        john.setName("Jonh's house");
        john.setFloors(1);
        john.setSquareFeet(800);
        john.setTenants(johnTenants);
        john.printClass();

        Mansion carl = new Mansion("Carl's mansion", 1900, 3, davidTenants, Fenses.WHITE);
        carl.printClass();
        System.out.println(carl.getFence());
        Mansion joe = new Mansion();
        joe.name = "Joe's mansion";
        joe.squareFeet = 2140;
        joe.floors = 2;
        joe.fence = Fenses.RED;
        joe.tenants = joeTenants;
        joe.printClass();


        String[] extras = {"Tennis court", "Helicopter pad"};
        String[] extras2 = {"Torture room"};
        Castle king = new Castle("Old castle", 3820, 5, johnTenants, Fenses.BLACK, extras);
        king.printClass();
        Castle henryVII = new Castle();
        henryVII.name = "Castle of HenryVII";
        henryVII.squareFeet = 8020;
        henryVII.floors = 7;
        henryVII.tenants = henryTenants;
        henryVII.fence = Fenses.BLUE;
        henryVII.extra = extras2;
        henryVII.printClass();







    }
}
