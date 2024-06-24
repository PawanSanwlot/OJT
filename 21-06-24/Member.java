import java.util.ArrayList;

public class Member {
    private String name;
    private String memberId;
    private ArrayList<Book> borrowedBooks;

    public Member(String name, String memberId) {
        this.name = name;
        this.memberId = memberId;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public boolean borrowBook(Book book) {
        if (borrowedBooks.size() < 5 && book.isAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.setAvailable(true);
        }
    }
}
