package HomeWork12;

public class App {
    public static void main(String[] args) {
        Dog marly = new Dog("Marly");
        Cat simon = new Cat("Simon");
        WildCat boris = new WildCat("Boris");
        LittleLapDog pitier = new LittleLapDog("Pitier");

        simon.feed("Bone");
        simon.pet();
        simon.sound();

        System.out.println("-----------------------------");

        marly.feed("Wiskas");
        marly.sound();
        marly.pet();

        System.out.println("-----------------------------");

        boris.feed("mouse");
        boris.pet();
        boris.sound();

        System.out.println("-----------------------------");

        pitier.feed("Chappy");
        pitier.pet();
        pitier.sound();


    }
}
