package library_system;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        User user1 = new User("Jonny", 01);
        Book learningABC = new Book("Learning ABC", "John Devil", "001001001");

        library.addBook(learningABC);
        library.displayAllBooks();

        user1.displayUserInfo();
        user1.borrow(learningABC);
        
        library.findBook("001001001");
        library.findBook("001001002");

        user1.returnBook(learningABC);
        library.findBook("001001001");
    }
}
