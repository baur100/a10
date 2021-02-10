package hw8;

public class App {
    public static void main(String[] args) {
        Student emma = new Student();
        emma.name = "Emma";
        emma.lastName = "Smth";
        emma.yearOfbirth = 1990;

        String info = emma.getInfo();
        System.out.println(info);
        emma.hello("Nick");

        Student nick = new Student();
        nick.name = "Nick";
        nick.lastName = "Loui";
        nick.yearOfbirth = 1991;

        String info1 = nick.getInfo();
        System.out.println(info1);
        nick.hello("Emma");

        Teacher linda = new Teacher();
        linda.name = "Linda";
        linda.lastName = "Fox";
        linda.schoolName = "Sherman Oaks elementary school";

        String info2 = linda.getInfo();
        System.out.println(info2);
        linda.hello("Anna");

        Teacher anna = new Teacher();
        anna.name = "Anna";
        anna.lastName = "Johns";
        anna.schoolName = "Sherman Oaks elementary school";

        String info3 = anna.getInfo();
        System.out.println(info3);
        anna.hello("Lnda");

        Dog coco = new Dog();
        coco.breed = "Chihuahua";
        coco.color = "Orange";
        coco.nickname = "Coco";
        coco.year = 5;

        coco.bark();
        coco.skills();

        Dog vanila = new Dog();
        vanila.breed = "Chihuahua";
        vanila.color = "White";
        vanila.nickname = "Vanila";
        vanila.year = 2;

        vanila.bark();
        vanila.skills();

    }
}


// 1. Создайте 3 класса в которых есть аттрибуты и методы
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают