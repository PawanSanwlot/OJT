public class PremiumMember extends Member {
    public PremiumMember(String name, String memberId) {
        super(name, memberId);
    }

    @Override
    public boolean borrowBook(Book book) {
        if (getBorrowedBooks().size() < 10 && book.isAvailable()) {
            getBorrowedBooks().add(book);
            book.setAvailable(false);
            return true;
        }
        return false;
    }
}
