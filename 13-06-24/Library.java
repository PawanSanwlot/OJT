import java.util.ArrayList;
import java.util.List;

// Book class to represent book details
class Book {
    private String title;
    private String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getter methods for book details
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // toString method to represent the book as a string
    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author;
    }
}

// Library class to manage a list of books
public class Library {
    // Private list to store books
    private List<Book> books;

    // Constructor to initialize the book list
    public Library() {
        books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library by title
    public void removeBook(String title) {
        books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        library.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Book("1984", "George Orwell"));

        // Listing all books
        System.out.println("List of books in the library:");
        library.listBooks();

        // Removing a book by title
        library.removeBook("1984");

        // Listing all books after removal
        System.out.println("\nList of books in the library after removal:");
        library.listBooks();
    }
}
