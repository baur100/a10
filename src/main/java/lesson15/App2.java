package lesson15;

public class App2 {
    public static void main(String[] args) {
        String str = "Hello today is a Good Day";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);
        System.out.println(str.charAt(6));
        System.out.println(str.contains("tOday"));
        System.out.println(str.length());
        System.out.println(str.concat(" TRUE"));
        System.out.println(str.equals(str));
        System.out.println(str.replaceAll("o","O"));
        String[] words = str.split(" ");
//        for (String word: words){
//            System.out.println(word);
//        }
        String sent = String.join("-",words);
        System.out.println(sent);

    }
}
