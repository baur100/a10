package HW_AA02_L8;

public class App {
    public static void main(String[]args){

        Home white = new Home();
        white.houseHolder = "Alex Jonson";
        white.bathrooms = 2;
        white.bedrooms = 3;
        white.HomeInfo("San Jose");

        Animals murzik = new Animals();
        murzik.animalName = "Murzik";
        murzik.old = 2;
        murzik.typeOfAnimal = "cat";
        murzik.myAnimal("Anna");

        Shoes nike = new Shoes();
        nike.size = 12;
        nike.brand = "Nike";
        nike.typeOfShoes = "Snickers";
        nike.myShoes("Max");
    }
}
