package lesson13;

public class App {
    public static void main(String[] args) {
        int a=5;
        Integer a1=5;

        double b=1.2;
        Double b1=1.2;

        char c = 'w';
        Character c1='w';

        boolean d=true;
        Boolean d1=true;

        short s = 6;
        Short s1=6;

        int z = a;
        a=7;
        System.out.println("z="+z+" a="+a);

        Person st1 = new Person("Jane","Fonda");
        Person st2=st1;
        st1.setLastName("Samuel");
        st1.setName("Adam");
        st1  = new Person("ss","zz");
        System.out.println(st2.getLastName());

        int[] xx1 = {1,2,3};
        int[] vv1=xx1;

        xx1[0]=50;
        System.out.println(vv1[0]);

    }
}
