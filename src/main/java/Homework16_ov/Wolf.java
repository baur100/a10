package Homework16_ov;

public class Wolf extends Carnivores implements Animals{
    private String haveTail;

    public Wolf(String name, String liveIn, String likeToEat, String canRun, String haveTail) {
        super(name, liveIn, likeToEat, canRun);
        this.haveTail = haveTail;

    }

    public String getHaveTail() {
        return haveTail;
    }

    public void setHaveTail(String haveTail) {
        this.haveTail = haveTail;
    }

    @Override
    public void appear() {
        System.out.println("I am a Wolf and I am born in Winter");

    }

    @Override
    public void live() {
        System.out.println("I am a Wolf and I live in the Forest");

    }

    @Override
    public void breath() {
        System.out.println("I am a Wolf and I can breath");

    }

    @Override
    public void eat() {
        System.out.println("I am a Wolf and I hunt and eat little animals");

    }

    @Override
    public void grow() {
        System.out.println("I am a Wolf and I grow fast");

    }

    @Override
    public void multiplicate() {
        System.out.println("I am a Wolf and I have up to 4 cubs");

    }

    @Override
    public void disapear() {
        System.out.println("I am a Wolf and I die in the forest");

    }
    public void printInfo() {
        System.out.println("Name: " + getName() + "\nCan Run: " + getCanRun() + "\nLike to eat: " + getLikeToEat() + "\nLive in: " + getLiveIn()+"\nAbout tail: "+ getHaveTail());
    }
}
