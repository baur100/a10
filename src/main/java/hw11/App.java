package hw11;

public class App {
    public static void main(String[] args) {
        //Computer 1
                Computer pc1 = new Computer(new Keyboard("Acer","SK-9621","Regular"),
                new Mouse("Acer","A506","Wired"),
                new Monitor("Asus","PA50",1080),
                new SystemBlock(
                        new MotherBoard("Gigabyte","Intel"),
                        new VideoAdapter("Gigabyte","GeForce",4),
                        new PowerSuply("Evga","Fan",650),
                        new Disk("HDD","Dell",500)));
                String cc = pc1.getSystemBlock().getMotherBoard().getChipset();
        System.out.println("CPU for pc1:" + cc);

        // Computer 2



        Keyboard keyboard1 = new Keyboard("AcerA","AcRE","Gaming");
        System.out.println(keyboard1.toString());
        Mouse mouse = new Mouse("Dell","DellQ","Gaming");
        System.out.println(mouse.toString());
        Monitor monitor = new Monitor("Samsung","Srta",1920);
        MotherBoard motherBoard = new MotherBoard("Asus","Amd");
        VideoAdapter videoAdapter = new VideoAdapter("Zotac","GeForse1050",4);
        PowerSuply powerSuply = new PowerSuply("Dell","Cool",550);
        Disk disk = new Disk("SSD","Toshiba",840);
        SystemBlock systemBlock = new SystemBlock(motherBoard,videoAdapter,powerSuply,disk);
        Computer pc2 = new Computer(keyboard1,mouse,monitor,systemBlock);
        String qq = pc2.getSystemBlock().getMotherBoard().getChipset();
        System.out.println("CPU for pc2:" + qq);



        // Print CPU model from computer
      //  System.out.println(pc1.getSystemBlock().getMotherBoard().getChipset());
    }
}
