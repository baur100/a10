package Homework9_ov;


    public class Book {

        private String nameOfBook;
        private String nameOfAuthor;
        private int yearPublished;
        private Publishers publisher;


        public Book(String nameOfBook, String nameOfAuthor, int yearPublished, Publishers publisher) {
            this.nameOfBook = nameOfBook;
            this.nameOfAuthor = nameOfAuthor;
            this.yearPublished = yearPublished;
            this.publisher = publisher;
        }

        public Book(){}
        public String getNameOfBook() {
            return nameOfBook;
        }

        public void setNameOfBook(String nameOfBook) {
            this.nameOfBook = nameOfBook;
        }

        public String getNameOfAuthor() {
            return nameOfAuthor;
        }

        public void setNameOfAuthor(String nameOfAuthor) {
            this.nameOfAuthor = nameOfAuthor;
        }

        public int getYearPublished() {
            return yearPublished;
        }

        public void setYearPublished(int yearPublished) {
            this.yearPublished = yearPublished;
        }
        public Publishers getPublisher() {
            return publisher;
        }

        public void setPublisher(Publishers publisher) {
            this.publisher = publisher;
        }

        public void bookCreate(){
            System.out.println(nameOfBook +" was written by "+ nameOfAuthor);
        }

        public void bookPublish(){

            System.out.println(nameOfBook+" was published in "+ yearPublished);


        }

        public void printInfo(){
            System.out.println("Book name : "+ nameOfBook+"\nAuthor name : "+ nameOfAuthor+"\nPublished in : "+yearPublished + "\nPublisher : "+Publishers.MACMILLIAN);
        }
    }


