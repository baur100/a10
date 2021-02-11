package homework11AF18;

public class Work {
    public static void main(String[] args) {

        //COMPUTER 1
        Computer pc1=new Computer(new Keyboard("Corsar","K55","Gaming"),
                new Mouse("Logitech","G502",1),
                new Monitor("LG",38,"38GN"),
                new SystemBlock(
                        new MotherBoard("GIGABYTE","AMD B550"),
                        new VideoAdapter("ASUS",1,"GeForce GT 710"),
                        new PowerSuply(450,"Other","EVGA"),
                        new Disk("SSD",1,"Samsung")));
//COMPUTER 2
        Keyboard keyboard1=new Keyboard("ASUS","GM100","Professional");
        Mouse mouse=new Mouse("Star","545",2);
        Monitor monitor=new Monitor("Samsung",28,"UW2000");
        MotherBoard motherBoard=new MotherBoard ("GIGABYTE","AMD B770");
        VideoAdapter videoAdapter=new VideoAdapter("ASUS",2,"GeForce GT 1020");
        PowerSuply powerSuply=new PowerSuply(450,"Other","EVGA");
        Disk disk=new Disk("SSD",2,"ASUS");
        SystemBlock systemBlock=new SystemBlock(motherBoard,videoAdapter,powerSuply,disk);

        Computer pc2=new Computer(keyboard1,mouse,monitor,systemBlock);
    }
}
