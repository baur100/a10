package lesson7nik;

import org.xml.sax.helpers.ParserAdapter;

import java.util.Arrays;

public class Homework7 {
    public static void main(String[] args) {
        int[]arr = {1,5,1,2,1,4,4,7,0,9,0};
        Arrays.sort(arr);

        for (int v:arr){
            System.out.println(v);
        }
    }
}