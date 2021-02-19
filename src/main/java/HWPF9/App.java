package HWPF9;



public class App {
    public static void main(String[] args) {
        Camera dsrl = new Camera("Canon","1DXm2",2018);
        dsrl.setMake("Canon");
        dsrl.setModel("1DXm2");
        dsrl.setYear(2018);

        System.out.println("Make ="+dsrl.getMake() + "Model = " +dsrl.getModel()+"year = "+ dsrl.getYear());

        Laptop dell = new Laptop();
        dell.setTypeOfLaptop("Gaming");
        dell.setBrand("Dell");
        dell.setColor("Silver");

        System.out.println("Brand= "+dell.getBrand() + "TypeOfLaptop = "+dell.getTypeOfLaptop()+ "Color = "+ dell.getColor());

        Human pavel = new Human();
        pavel.setName("Pavel");
        pavel.setLastName("Furtuna");
        pavel.setYear(1982);

        System.out.println("Name ="+pavel.getName() + "LastName =" + pavel.getLastName() +"year =" + pavel.getYear());




    }




}
