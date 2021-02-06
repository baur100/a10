package Homework8_ov;

public class App {

    public static void main(String[]args){

        Author author1= new Author();
        author1.authorFirstName = "Arthur";
        author1.authorLastName = "Conan Doyle";
        author1.authorYearOfBirth = 1859;
        author1.authorStyle = "Detective stories";
        author1.authorCountry = "England";
        author1.nameOfBook = "Sherlock Holmes";

        author1.authorWasBorn();
        author1.style();
        author1.write();

        Author author2 = new Author();
        author1.authorFirstName = "Joanne";
        author1.authorLastName = "Rowling";
        author1.authorYearOfBirth = 1965;
        author1.authorStyle = "Fantasy";
        author1.authorCountry = "England";
        author1.nameOfBook = "Harry Potter";

        author2.authorWasBorn();
        author2.style();
        author2.write();


        Book book1 = new Book();
        book1.yearPublished = 1887;
        book1.nameOfAuthor = author1.authorLastName;
        book1.nameOfBook= author1.nameOfBook;

        book1.bookCreate();
        book1.bookPublish();

        Book book2 = new Book();
        book2.yearPublished = 1997;
        book2.nameOfAuthor = author2.authorLastName;
        book2.nameOfBook= author2.nameOfBook;

        book2.bookCreate();
        book2.bookPublish();

        Customer customer1 = new Customer();
        customer1.customerFirstName = "John";
        customer1.customerLastName = "Brown";
        customer1.city = "London";
        customer1.bookStyle = "Detective story";
        customer1.like();
        customer1.live();

        Customer customer2 = new Customer();
        customer2.customerFirstName = "Mary";
        customer2.customerLastName = "Nia";
        customer2.city = "Glasgow";
        customer2.bookStyle = "Fantasy";
        customer2.like();
        customer2.live();




    }
}
