package lesson14_execiseAtHome;
import java.util.HashMap;
import java.util.Map;
public class App {
    public static void main(String[] args) {
        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington");
        capitals.put("Germany", "berlin");
        capitals.put("China", "Beijings");
        capitals.put("Austria", "Vienna");
        System.out.println(capitals);
        capitals.put("China", "Pekin");

        System.out.println(capitals);

        capitals.put("UK", "London");
        capitals.put("Canada", "London");
        System.out.println(capitals);
        for (String key : capitals.keySet()) { //Итерация по странам
            System.out.println(key);
        }
        for(String value : capitals.values()){//Итерация по городам
            System.out.println(value);
        }
        for(Map.Entry<String,String> entry: capitals.entrySet()){//Итерация по обоим значенияь
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
    }
}
