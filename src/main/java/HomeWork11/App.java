package HomeWork11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Print CPU model from computer

    Monitor[] homeSetup = {new Monitor("LG", "UD32", 32, 2160), new Monitor("LG", "KC27", 27, 2160)};
    Mouse myMouse = new Mouse ("Logitech", "G604", true);
    MotherBoard MSI = new MotherBoard("MSI", "BX450", new Cpu("Intel Core i9 10850K", 3600, 10), 32);
    PowerSuply homePsu = new PowerSuply("Corsair", "blackripes", 1200);
    SystemBlock homeSystem = new SystemBlock(MSI, new VideoAdapter("Nvidia", "3090", 24, "Display Port"), homePsu, new Disk("WD", "Blue", "SSD", 240));
    Computer homePc = new Computer(new Keyboard("Logitech", "K330", 112), myMouse, homeSetup, homeSystem);

    System.out.println(homePc.getSystemBlock().getMotherBoard().getCpu().getModel());

    Monitor[] workSetup = {new Monitor("MSI", "native", 24, 1440)};
    Mouse workMouse = new Mouse ("Logitech", "G602", false);
    MotherBoard workMb = new MotherBoard("MSI", "AX390", new Cpu("Intel Core i7 4770", 3200, 4), 8);
    PowerSuply workPsu = new PowerSuply("Integrated", "", 200);
    VideoAdapter workGpu = new VideoAdapter("Intel", "HD Graphics 4600", 8, "HDMI");
    Disk workSdd = new Disk("Kingston", "3D", "SSD", 120);
    SystemBlock workSystem = new SystemBlock(workMb, workGpu, workPsu, workSdd);
    Keyboard workKb = new Keyboard("Logitech", "K200", 104);
    Computer workPc = new Computer(workKb, workMouse, workSetup, workSystem);

    System.out.println(workPc.getSystemBlock().getMotherBoard().getCpu().getModel());


    }
}
