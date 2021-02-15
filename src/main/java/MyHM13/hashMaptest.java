package MyHM13;

import java.util.HashMap;

public class hashMaptest {
    public static void main(String[] args) {
        HashMap <String,String> capitals = new HashMap<>();
        capitals.put("Russia","Moscow");
        capitals.put("USA","Washington");
        capitals.put("Tajikistan","Dushanbe");
        capitals.put("Italy", "Roma");
       // System.out.println(capitals);

       // System.out.println("How many countries I have visit" +" " + capitals.size());
        if (capitals.containsKey("Tajikistan")){
            System.out.println("I was born in Tajikistan");
        }
    }
}
