package lesson14;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<Person,Vehicle> cars = new HashMap<>();
        cars.put(new Person(),new Vehicle());
        System.out.println(cars.size());
    }
}
