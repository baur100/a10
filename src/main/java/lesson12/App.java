package lesson12;

public class App {
    public static void main(String[] args) {
        InkJetPrinter hp65 = new InkJetPrinter();
        DesktopLight my44 = new DesktopLight("My44", 23);
//        hp65.useRoundContactForGround();
//        my44.useRoundContactForGround();

        AmericanElectricalPlug electricalDevice1 = new InkJetPrinter();
        AmericanElectricalPlug electricalDevice2 = new DesktopLight("XX", 24);
        AmericanElectricalPlug[] electricalDevices = {electricalDevice1, electricalDevice2, hp65, my44};

//        for (AmericanElectricalPlug ed : electricalDevices) {
//            ed.useTwoFlatContacts();
//        }

        String hello = "Hello";
        System.out.println(hello.length());

    }


}

