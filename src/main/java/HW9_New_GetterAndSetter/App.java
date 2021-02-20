package HW9_New_GetterAndSetter;

public class App {
    public static void main(String[] args) {
        String[] userOfSuhoi = {"Russia", "USA", "Brazil", "France", "Italy"};
        String[] userForCargo = {"Chili", "Mexico", "Cuba"};

        Plane suhoi = new Plane("Suhoi", "SuperJet", 100, "Passenger", userOfSuhoi);
        //System.out.println(suhoi);
        //System.out.println(suhoi.getTypeOfPlane());
        //suhoi.printinfo();

        Plane tu = new Plane();//Создали самолет при помощи пустого Конструтора
        tu.setBrand("Tupolev");
        tu.setName("144");
        tu.setNumberOfSets(150);
        tu.setTypeOfPlane("Passenger");
        tu.setUserCountry(userOfSuhoi);
        //tu.printinfo();

        Plane il = new Plane("Il", "86", 250, "Cargo", userForCargo);
        //il.printinfo();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        String[] applyen = {"Oven", "Microwave", "Refrigirator"};
        House myHouse = new House("Single", "MD", 3000, 3, applyen);
        //myHouse.printInfo();

        House superHouse=new House();
        superHouse.setTypeOfHouse("TowneHouse");
        superHouse.setState("VA");
        superHouse.setSquare(5000);
        superHouse.setNumberOfLevel(5);
        superHouse.setAppliances(applyen);

       // superHouse.printInfo();
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    Country russia =new Country("Russia","Europe",150000000,10000000);
    russia.printCountry();

    Country france=new Country();
    france.setName("France");
    france.setContinent("Euope");
    france.setPopulation(50000000);
    france.setSizeOfarea(10000);
    france.printCountry();

    }
}
