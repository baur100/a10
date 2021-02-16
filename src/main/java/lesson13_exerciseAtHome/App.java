package lesson13_exerciseAtHome;

public class App {
    public static void main(String[] args) {

        int a = 5;
        int z = a;
        a=7;
        System.out.println("z = "+z+"\n a = "+a);

        Person st1=new Person("Jane","Fonda");
        Person st2=st1;
        st1.setLastName("Samuel");
        st1.setName("Adam");

        System.out.println(st2.getName());
        System.out.println(st2.getLastName());


    }
}
