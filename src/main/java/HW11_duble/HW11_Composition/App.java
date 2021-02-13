package HW11_duble.HW11_Composition;

public class App {
    public static void main(String[] args) {

        Keyboard kb=new Keyboard("Zenit", "Super",KeyBoardType.WIRE);

        Mouse ms=new Mouse("Xerox","Tree",MouseType.WIRELESS);

        Monitor hp=new Monitor("HP","LED",1080,ScreenSize.NOMAL);
        Monitor msi=new Monitor("MSI","LCD",1320,ScreenSize.WIDE);
        Monitor[]monitors={hp,msi};

        Disk ds=new Disk("IBM","Pop");
        PowerSuply ps=new PowerSuply("Intel","Gateway");
        RAM ram=new RAM("JBL","Zoo");
        CPU cpu=new CPU("AMD","Bose",4);
        MotherBoard mb=new MotherBoard(cpu,ram);
        SystemBlock sb=new SystemBlock(mb,ps,ds);

        Computer myComputer=new Computer(kb,ms,monitors,sb);

        System.out.println(myComputer.getSystemBlock().getMotherBoard().getCpu().getModel());




    }
}
