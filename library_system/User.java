package library_system;

public class User {
    String name;
    int userID;

    public User(String name, int userID) {
        this.name = name;
        this.userID = userID;
    }

    public void borrow(Book book) {
        book.borrowBook();
    }

    public void returnBook(Book book) {
        book.returnBook();
    }

    public void displayUserInfo() {
        System.out.println("User Name: " + name);
        System.out.println("User ID: "+ userID);
    }
}
