package Homework16_ov;

public class Lion extends Carnivores {

    private String haveTail;

    public Lion(String name, String liveIn, String likeToEat, String canRun, String haveTail) {
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
        System.out.println("I am Lion and I am born in Spring");

    }

    @Override
    public void live() {
        System.out.println("I am Lion and live in Africa");

    }

    @Override
    public void breath() {
        System.out.println("I am Lion and I breath");

    }

    @Override
    public void eat() {
        System.out.println("I am Lion and I eat other animals");

    }

    @Override
    public void grow() {
        System.out.println("I am Lion and I grow very fast ");

    }

    @Override
    public void multiplicate() {
        System.out.println("I am Lion and I have up to 4 cubs");

    }

    @Override
    public void disapear() {
        System.out.println("I am Lion and I die in savanna");

    }

    public void printInfo() {
        System.out.println("Name: " + getName() + "\nCan Run: " + getCanRun() + "\nLike to eat  " + getLikeToEat() + "\nLive in " + getLiveIn()+"\nAbout tail "+ getHaveTail());
    }
}
