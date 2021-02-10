package lesson11;

public class App1 {
    public static void main(String[] args) {
        Address storeAddress = new Address("14 Wall street","Gotham city",State.CA,99121);
        SalesMan david = new SalesMan(new Name("David","Peters"),1990,Department.BOOKS);
        Name janeName= new Name("Jane","Olsen");
        SalesMan jane = new SalesMan(janeName,1998,Department.BOOKS);

        Manager mitchel = new Manager(new Name("Mitchel","O'Shea"),1989,"Department Manager");
        Name kristinName = new Name("Kristin","Sanders");
        Manager kristin = new Manager(kristinName,1987,"Store manager");

        Department[]departments = {Department.APPLIENCE,Department.BOOKS,Department.ELECTRONICS};
        SalesMan[]salesMEN = {david,jane,new SalesMan(new Name("Howard","Kitt"),1981,Department.APPLIENCE)};
        Manager[]managers={mitchel,kristin};


        DepartmentStore macys = new DepartmentStore(departments,salesMEN,managers,storeAddress);

        String nn= macys.getManagers()[1].getName().getFirstName();
        System.out.println(nn);


    }
}
