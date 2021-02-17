package homework13AF18;


import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
        //String
        List <String> fruits=new ArrayList<>();
        fruits.add("Pineapple");
        fruits.add("Peach");
        fruits.add("Strawberry");
        fruits.add("Watermelon");
        fruits.set(2,"Raspberry");
        fruits.remove("Pineapple");
//        System.out.println(fruits.get(2));
//        System.out.println(fruits);


        //Integer
        List<Integer> nbs=new ArrayList<>();
        nbs.add(1);
        nbs.add(3);
        nbs.add(5);
        nbs.add(7);

        List<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers.contains(50));
        numbers.addAll(0,nbs);
        numbers.remove(3);

        for(int i=0;i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        //Custom class
        Car car1=new Car("Black","BMW");
        Car car2= new Car("White","Mercedes");
        Car car3= new Car("Red","Infinity");

        List<Car> carList=new ArrayList();
        carList.add(car1);
        carList.add(car2);
        carList.set(1,car3);
        carList.add(new Car("Silver","Audi"));


//        for(Car c:carList){
//            System.out.println(c.toString());
//        }



    }
}
