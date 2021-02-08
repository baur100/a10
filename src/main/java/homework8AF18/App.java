package homework8AF18;

public class App {
    public static void main(String[] args){
        //  class Childrens

        Childrens chld1=new Childrens();
        chld1.name="Andrew";
        chld1.age=5;
        chld1.sex="Boy";

        Childrens chld2= new Childrens();
        chld2.name="Clara";
        chld2.age=4;
        chld2.sex="Girl";

        chld1.loveToy("Red car");
        chld2.share("Andrew");

        //class Shop

        Shop first=new Shop();
        first.address="56 17th St";
        first.name="Loli";
        first.hours=9;

        Shop second=new Shop();
        second.address="999 Ocean Drive";
        second.name="BabyTime";
        second.hours=8;

        System.out.println(first.getInfo());
        System.out.println(second.getInfo());

        // class Toys

        Toys toys1=new Toys();
        toys1.age=3;
        toys1.name="Red car";
        toys1.parts=6;
        toys1.noize="Brrrrrr";

        Toys toys2=new Toys();
        toys2.name="Puppy";
        toys2.age=1;
        toys2.parts=1;
        toys2.noize="Woof";

        toys1.DoNoize();
        toys2.info();
    }
}
