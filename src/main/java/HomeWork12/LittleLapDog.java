package HomeWork12;

public class LittleLapDog extends Dog{
    public LittleLapDog(String name) {
        super(name);
    }

    @Override
    public void pet() {
        System.out.println("You can petting "+name+", because it's tiny and scares everyone");
    }

    @Override
    public void sound() {
        System.out.println(name + " is squeaking");
    }
}
