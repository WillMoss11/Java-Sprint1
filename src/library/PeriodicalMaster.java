package library;

public abstract class PeriodicalMaster extends LibraryItem {
    public PeriodicalMaster(String id, String title, String author, String isbn, String publisher, int numCopies) {
        super(id, title, author, isbn, publisher, numCopies);
    }

    // Additional methods for specific periodical types can be added here
}
