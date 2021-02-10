package HW_AA02_L10;

public class Work {
    public static void main(String[] args){
    String [] mastersTools = {"screwdriver", "hammer", "saw"};
    Contractor fedor = new Contractor("Fedor", "Fedorov",32, "Handyman", mastersTools,40);
    fedor.printClass();
    }
}
