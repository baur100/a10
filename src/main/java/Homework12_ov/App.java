package Homework12_ov;

public class App {
    public static void main(String[] args) {

        ConstructionCompany constructionCompany1 = new ConstructionCompany("NewHomes", 50, "London",1500000);
        constructionCompany1.fileTaxes();
        constructionCompany1.construct();
        constructionCompany1.fileTaxes();

        RoofingCompany roofingCompany1 = new RoofingCompany("NewRoof",40,"Glasgow", 120000);
        roofingCompany1.makeRoofs();
        roofingCompany1.fileTaxes();
        roofingCompany1.getLicense();

    }
}
