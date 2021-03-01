package homework16;

public class BlueWhale extends Carnivores {

    @Override
    public void animalsCanMove() {
        System.out.println("BlueWhales can Move");
    }

    @Override
    public void canHunt() {
        System.out.println("BlueWhales can hunt");

    }

    @Override
    public void iCanBreath() {
        System.out.println("BlueWhales are Breathing");
    }

    @Override
    public void iCanEat() {
        System.out.println("BlueWhales are Eating");

    }

    @Override
    public void iCanDie() {
        System.out.println("BlueWhales can Die");
    }

    @Override
    public void iCanBreed() {
        System.out.println("BlueWhales can Breed");
    }

    @Override
    public void produceMilkForFeedingTheirYoung() {
        System.out.println("BlueWhales not feeding their young with milk");

    }

    @Override
    public void haveSpine() {
        System.out.println("BlueWhales have backbone that goes from the skull to the tail");

    }
}
