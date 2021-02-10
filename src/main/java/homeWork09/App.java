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
        joe.setName("Joe's mansion");
        joe.setSquareFeet(2140);
        joe.setFloors(2);
        joe.setFence(Fenses.RED);
        joe.setTenants(joeTenants);
        joe.printClass();


        String[] extras = {"Tennis court", "Helicopter pad"};
        String[] extras2 = {"Torture room"};
        Castle king = new Castle("Old castle", 3820, 5, johnTenants, Fenses.BLACK, extras);
        king.printClass();
        Castle henryVII = new Castle();
        henryVII.setName("Castle of HenryVII");
        henryVII.setSquareFeet(8020);
        henryVII.setFloors(7);
        henryVII.setTenants(henryTenants);
        henryVII.setFence(Fenses.BLUE);
        henryVII.setExtras(extras2);
        henryVII.printClass();

        System.out.println("----------------------------------------------");

        int[] for1 = {-2, 0, 5, 9, 3, 2};
        Condition[] cond1 = {Condition.RAIN, Condition.WINDY};
        Condition[] cond2 = {Condition.SUNNY};
        Forecast newYork = new Forecast("New York", for1, cond1);
        Forecast newJersey = new Forecast();

        newYork.printClass();

        newJersey.setLocation("New Jersey");
        newJersey.setConditions(cond2);
        System.out.println(newJersey.getLocation());





    }
}
