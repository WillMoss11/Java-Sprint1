package library;

public class PeriodicalPrinted extends Periodical {
    public PeriodicalPrinted(String id, String title, String author, String isbn, String publisher, int numCopies) {
        super(id, title, author, isbn, publisher, numCopies, false); // Assuming it's not electronic
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
    }
}
