package HomeWork12;

public class Dog implements Pet{
    protected String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void pet() {
        System.out.println(name+" doesn't like when you're petting it (it can even bite)");
    }

    @Override
    public void feed(String feed) {
        System.out.println(name+" will eat "+feed+", it eats everything...");
    }

    @Override
    public void sound (){
        System.out.println(name + " is barking!");
    }
}

