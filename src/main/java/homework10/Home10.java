package homework10;

public class Home10 {
    public static void main(String[] args) {

//        *** Inheritance ***

        String[] available = {"Monday", "Wednesday", "Friday"};
        Positions lawyer = new Positions("Lawyer", "Permanent", "FullTime", "onsite", available);
        System.out.println(lawyer.getName()+ " " +lawyer.getTime());
        lawyer.printInfo();


        Company pepsi = new Company("Pepsi", "contract", "FullTime", "remote", "IT");

        CompanyInternat sweetwater = new CompanyInternat("Sweetwater", "contract", "PartTime", "remote", "legal", "Paris");



//        *** Enum ***


        Colors [] col = {Colors.RED, Colors.BLACK, Colors.WHITE};
        Dress dress = new Dress("Dress", "Dior", Size.MEDIUM, col);
        dress.printDress();



        Dress wedding = new Dress("Wedding", "Zara", Size.SMALL, col);
        wedding.printDress();


    }
}
