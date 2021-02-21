package Homework16_ov;

public class App {
    public static void main(String[] args) {


        Lion lion = new Lion("Lion", "Africa", "meat", "Runs quickly", "has a tail ");
        Wolf wolf = new Wolf("Wolf", "Forest", "animals", "can run", "has a tail");
        BlueWhale whale = new BlueWhale("Whale", "Ocean", "shrimps", "cannot run ", "can swim");

        Carnivores c1 = new Lion("Lion2", "Africa too", "little animals", "faster", "has a tail too");

        Mammals[] mammals = {lion, wolf, whale, c1};
        for(Mammals m: mammals ){
            m.appear();
        }
        System.out.println("******************************************");
        Carnivores[] carnivores = {lion, wolf, whale, c1};
        for(Carnivores c: carnivores ){
            c.printInfo();
        }
        System.out.println("******************************************");
        lion.appear();
        System.out.println("******************************************");
        whale.breath();
        System.out.println("******************************************");
        whale.live();


    }
}


