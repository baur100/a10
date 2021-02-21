package Homework15_ov;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        Address a1 = new Address("12 Hight. St", "New Orleanse", "Missuri",12345);
        Address a2 = new Address("34 Nice. St", "New York", "Maryland",78345);
        Address a3 = new Address("56 Willoy. St", "Los Angelos", "California",128345);
        Address a4 = new Address("79  Magestiq. St", "New York", "Maryland",78345);

        Map<Cattle, Integer> cattle1 = new HashMap<>();
        cattle1.put(Cattle.CHICKENS, 1000);
        cattle1.put(Cattle.COWS, 300);
        cattle1.put( Cattle.PIGS, 500);
        cattle1.put(Cattle.SHEEP, 800);
        cattle1.put(Cattle.TURKEYS, 750);

        Map<Cattle,Integer> cattle2 = new HashMap<>();
        cattle2.put(Cattle.CHICKENS, 1500);
        cattle2.put(Cattle.COWS, 600);
        cattle2.put( Cattle.PIGS, 400);
        cattle2.put(Cattle.SHEEP, 900);


        Agricultural agriculture1= new Agricultural("Wheat", 5);
        Agricultural agriculture2 = new Agricultural("Rye", 7);
        Agricultural agriculture3 = new Agricultural("Barley", 6);
        Agricultural agriculture4 = new Agricultural("Lucerna", 5);

        List<Agricultural> agriculturals1 = new ArrayList<>();
        agriculturals1.add(agriculture1);
        agriculturals1.add(agriculture2);
        agriculturals1.add(agriculture3);

        List<Agricultural> agriculturals2 = new ArrayList<>();
        agriculturals2.add(agriculture1);
        agriculturals2.add(agriculture2);
        agriculturals2.add(agriculture4);




        Farm farm1 = new Farm("Nick's Farm", a1, cattle1, agriculturals1);
        Farm farm2 = new Farm("Happy Cows", a2, cattle2, agriculturals2);



        System.out.println("*************Print info*****************");
        farm1.printInfo();

        System.out.println("*************Print Stock*****************");
        for(Map.Entry<Cattle, Integer> entry: cattle1.entrySet()){
            System.out.println("Cattle: "+ entry.getKey() + " Number in stock: "+ entry.getValue());
        }

        System.out.println("*************Print info*****************");
        farm2.printInfo();

        System.out.println("*************Print Stock*****************");
        for(Map.Entry<Cattle, Integer> entry2: cattle2.entrySet()){
            System.out.println("Cattle: "+ entry2.getKey() + " Number in stock: "+ entry2.getValue());
        }
        System.out.println("*************Print State of Farm1*****************");
        System.out.println(farm1.getAddress().getState());

        System.out.println("*************Print Agriculturals*****************");

        System.out.println(farm1.getAgriCultural());

        System.out.println("*************Print Stock*****************");
        System.out.println(farm1.getCattle());

    }
}
