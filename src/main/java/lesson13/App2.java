package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(-45);
        numbers.add(30);

        Person nina = new Person("Nina","Hansen");
        Person mike = new Person("Mike","Wasovsky");

        List<Person> people = new ArrayList<>();
        people.add(nina);
        people.add(mike);
        people.add(new Person("Daniel","Andersen"));

        System.out.println(people.get(2).getLastName());

        List<Fruits> fr = new ArrayList<>();
        fr.add(Fruits.APPLE);
        fr.add(Fruits.APPLE);
    }
}
