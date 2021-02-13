package hw11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Print CPU model from computer
        Monitor monitorAsus= new Monitor("Asus", "W-35","matte" );
        Monitor monitorAcer= new Monitor("Acer", "X-35","glacier" );
        Monitor monitorSamsung = new Monitor("Samsung","S-235","matte");

        Mouse mouse1 = new Mouse ("Logitech", "Small","Gamers");
        Mouse mouse2 = new Mouse ("BenQ", "Medium","Wireless");

        VideoAdapter videoAdapter1 = new VideoAdapter("Apple", "HDMI");
        VideoAdapter videoAdapter2 = new VideoAdapter("Star Tech", "DVI");

        PowerSupply powerSupply1 = new PowerSupply("Corsair", "Gaming");
        PowerSupply powerSupply2 = new PowerSupply("Thermaltake", "Gaming");

        Disk disk1= new Disk("Seagate", "1TB", "Internal" );
        Disk disk2= new Disk("Toshiba", "2TB", "Internal" );

        SystemBlock systemBlock1 = new SystemBlock(new MotherBoard("Intel", "Kingston"),videoAdapter1,powerSupply1,disk1);
        SystemBlock systemBlock2 = new SystemBlock(new MotherBoard("AMD", "Patriot"),videoAdapter1,powerSupply1,disk1);

        Monitor[] monitors= {monitorAcer, monitorAsus, monitorSamsung };
        Computer dell = new Computer(new Keyboard("Logitech", "L045"),mouse1,monitors,systemBlock1 );
        Computer acer1 =new Computer(new Keyboard("Hp","H-123"),mouse2,monitors,systemBlock2);
        String ddCPU1 =dell.getSystemBlock().getMotherBoard().getCpu();
        String ddRAM= dell.getSystemBlock().getMotherBoard().getRam();
        String aaDiskModel =acer1.getSystemBlock().getDisk().getModel();
        String aaDiskBrand =acer1.getSystemBlock().getDisk().getBrand();
        System.out.println("Dell computer CPU: "+ddCPU1);
        System.out.println("Dell computer RAM: "+ddRAM);
        System.out.println("Acer computer Disk model :"+aaDiskModel);
        System.out.println("Acer computer Disk brand :"+aaDiskBrand);

    }
}
