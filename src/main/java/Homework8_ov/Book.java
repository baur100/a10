package Homework8_ov;

public class Book {

    String nameOfBook;
    String nameOfAuthor;
    int yearPublished;

    public void bookCreate(){
        System.out.println(nameOfBook +" was written by "+ nameOfAuthor);
    }

    public void bookPublish(){

        System.out.println(nameOfBook+" was published in "+ yearPublished);


    }
}
