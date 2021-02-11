package hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Print CPU model from computer

        Keyboard keybord = new Keyboard("Macally", "UltraSlim");
        Keyboard keyboard1 = new Keyboard ("Anker", "UltraCompact");
        Mouse mouse = new Mouse("Wireless", "black");
        Mouse mouse1 = new Mouse("Cable", "white");

        Monitor samsung = new Monitor("Samsung", 27);
        Monitor lg = new Monitor("LG", 32);
        Monitor[] monitors = {samsung, lg, new Monitor("Acer", 34)};



        MotherBoard motherBoard = new MotherBoard("ControlUnit", "RAM");
        MotherBoard motherBoard1 = new MotherBoard("ArithmeticUnit", "ROM");
        VideoAdapter videoAdapter = new VideoAdapter("HDM");
        PowerSupply powerSupply = new PowerSupply("linear");
        Disk disk = new Disk("HDD", 250);

        SystemBlock systemBlock = new SystemBlock(motherBoard, videoAdapter, powerSupply, disk);


// *** Computer #1
        Computer dell = new Computer(keybord, mouse, monitors, systemBlock);
        System.out.println(dell.getSystemBlock().getMotherBoard().getCpu());

        String info = dell.getMonitors()[1].getModel();
        System.out.println(info);

        System.out.println(dell.getSystemBlock().getVideoAdapter().getAdapterTypes());


// *** Computer #2 ***
        Computer sony = new Computer(keyboard1, mouse1, monitors, systemBlock);
        System.out.println(sony.getKeyboard().getBrand());
        System.out.println(sony.getMouse().getType());
        System.out.println();

        String info1 = sony.getMonitors()[0].getModel();
        System.out.println(info1);

        System.out.println(sony.getSystemBlock().getDisk().getTypes());
    }
}
