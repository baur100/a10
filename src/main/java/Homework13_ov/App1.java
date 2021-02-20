package Homework13_ov;

import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        Map<Book, Author> books = new HashMap<>();
        Book b1 = new Book("Maugly1", "R.Kippling1");
        Author a1 = new Author("Maugly1", 1901);

        Book b2 = new Book("Maugly2", "R.Kippling2");
        Author a2 = new Author("Maugly2", 1902);
        Book b3 = new Book("Maugly3", "R.Kippling3");
        Author a3 = new Author("Maugly3", 1903);
        Book b4 = new Book("Maugly4", "R.Kippling4");
        Author a4 = new Author("Maugly4", 1904);


        books.put(b1, a1);
        books.put(b2, a2);
        books.put(b3, a3);
        books.put(b4,a4);
        System.out.println(books);
        System.out.println("********************************");
        System.out.println("***************get*****************");
        System.out.println(books.get(b1));

        books.remove(b1, a1);
        System.out.println("***************remove*****************");
        System.out.println(books);
        System.out.println("************replace & for each*******************");
        books.replace(b2,a2,a3);
        for(Book key: books.keySet()){
            System.out.println(key);
        }
        System.out.println("***********iterate*********************");
        for (Map.Entry<Book, Author> entry: books.entrySet()){
            System.out.println("key "+ entry.getKey()+ " value= "+ entry.getValue());
        }
        System.out.println("**********String String**********************");

        Map<String, String> employees = new HashMap<>();
        employees.put("Food", "John Smith");
        employees.put("Clothes", "Mary Nia");
        employees.put("Electrical devices", "Don Brown");
        employees.put("Toys", "Donna Plum");
        System.out.println("************Print out********************");
        System.out.println(employees);
        System.out.println("************get********************");
        System.out.println(employees.get("Food"));
        System.out.println("**************remove & foreach******************");
        employees.remove("Clothes", "Mary Nia");

        for(String key: employees.keySet()){
            System.out.println(key);
        }
        System.out.println("************replace & foreach********************");
        employees.replace("Food", "Mary Nia");
        for (Map.Entry<String,String> entry: employees.entrySet()){
            System.out.println("key "+ entry.getKey()+ " value= "+ entry.getValue());
        }
        System.out.println("**********Integer String**********************");
        Map<Integer, String> customers = new HashMap<>();
        customers.put(1, "John Brown");
        customers.put(2,"Mike Summers");
        customers.put(3, "Vanessa May");
        customers.put(4, "Chip Chealsy");
        System.out.println("************Print out********************");
        System.out.println(customers);
        System.out.println("************get********************");
        System.out.println(customers.get(2));
        System.out.println("**************remove & foreach******************");
        customers.remove(2,"Mike Summers");

        for(Integer key: customers.keySet()){
            System.out.println(key);
        }
        System.out.println("************replace & foreach********************");
        customers.replace(1,"Din White");
        for (Map.Entry<Integer,String> entry: customers.entrySet()){
            System.out.println("key "+ entry.getKey()+ " value= "+ entry.getValue());
        }












    }
}
