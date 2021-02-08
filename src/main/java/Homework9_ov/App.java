package Homework9_ov;

public class App {
    public static void main(String[] args) {
        String[] books1 = {"Sherlock Holmes", "Mysteries", "The dog of Baskerville"};
        String[] books2 = {"Prisoner of Azkaban", "Philosopher's Stone", "Goblet of Fire", "Order of Phoenix", "Half-blood prince", "Deathly hallows"};
        Author arthur = new Author("Arthur", "Conan Doyle", 1859,  "London" ,"England" , "Detective", "Red Ribbon", books1);
        Author joan = new Author();

        joan.setName("Joan");
        joan.setLastName("Rowling");
        joan.setAuthorStyle("Fantasy");
        joan.setYear(1965);
        joan.setCountry("England");
        joan.setNameOfBook("Harry Potter");
        joan.setBooks(books2);


        arthur.printInfo();
        System.out.println("**************************************");
        joan.printInfo();
        System.out.println("**************************************");
        Customer customer1 = new Customer("Mary", "Nia", 1965, "Glasgow","London", "fantasy");


        customer1.printInfo();
        customer1.like2Read();

        System.out.println("**************************************");

        EReader eReader = new EReader("Patrik", "Brown", 1964, "Edinburg", "Scotland", "ABC234", "Novel",books2);
        eReader.printInfo();

        System.out.println("**************************************");
        Book book = new Book("The Adventures of Gulliver", "Jonathan Swift", 1725, Publishers.MACMILLIAN );
        book.printInfo();
    }
}
