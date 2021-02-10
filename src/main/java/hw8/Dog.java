package hw8;

public class Dog {
    public String breed;
    public String color;
    public String nickname;
    public int year;

    public void bark() {

        System.out.println(nickname + " " + "can bark very loud");
    }

    public void skills() {
        System.out.println(nickname + " " + "knows many commands");
        System.out.println("++++++++++");
    }
}

// 1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают