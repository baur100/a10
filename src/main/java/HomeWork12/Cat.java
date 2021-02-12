package HomeWork12;

public class Cat implements Pet{
    protected String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void pet() {
        System.out.println(name+" likes you're petting her");
    }

    @Override
    public void feed(String feed) {
        if (feed.contains("fish")) {
            System.out.println(name + " will eat fish");
        } else {
            System.out.println(name + " will not eat " + feed + " ,because it's not a fish");
        }
    }

    @Override
        public void sound (){
            System.out.println(name + " is purring");
        }
    }
