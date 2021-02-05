package HomeWork08;

public class App {
    public static void main(String[] args) {
        Pool myPool = new Pool();
        myPool.name = "My Pool";
        myPool.length = 12;
        myPool.wide = 4;
        myPool.depth = 4;

        myPool.volume();
        myPool.safety();

        Pool communityPool = new Pool();
        communityPool.name = "community pool";
        communityPool.length = 20;
        communityPool.wide = 6;
        communityPool.depth = 2;

        communityPool.volume();
        communityPool.safety();

        System.out.println("---------------------------");

        Neighbor alex = new Neighbor();
        alex.name = "Alex";
        alex.lastName = "Smith";
        alex.apartment = 17;

        System.out.println(alex.name+" is living on "+alex.floor()+" floor");

        Neighbor jane = new Neighbor();
        jane.name = "Janna";
        jane.apartment = 3;
        jane.hi();

        System.out.println("---------------------------");

        Jar mySwearJar = new Jar();
        mySwearJar.name = "My Swear";
        mySwearJar.quarter = 13;
        mySwearJar.dime = 7;
        mySwearJar.cent = 35;

        mySwearJar.amount();

        Jar shopTips = new Jar();
        shopTips.name = "Tips for cashier";
        shopTips.quarter = 55;
        shopTips.dime = 2;
        shopTips.nickel = 9;
        shopTips.cent = 1;

        System.out.println("Total coins in "+shopTips.name+" Jar are "+shopTips.totalCoins());

    }
}
