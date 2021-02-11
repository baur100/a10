package hw11;

public class App {
    public static void main(String[] args) {

        String[] lan = {"ENG, RUS", "ENG", "SPA ENG"};

        Monitor mon1 = new Monitor("Mac", "imac4588", 2);
        Keyboard key1 = new Keyboard("Mac", "i8338", lan);
        Mouse mm1 = new Mouse("Mac", "bza12547", "wireless");
        VideoAdapter a1 = new VideoAdapter("Apple USB", "MD826AM/A");
        MotherBoard m1 = new MotherBoard("NZXT", "K94803", 8, "NZXT");
        Disk d1 = new Disk(16.9, 10.8);
        PowerSuply p1 = new PowerSuply("Gamemax", "GM-700");
        SystemBlock s1 = new SystemBlock(m1, a1, p1, d1);
        Monitor[] monitors = {mon1};

        Computer com1 = new Computer(key1, mm1, monitors, s1);
        Double nn = com1.getSystemBlock().getDisk().getAccessTime();
        String nn1 = com1.getSystemBlock().getVideoAdapter().getModal();
        String nn2 = com1.getSystemBlock().getPowerSuply().getBrand();
        String nn3 = com1.getSystemBlock().getMotherBoard().getModal();


        Monitor mon2 = new Monitor("Samsumg", "sam4548", 1);
        Keyboard key2 = new Keyboard("Samsung", "5554", lan);
        Mouse mm2 = new Mouse("Samsung", "bza15647", "wireless");
        VideoAdapter a2 = new VideoAdapter("Samsung USB", "MD826AM/A");
        MotherBoard m2 = new MotherBoard("INYT", "T7822", 8, "ITHT");
        Disk d2 = new Disk(1.23, 15.8);
        PowerSuply p2 = new PowerSuply("Gamemax", "GM-70");
        SystemBlock s2 = new SystemBlock(m2, a2, p2, d2);
        Monitor[] monitors2 = {mon2};

        System.out.println("Computer1 Parameters" + " " + "Disc Access Time" + " " + nn + " " + " Video Adaptor model" + "  " + nn1 + " " + "Power supply brand" + " " + nn2 + " " + "Mother board modal " + " " + nn3 + " ");

        Computer com2 = new Computer(key2, mm2, monitors2, s2);
        Double nn11 = com2.getSystemBlock().getDisk().getAccessTime();
        String nn12 = com2.getSystemBlock().getVideoAdapter().getModal();
        String nn23 = com2.getSystemBlock().getPowerSuply().getBrand();
        String nn34 = com2.getSystemBlock().getMotherBoard().getModal();


        System.out.println("Computer2 Parameters" + " " + "Disc Access Time" + " " + nn11 + " " + " Video Adaptor model" + "  " + nn12 + " " + "Power supply brand" + " " + nn23 + " " + "Mother board modal " + " " + nn34 + " ");


    }
}
