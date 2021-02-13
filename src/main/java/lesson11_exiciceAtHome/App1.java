package lesson11_exiciceAtHome;

public class App1 {

    public static void main(String[] args) {
//Создаем адресс
        Address storeAddress = new Address("15 Wall str.", "Gotham", State.CA, 99121);

//Создаем 1го Сэйлз
        SalesMan david = new SalesMan(new Name("David", "Peters"), 1990, Department.BOOKS);//inline

//Создаем 2го Сэйлз
        Name janeName = new Name("Jane", "Olsen");
        SalesMan jane = new SalesMan(janeName, 1998, Department.BOOKS);

//Создаем 1го Менеджера
        Manager mitchel = new Manager(new Name("Mitchel", "Oshea"), 1989, "Department Manage");

//Создаем 2го Менеджера
        Name kristinName = new Name("Kristin", "Sanders");
        Manager kristin = new Manager(kristinName, 1997, "");

//Создаем Эррей для Департмента
        Department[] departments = {Department.APPLINCE, Department.BOOKS, Department.ELECTRONICS};

//Создаем Эррей для Сэйлз менеджеров
        SalesMan[] salesMEN = {david, jane, new SalesMan(new Name("Howad", "Kitt"), 1981, Department.APPLINCE)};

//Создаем Эррей для Менеджеров
        Manager[]managers={mitchel,kristin};

//Создаем ДепартментСтор Macyc

DepartmentStore macyc=new DepartmentStore(departments,salesMEN,managers,storeAddress);

//Распечатать имея Кристин

        String nn=macyc.getManagers()[1].getName().getName();
        System.out.println(nn);
        String cc=macyc.getManagers()[1].getName().getLastName();
        System.out.println(cc);
    }
}
