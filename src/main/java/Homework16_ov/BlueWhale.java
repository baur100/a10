package Homework16_ov;

public class BlueWhale extends Carnivores implements Animals{
    private String canSwim;

    public BlueWhale(String name, String liveIn, String likeToEat, String canRun, String canSwim) {
        super(name, liveIn, likeToEat, canRun);
        this.canSwim = canSwim;
    }

    public String getCanSwim() {
        return canSwim;
    }

    public void setCanSwim(String canSwim) {
        this.canSwim = canSwim;
    }

    @Override
    public void appear() {
        System.out.println("I am a Blue Whale and I am born in spring");

    }

    @Override
    public void live() {
        System.out.println("I am a Blue Whale and I live in the sea");

    }

    @Override
    public void breath() {
        System.out.println("I am a Blue Whale and I can breath in the water");

    }

    @Override
    public void eat() {
        System.out.println("I am a Blue Whale and I eat plantkton");

    }

    @Override
    public void grow() {
        System.out.println("I am a Blue Whale and I grow slowly");

    }

    @Override
    public void multiplicate() {
        System.out.println("I am a Blue Whale and I have only 1 cub");

    }

    @Override
    public void disapear() {
        System.out.println("I am a Blue Whale and I die in the sea");

    }
    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + "\nCan Run: " + getCanRun() + "\nLike to eat: " + getLikeToEat() + "\nLive in: " + getLiveIn()+"\nCan swim: "+ getCanSwim());
    }
}
