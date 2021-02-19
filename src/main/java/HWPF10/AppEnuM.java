package HWPF10;

public class AppEnuM {
    public static void main(String[] args) {
        Enum myCamera = new Enum("Pavel","Furtuna",CameraModel.CANON);


        Level[] levels = {Level.BASE,Level.MIDLE,Level.HIGH};
        EnumArray house = new EnumArray("Condo", levels);
        house.printClass();

    }
}
