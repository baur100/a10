package lesson13_exerciseAtHome;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-45);
        numbers.add(30);
        System.out.println(numbers);

////////////////////////////////////////////////////////////////////////////////////////////////////////////
        List<Person> people = new ArrayList<>();

        Person nina = new Person("Nina", "Hansen");
        Person mike = new Person("Mike", "Wasovsky");
        people.add(nina);
        people.add(mike);
        people.add(new Person("Daniel", "Anderson"));

        System.out.println(people.get(1).getLastName());
        System.out.println(people);
////////////////////////////////////////////////////////////////////////////////////////////////
        List<Fruits> fr = new ArrayList<>();

        fr.add(Fruits.APPLE);
        fr.add(Fruits.ORANGE);
        fr.add(Fruits.PINEAPPLE);
        System.out.println(fr);
    }
}
