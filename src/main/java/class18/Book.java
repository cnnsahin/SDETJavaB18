package class18;

public class Book {
    private String title;
    private String author;
    private String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
    }
}
class EBook extends Book {
    private String downloadLink;

    public EBook(String title, String author, String ISBN, String downloadLink) {
        super(title, author, ISBN);
        this.downloadLink = downloadLink;
    }
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Download Link: " + downloadLink);
    }
}

class PrintBook extends Book {
    private int numberOfCopies;

    public PrintBook(String title, String author, String ISBN, int numberOfCopies) {
        super(title, author, ISBN);
        this.numberOfCopies = numberOfCopies;
    }
    public void displayBookDetails() {
        super.displayBookDetails();
        System.out.println("Number of Copies: " + numberOfCopies);
    }
}

