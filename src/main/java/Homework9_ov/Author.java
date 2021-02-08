package Homework9_ov;



    public class Author  extends Person{
        private String authorStyle;
        private String nameOfBook;
        private String[] books;


        public Author(String authorFirstName, String authorLastName,  int authorYearOfBirth, String authorCity, String authorCountry,String authorStyle, String nameOfBook, String[] books) {
          super(authorFirstName,authorLastName,authorYearOfBirth,authorCountry, authorCity);


            this.authorStyle = authorStyle;

            this.nameOfBook = nameOfBook;
            this.books = books;
        }

        public Author(){

        }



        public String getAuthorStyle() {
            return authorStyle;
        }

        public void setAuthorStyle(String authorStyle) {
            this.authorStyle = authorStyle;
        }



        public String getNameOfBook() {
            return nameOfBook;
        }

        public void setNameOfBook(String nameOfBook) {
            this.nameOfBook = nameOfBook;
        }

        public String[] getBooks() {
            return books;
        }

        public void setBooks(String[] books) {
            this.books = books;
        }

        public void write(){
            System.out.println( getName()+" "+ getLastName()+" "+"has written"+ " "+nameOfBook);
        }

        public void style(){
            System.out.println("The book is a "+ authorStyle);
        }

        public void authorWasBorn(){
            System.out.println("Author was born in "+ getYear()+"in "+ getCity());
        }

        public void printInfo(){

            System.out.println(" Author first name : "+ getName()+ "\nLast name : "+ getLastName()+"\nAuthor genre : "+getAuthorStyle()+"\nYear of birth : "+getYear()+"\nCountry : "+ getCountry()+"\n Books written : ");
            for(String v: books){
                System.out.println(v);
            }
        }

    }


