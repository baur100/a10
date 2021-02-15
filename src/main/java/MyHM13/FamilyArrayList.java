package MyHM13;


import java.util.ArrayList;

public class FamilyArrayList {
        public static void main(String[] args) {
            ArrayList<String> a1 = new ArrayList<>();
            a1.add("Zarina");
            a1.add("Sofia");
            a1.add("Vali");
            a1.add("Irina");
            //System.out.println(a1.get(0));

            ArrayList<Integer> a2 = new ArrayList<>();
            a2.add(1);
            a2.add(2);
            //   System.out.println(a2);
            a2.clone();
            //  System.out.println(a2);
            //   for (int i = 0; i<a1.size();i++){
            //       System.out.println(a1.get(i));

            for (String str : a1) {
                System.out.println(str);
            }


        }

    }
