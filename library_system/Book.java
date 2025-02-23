package library_system;

public class Book {
    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public void borrowBook() {
        if (isBorrowed) {
            System.out.println("The book ("+ title +") is already borrowed.");
        } else {
            isBorrowed = true;
            System.out.println("The book ("+ title +") borrowed successfully.");
        }
    }

    public void returnBook() {
        if (isBorrowed) {
            isBorrowed = false;
            System.out.println("The ook ("+ title +") returned successfully.");
        } else {
            System.out.println("The book ("+ title +") has not been borrowed.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("isBorrowed: " + isBorrowed);
    }
}
