package Homework13_ov;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> years = new ArrayList<>();
        years.add(1864);
        years.add(1905);
        years.add(1924);
        years.add(1956);
        List<String> publishers = new ArrayList<>();
        publishers.add("Pinguin");
        publishers.add("StarPublisher");
        publishers.add("SuperBestseller");
        publishers.add("NewYork Times");

        Book b1= new Book("Gulliver's Adventures", "Jonathan Swift");
        Book b2 = new Book("1000 miles under water", "Joel Vern");
        Book b3 = new Book("Robinson Crusoe", "Daniel Defoe");
        Book b4 = new Book("Faust", "Goethe");
        List<Book> books= new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        System.out.println(years.get(0));
        years.set(2, 2005);
        System.out.println(years);
        years.remove(3);
        System.out.println(years);
        System.out.println(years);
        for(Integer y: years){
            System.out.println(y);
        }

        for(int i=0; i< years.size(); i++){
            System.out.println(years.get(i));
        }
        System.out.println(publishers.get(3));
        System.out.println(publishers);
        publishers.set(1, "NewYorker");
        System.out.println(publishers);
        publishers.remove(0);
        System.out.println(publishers);
        for(String p: publishers){
            System.out.println(p);
        }

        for(int i=0; i< publishers.size(); i++){
            System.out.println(publishers.get(i));
        }
        System.out.println(books.get(1));
        System.out.println(books);
        b1.setBookName("Harry Potter");
        b1.setBookAuthor("J. Rowling");
        System.out.println(books);
        books.remove(3);
        for(Book b: books){
            System.out.println(b);
        }

        for(int i=0; i< books.size(); i++){
            System.out.println(publishers.get(i));
        }


    }
}
