import java.util.ArrayList;
import java.util.List;

public class Library {
    // Collection of books
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.getTitle() + " by " + book.getAuthor() + " has been added to the library.");
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        if (books.remove(book)) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " has been removed from the library.");
        } else {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " is not in the library.");
        }
    }

    // Method to display all books in the library
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("The library is empty.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Main method to test the Library class
    public static void main(String[] args) {
        Library library = new Library();

        // Create some books
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book3 = new Book("1984", "George Orwell");

        // Add books to the library
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Display books in the library
        library.displayBooks();

        // Remove a book from the library
        library.removeBook(book2);

        // Display books in the library again
        library.displayBooks();
    }
}
