package HW_AA02_L11;

public class App {
    public static void main(String[] args) {
        // Create 2 computers
        // Print CPU model from computer
        Computer forOffice = new Computer(
                new Keyboard("logitec", "aa1"),
                new Mouse("Samsung", "ss2"),
                new Monitor[]{new Monitor("LG", "dd27", 27), new Monitor("Samsung", "aa38", 38)},
                new SystemBlock(
                        new MotherBoard("Asus", "Intel core i3"),
                        new VideoAdapter("nVideo", "3090"),
                        new PowerSuply("IBM", "220i"),
                        new Disk("Seagate", 100)
                )
        );

        String cc = forOffice.getSystemBlock().getMotherBoard().getCpu();

        System.out.println("CPU for offices computer: "+cc);

        Computer forGamer = new Computer(
                new Keyboard("Samsung", "aa4"),
                new Mouse("Lg", "ss4"),
                new Monitor[]{new Monitor("LG", "dd27", 27), new Monitor("Samsung", "aa38", 38), new Monitor("HP", "hd40", 40)},
                new SystemBlock(
                        new MotherBoard("MSI", "AMD 2G"),
                        new VideoAdapter("nVideo", "1090"),
                        new PowerSuply("IBM", "220i"),
                        new Disk("WD", 500)
                )
        );

        String gg = forOffice.getSystemBlock().getMotherBoard().getCpu();

        System.out.println("CPU for gamers computer: "+gg);
    }
}
