package HomeWork12;

public class WildCat extends Cat{
    public WildCat(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println(name+" doesn't like if you're petting her, because "+name+" is WILD!");
    }

    @Override
    public void feed(String feed) {
       System.out.println(name + " will eat everything, "+name+" is hungry as a wolf");
    }


    @Override
    public void sound (){
        System.out.println(name + " is Meowing");
    }
}
