package HW8;

public class App {
    public static void main(String[] args) {
        House Diego = new House();
        Diego.type = "Singl house";
        Diego.location = "Washington DC";
        Diego.sizeOfsf = 1500;
        Diego.numberOflevel = 3;
        System.out.println("Location is " + Diego.location);

        Diego.info("Jane");
        Diego.info1("Building");


        House Max = new House();
        Max.type = "Town house";
        Max.location = "New York";
        Max.sizeOfsf = 2500;
        Max.numberOflevel = 2;

        System.out.println("Max is living in " + Max.type + ".");


        Plane Suhoi = new Plane();
        Suhoi.name = "SuperJet";
        Suhoi.model = 100;
        Suhoi.manufacturer = "Company Suhoi";
        Suhoi.country = "Russia";
        Suhoi.numberOfsets = 150;

        Suhoi.info();


        Plane Boing = new Plane();
        Boing.name = "Dreamliner";
        Boing.model = 787;
        Boing.manufacturer = "Company Boing";
        Boing.country = "USA";
        Boing.numberOfsets = 350;

        Boing.info();



        Country Russia = new Country();
        Russia.name = "Russian Federation";
        Russia.continent = "Eurasia";
        Russia.population = 150000000;
        Russia.sizeOfarea = 6000000;

        Russia.infoMaker("Suhoi");
        Russia.distination1("Suhoi");


        Country USA = new Country();
        USA.name = "Unites State of America";
        USA.continent = "North America";
        USA.sizeOfarea = 5000000;
        USA.population = 300000000;

        USA.infoMaker("Boing");
        USA.distination("Boing");



    }
}
