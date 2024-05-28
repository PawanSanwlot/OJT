public class Book {
    private String ISBN;
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.isAvailable = true; // New books are available by default
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Sorry, the book is currently not available.");
        }
    }

    // Method to return the book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("The book was not borrowed.");
        }
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Availability: " + (isAvailable ? "Available" : "Not Available"));
    }

    // Main method to test the Book class
    public static void main(String[] args) {
        // Creating a new book
        Book book = new Book("978-0134685991", "Effective Java", "Joshua Bloch");

        // Displaying book details
        book.displayBookDetails();

        // Borrowing the book
        book.borrowBook();
        book.displayBookDetails();

        // Trying to borrow the book again
        book.borrowBook();

        // Returning the book
        book.returnBook();
        book.displayBookDetails();

        // Trying to return the book again
        book.returnBook();
    }
}
