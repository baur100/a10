package lesson12;

public class InkJetPrinter implements AmericanElectricalPlug{
    @Override
    public void useTwoFlatContacts() {
        System.out.println("I have industrial contacts IP56");
    }

    @Override
    public void useRoundContactForGround() {
        System.out.println("Ground contact is good");

    }
}
