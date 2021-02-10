package HW10_Inheritance;

public class App {
    public static void main(String[] args) {
        String[] devices = {"Radio", "ABS"};
        MechanicleVehicle mycar = new MechanicleVehicle
                ("Toyota", "Camry", "Japan", devices);

        ElectricVehicle myWifecar = new ElectricVehicle
                ("Tesla", "S", "Company Tesla", "LongRange");

        PassangerMechanicleVehicle mySon = new PassangerMechanicleVehicle
                ("Volvo", "X70", "Company Volvo", devices, 8);

        PasMecVehSUV myDad=new PasMecVehSUV
                ("Ford","Explorer","USA", devices,10,"SUV");

        System.out.println(myDad.getModel());
    }
}
