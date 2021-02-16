package homework13;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Home13 {
    public static void main (String [] args){

        ArrayList<String> stores = new ArrayList<>();
        stores.add("Polo");
        stores.add("Zara");
        stores.add("Mango");
        stores.add("Star");
        System.out.println(stores);

        stores.add(1,"H&M");
        System.out.println(stores);

        System.out.println(stores.get(3));
        System.out.println(stores.size());

        stores.set(1,"Lacosta");
        System.out.println(stores);

        stores.remove("Star");
        System.out.println(stores);
        stores.remove(0);
        System.out.println(stores);

        for (String v: stores){
            System.out.println(v);
        }

        ArrayList<String> sportShop = new ArrayList<>();
        sportShop.add("Nike");
        sportShop.add("Adidas");

        stores.addAll(1,sportShop);
        System.out.println(stores);

        boolean inList = stores.contains("Guess");
        System.out.println(inList);


        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers);

        for (Integer v:numbers){
            System.out.println(v);
        }

        numbers.add(2,50);
        System.out.println(numbers);

        numbers.set(0,5);
        System.out.println(numbers);

        System.out.println(numbers.get(1));
        System.out.println(numbers.size());

        numbers.remove(4);
        System.out.println(numbers);
        boolean info = numbers.contains(8000);
        System.out.println(info);

        ArrayList<Integer> blocks = new ArrayList<>();
        blocks.add(298);
        blocks.add(897);
        numbers.addAll(0,blocks);
        System.out.println(numbers);


        Cars mazda = new Cars("Mazda", "red");
        Cars honda = new Cars("Honda", "black");
        System.out.println(mazda);

        ArrayList<Cars> motorcar = new ArrayList<>();
        motorcar.add(mazda);
        motorcar.add(honda);
        motorcar.add(new Cars("BMD","white"));

        System.out.println(motorcar.get(1).getModel());


//  *** HashMap <String,String> ***

        Map<String,String> fruits = new HashMap<>();
        fruits.put("lemon", "sour");
        fruits.put("apple", "sweet");
        fruits.put("pepper", "bitter");
        System.out.println(fruits);

        System.out.println(fruits.size());
        System.out.println(fruits.get("lemon"));

        fruits.remove("lemon", "sour");
        System.out.println(fruits);
        fruits.put("melon", "juicy");
        System.out.println(fruits);

        for (String key: fruits.keySet()){
            System.out.println(key);
        }
        for (String value: fruits.values()){
            System.out.println(value);
        }


//  *** Map<Integer,String> ***

        Map<Integer,String> players = new HashMap<>();
        players.put(9, "Ivanov");
        players.put(12, "Petrov");
        players.put(15, "Sidorov");
        System.out.println(players);

        players.put(9, "Malik");
        System.out.println(players);

        players.remove(9);
        System.out.println(players);

        for (Integer key: players.keySet()){
            System.out.println(key);
        }

        for (String value: players.values()){
            System.out.println(value);
        }


//  *** Map<Name,SecondName> ***


        Map<Name,SecondName> clients = new HashMap<>();

        Name anna = new Name("Anna");
        SecondName sidorenco = new SecondName("Sidorenko");

        Name rita = new Name ("Rita");
        SecondName anderson = new SecondName("Anderson");

        clients.put(anna, sidorenco);
        clients.put(rita,anderson);
        System.out.println(clients.size());

        System.out.println(clients);

        SecondName bond = new SecondName("Bond");

        clients.replace(anna, sidorenco, bond);
        System.out.println(clients);

        System.out.println(clients.get(anna));



















    }
}
