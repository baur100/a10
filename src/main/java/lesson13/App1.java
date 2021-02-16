package lesson13;

import java.util.ArrayList;
import java.util.List;

public class App1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<String>();
        System.out.println(colors);
        colors.add("Red");
        System.out.println(colors);
        colors.add("Blue");
        colors.add("Pink");
        colors.add("Red");
        colors.add("Green");
        System.out.println(colors);
        System.out.println(colors.size());
        System.out.println(colors.get(1));
        System.out.println(colors.get(2));
        colors.set(2,"Cyan");
        System.out.println(colors);

        colors.add(1,"Yellow");
        System.out.println(colors);
        ArrayList<String>lights = new ArrayList<>();
        lights.add("Light-Green");
        lights.add("Light-Blue");
        colors.addAll(1,lights);
        System.out.println(colors);
        boolean isInList = colors.contains("Cyan1");
        System.out.println(isInList);
        colors.remove("Red");
        System.out.println(colors);
        colors.remove(1);
        System.out.println(colors);

        for (String v:colors){
            System.out.println(v);
        }
        for (int i=0;i<colors.size();i++){
            System.out.println(colors.get(i));
        }


    }
}
