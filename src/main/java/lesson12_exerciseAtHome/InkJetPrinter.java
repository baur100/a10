package lesson12_exerciseAtHome;

public class InkJetPrinter implements AmericanElectricalPlug {


    @Override
    public void useTwoFlatContacts() {
        System.out.println("I have industrial contacts IP36");

    }

    @Override
    public void useRoundContactForGround() {
        System.out.println("Ground contact is good");

    }
}
