package lesson11;

public class ZApp1 {
    public static void main(String[] args) {
        Address storeAddress = new Address("14 Wall street", "Gotham", State.CA, 99121);
        SalesMan david = new SalesMan(new Name("David", "Peters"), 1998, Department.BOOKS);// inline method//1 variant


        Name janeName = new Name("Jane", "Olsen"); //Инициализация имени                               //2 ой вариант
        SalesMan jane = new SalesMan(janeName,1998, Department.BOOKS); // создаем новый объект  //2 ой вариант

        Manager mitchel = new Manager(new Name("Mitchel", "O Shea"), 1999, "Department Manager");//inline method

        Name kristinName = new Name("Kristin","Sanders");
        Manager kristin=new Manager(kristinName,1987,"Store Manager");

        Department[]departments={Department.APPLIENCE,Department.BOOKS,Department.ELECTRONICS};//создали эррей Depatments

        SalesMan[]salesMEN={david,jane, new SalesMan(new Name("Howard","Kitt"),1981,Department.APPLIENCE)};//создали эррей

        Manager[]managers={mitchel,kristin};//создали эррей из менеджеров

        DepartmentStore macys=new DepartmentStore(departments,salesMEN,managers,storeAddress);

        String nn=macys.getManagers()[1].getName().getLastName();
        System.out.println(nn);









    }
}
