package Homework16_ov;

public abstract class Carnivores implements Mammals{
    public String name;
    public String liveIn;
    public String likeToEat;
    public String canRun;

    public Carnivores(String name, String liveIn, String likeToEat, String canRun) {
        this.name = name;
        this.liveIn = liveIn;
        this.likeToEat = likeToEat;
        this.canRun = canRun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLiveIn() {
        return liveIn;
    }

    public void setLiveIn(String liveIn) {
        this.liveIn = liveIn;
    }

    public String getLikeToEat() {
        return likeToEat;
    }

    public void setLikeToEat(String likeToEat) {
        this.likeToEat = likeToEat;
    }

    public String getCanRun() {
        return canRun;
    }

    public void setCanRun(String canRun) {
        this.canRun = canRun;
    }

    public abstract void appear();
    public abstract void live();
    public abstract void breath();
    public abstract void eat();
    public abstract void grow();
    public abstract void multiplicate();
    public abstract void disapear();
    public abstract void printInfo();

}
