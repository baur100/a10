package lesson15_exerciseAtHome;

import java.util.Locale;

public class App2 {
    public static void main(String[] args) {
        String str ="Hello, today is a Good day";
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

        String[] spring=str.split(" ");
//        for (String word : spring){
//            System.out.println(word);
//        }

        String sent=String.join("-",spring);
        System.out.println(sent);







    }
}
