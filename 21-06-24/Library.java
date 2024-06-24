import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;

    public Library() {
        books = new ArrayList<>();
        members = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public Book findBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public Member findMemberById(String memberId) {
        for (Member member : members) {
            if (member.getMemberId().equals(memberId)) {
                return member;
            }
        }
        return null;
    }

    public boolean borrowBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null) {
            return member.borrowBook(book);
        }
        return false;
    }

    public void returnBook(String memberId, String isbn) {
        Member member = findMemberById(memberId);
        Book book = findBookByIsbn(isbn);
        if (member != null && book != null) {
            member.returnBook(book);
        }
    }

    public void listBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
        }
    }

    public void listMembers() {
        for (Member member : members) {
            System.out.println(member.getName() + " (ID: " + member.getMemberId() + ")");
        }
    }

    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Alchemist", "Paulo Cohelo", "1234567890");
        Book book2 = new Book("Lord of the rings", "J.R.R. Tolkien", "1234567891");

        library.addBook(book1);
        library.addBook(book2);

        Member member1 = new Member("Pavan", "M001");
        Member member2 = new PremiumMember("Harilal", "M002");

        library.addMember(member1);
        library.addMember(member2);

        library.listBooks();
        library.listMembers();

        System.out.println("\nBorrowing Book:");
        if (library.borrowBook("M001", "1234567890")) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Failed to borrow the book.");
        }

        library.listBooks();

        System.out.println("\nReturning Book:");
        library.returnBook("M001", "1234567890");
        library.listBooks();
    }
}
