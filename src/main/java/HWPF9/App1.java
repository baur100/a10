package HWPF9;

public class App1 {
    public static void main(String[] args) {
        String[] subjs={"Art","Philosophy","Economy"};
        Teacher adam = new Teacher("Adam","Black",1969,subjs);

        adam.printClass();
    }
}
