package lesson12_exerciseAtHome;

public class App {
    public static void main(String[] args) {
        InkJetPrinter hp65 = new InkJetPrinter();
        DesctopLight my44 = new DesctopLight("My44", 23);

//        hp65.useRoundContactForGround();
//        my44.useRoundContactForGround();

        AmericanElectricalPlug electricalDevice1 = new InkJetPrinter();
        AmericanElectricalPlug electricalDevice2 = new DesctopLight("XX", 24);
        AmericanElectricalPlug[] electricalDevaces = {electricalDevice1, electricalDevice2, hp65, my44};
        for (AmericanElectricalPlug ed : electricalDevaces) {
            ed.useTwoFlatContacts();
        }
    }
}
