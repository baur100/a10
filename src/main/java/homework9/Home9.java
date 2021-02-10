package homework9;


public class Home9 {
    public static void main(String[] args){
        Furniture1 sofa = new Furniture1();
        sofa.setName("Sofa");
        sofa.setType("leather");
        sofa.setSize("small");
        sofa.setPrice(300);

//        System.out.println(sofa.getName());
//        System.out.println(sofa.getType());
//        System.out.println(sofa.getSize());
//        System.out.println(sofa.getPrice());

        Device1 iPad = new Device1();
        iPad.setName("iPad");
        iPad.setColor("silver");
        iPad.setSize(64);

//        System.out.println(iPad.getName());
//        System.out.println(iPad.getColor());
//        System.out.println(iPad.getSize());

        Cosmetics1 cream = new Cosmetics1();
        cream.setName("Cream");
        cream.setBrand("Dior");
        cream.setSize(28.5);

//        System.out.println(cream.getName());
//        System.out.println(cream.getBrand());
//        System.out.println(cream.getSize());


//        **** Constructors ****

        Furniture1 chair = new Furniture1("Chair", "cotton","big", 400);
        chair.printClass();


        Furniture1 couch = new Furniture1("Couch", "fur", "small");
        couch.setPrice(350);
        System.out.println(couch.getName()+ " price is " +couch.getPrice());


        Furniture1 lamp = new Furniture1();
        lamp.setName("Lamp");
        lamp.setType("narrow");
        lamp.setPrice(220);
        System.out.println(lamp.getName()+ " cost " +lamp.getPrice()+ " $");



//        **** Constructor with Array ****

        String [] mater = {"wood", "metal", "plastic"};
        Furniture1 cupboard = new Furniture1("Cupboard", "small", 600, mater);
        cupboard.printInfo();



        String [] colors1 = {"red", "white", "pink"};
        Cosmetics1 nailpolish = new Cosmetics1("Nailpolish", "Bobbi Brown", 10.5, colors1);
        nailpolish.printInfoColor();




    }
}
