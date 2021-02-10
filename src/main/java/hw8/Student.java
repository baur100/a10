package hw8;

public class Student {
    public String name;
    public String lastName;
    public int yearOfbirth;

    public String getInfo() {
        return "Name: " + name + " LastName: " + lastName + " YearOfBirth: " + yearOfbirth;
    }

    public void hello(String nName) {
        System.out.println(name + " sying hello to " + nName);
        System.out.println("++++++++++");
    }
}

// 1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают

