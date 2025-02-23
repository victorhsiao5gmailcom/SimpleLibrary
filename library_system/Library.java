package library_system;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void findBook(String isbn) {
        for (Book book : books) {
            if (book.isbn == isbn) {
                book.displayBookInfo();
            } else {
                System.out.println("The book (ISBN: " + isbn +") is not found.");
            }
        }
    }

    public void displayAllBooks() {
        for (Book book : books) {
            book.displayBookInfo();
        }
    }
}
