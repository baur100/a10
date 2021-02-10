package HW_AA02_L10;

public class EnumMain {
    public static void main(String[]args) {
        Enum myCar = new Enum("Ivan", "Ivanov", CarModel.TOYOTA);
        myCar.printClass();

        Department[] dep = {Department.FINANCIAL, Department.MARKETING, Department.SALES};
        EnumArray apple = new EnumArray("Apple", dep);
        apple.printClass();
    }
}


