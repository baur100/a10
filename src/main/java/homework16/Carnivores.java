package homework16;

public abstract class Carnivores {
    public Lion lion;
    public Wolf wolf;
    public BlueWhale blueWhale;

    public Carnivores(Lion lion, Wolf wolf, BlueWhale blueWhale) {
        this.lion = lion;
        this.wolf = wolf;
        this.blueWhale = blueWhale;
    }


    public abstract void canHunt();




    public Lion getLion() {
        return lion;
    }

    public void setLion(Lion lion) {
        this.lion = lion;
    }

    public Wolf getWolf() {
        return wolf;
    }

    public void setWolf(Wolf wolf) {
        this.wolf = wolf;
    }

    public BlueWhale getBlueWhale() {
        return blueWhale;
    }

    public void setBlueWhale(BlueWhale blueWhale) {
        this.blueWhale = blueWhale;
    }


    @Override
    public String toString() {
        return "Carnivores{" +
                "lion=" + lion +
                ", wolf=" + wolf +
                ", blueWhale=" + blueWhale +
                '}';
    }
}
