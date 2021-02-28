package homework16;


public class Home16 {
    public static void main(String[] args) {

        Lion lion1 = new Lion();
        Wolf wolf1 = new Wolf();
        BlueWhale blueWhale = new BlueWhale();

        lion1.coldBlooded();
        wolf1.crawling();
        blueWhale.canFly();
        blueWhale.animalsCanMove();
        lion1.haveNumberOfShape();
        wolf1.Swims();
        blueWhale.freeLivingInSoilOrWater();
        blueWhale.growIndoorOutdoor();


        Life animal1 = new Lion();
        Life animal2 = new BlueWhale();
        Life animal3 = new Wolf();
        Life[] animalsLives = {animal1, animal2, animal3};
        for (Life al : animalsLives) {
            al.iCanBreath();
        }


    }
}

