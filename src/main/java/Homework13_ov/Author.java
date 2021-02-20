package Homework13_ov;

public class Author {
    private  String bookName;
    private int  year;

    public Author(String bookName, int year) {
        this.bookName = bookName;
        this.year = year;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookName='" + bookName + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
