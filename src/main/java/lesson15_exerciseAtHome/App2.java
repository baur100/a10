package lesson15_exerciseAtHome;

import java.util.Locale;

public class App2 {
    public static void main(String[] args) {
        String str ="Hello, today is a Good day";
        String cars="I love to drive new car";
//        System.out.println(str.toLowerCase());
//        System.out.println(str.toUpperCase());
//        System.out.println(str);
//        System.out.println(str.charAt(5));
//        System.out.println(str.contains("today"));
//        System.out.println(str.length());
//        //System.out.println(str.concat("True"));
//        System.out.println(str+ " True!!!");
//        System.out.println(str.equals(str));
//        System.out.println(str.replaceAll("o","O"));
        //System.out.println(str.toCharArray());
       // System.out.println(str.trim());

//Задача - Превраить Стринг строку в эррей из слов
        String[] spring=str.split(" ");//Спрашивают на интервбью
//        for (String word : spring){
//            System.out.println(word);
//        }
        String[] wordcars=cars.split(" ");//Спрашивают на интервбью
        for(String word : wordcars){
            System.out.println(word);
        }

// Задача Заменить все пробелы на черточки
        String sent=String.join("-",spring);//Спрашивают на интервбью
//        System.out.println(sent);

        String sent1=String.join("-",wordcars);//Спрашивают на интервбью
            System.out.println(sent1);










    }
}
