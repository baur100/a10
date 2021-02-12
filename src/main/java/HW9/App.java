package HW9;

public class App {
    public static void main(String[] args) {

        Country russia=new Country("Russia","Eurasia",150000000,6000000);// Используем 1 ый конструктор
//        russia.setName("Russia");
//        russia.setContinent("Eurasia");
//        russia.setPopulation(150000000);
//        russia.setSizeOfarea(6000000);
        System.out.println("Number of population in Russia is "+russia.getPopulation());


        Country usa=new Country("USA", "North America");// Используем 2 ой конструктор
        System.out.println("Info about USA: Name is "+usa.getName()+", Continent is "+usa.getContinent()+".");

        Country brazil=new Country();



        House Miki=new House("Singl house","New York",1500,3);// Constructor 3
//        Miki.setType("Singl house");
//        Miki.setLocation("New york");
//        Miki.setNumberOflevel(3);
//        Miki.setSizeOfsf(1500);
        System.out.println("Miki house : Type ="+Miki.getType()+
                ", Number of levels  = "+Miki.getNumberOflevel()+
                ", Location = "+Miki.getLocation()+
                ", Size = "+Miki.getSizeOfsf());


        House rai=new House("Appartment","Bethesda",2000,4);
        System.out.println("Info about Rai house: Type is "
                +rai.getType()+", Location is "
                +rai.getLocation()+", Size is "
                +rai.getSizeOfsf()+ ", Level is "
                +rai.getNumberOflevel());

        House bob=new House();

        String []users={"Russia","USA","Brazil"}; //добавил Array
        Plane russian=new Plane("Suhoi Superjet",100,"Company Suhoi","Russia",150,users);// Constructor 4
//        russian.setName("Suhoi Superjet");
//        russian.setModel(100);
//        russian.setManufacturer("Company Suhoi");
//        russian.setCountry("Russia");
//        russian.setNumberOfsets(150);
        System.out.println("Name = "+russian.getName()+
                "\nModel = "+russian.getModel()+
                "\nManufacturer = "+russian.getManufacturer()+
                "\nCountry = "+russian.getCountry()+
                "\nNumbersOfsets = "+russian.getNumberOfsets());

        russian.printinfo(); //Вызываем печать всех полей из класса Plane


        Plane american=new Plane("Boing", 787,"Company Boing","USA", 250,users);// Constructor 4
        System.out.println("Info about of the American plan = "+american.getName()+
                ", Model = "+american.getModel()+
                ", Manufacturer = "+american.getManufacturer()+
                ", Country = "+american.getCountry()+
                ", NumbersOfsets = "+american.getNumberOfsets()+".");


        Plane brazilian=new Plane();
        brazilian.setName("Embraer");
        brazilian.setModel(175);
        brazilian.setManufacturer("Company Embraer");
        brazilian.setCountry("Brazil");
        brazilian.setNumberOfsets(300);
        System.out.println("Info about of the Brazilian plan: Name = "+brazilian.getName()+
                ", Model = "+brazilian.getModel()+
                ", Manufacturer = "+brazilian.getManufacturer()+
                ", Country = "+brazilian.getCountry()+
                ", NumbersOfsets = "+brazilian.getNumberOfsets()+".");


    }
}
