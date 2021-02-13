package HW11_Composition;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Print CPU model from computer

//Создали 1ый монитор
        Monitor hp=new Monitor("HP","LCD",1080);
//Создали 2ой монитор
        Monitor asus=new Monitor("Asus","LED",1280);
//Создали эррей из мониторов
        Monitor[]monitors={hp,asus};
// Создали новый Keyboard
        Keyboard kb=new Keyboard("Sumsung","Super");
        Keyboard kb1=new Keyboard("ABS","rum");
// Создали новый Mouse
        Mouse ms=new Mouse("Sony","Plus");
        Mouse ms1=new Mouse("Xaiomi", "Strem");
// Создали новый CPU
        CPU cpu=new CPU("Panas","Plus");
        CPU cpu1=new CPU("OKO", "Krost");
 // Создали новый RAM
        RAM ram=new RAM("MSI","Minus");
        RAM ram1=new RAM("Sharp","Rost");
// Создали новый Disk
        Disk ds=new Disk("Sega", "Fast");
        Disk ds1=new Disk("Toshiba","West");
// Создали новый PowerSuply
        PowerSuply ps=new PowerSuply("Technic","Ogo");
        PowerSuply ps1=new PowerSuply("Razr","kop");
// Создали новый MotherBoard
        MotherBoard mb=new MotherBoard(cpu,ram);
        MotherBoard mb1=new MotherBoard(cpu1,ram1);
// Создали новый SystemBlock
        SystemBlock sb=new SystemBlock(mb,ps,ds);
        SystemBlock sb1=new SystemBlock(mb1,ps1,ds1);
// Создали новый Computer
        Computer mycomp=new Computer(kb,ms,monitors,sb);
        Computer supecomp=new Computer(kb1,ms1,monitors,sb1);
//printCpuBrand for mycomp
        String printCpuBrand=mycomp.getSystemBlock().getMotherBoard().getCpu().getBrand();
        System.out.println(printCpuBrand);
//printNameMoninorHP
        String printNameMoninorHP=mycomp.getMonitors()[0].getBrand();
        System.out.println(printNameMoninorHP);
//print Model of RAM
        System.out.println(supecomp.getSystemBlock().getMotherBoard().getRam().getModel());



    }
}
