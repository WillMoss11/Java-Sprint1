package library;

public class PeriodicalElectronic extends Periodical {
    public PeriodicalElectronic(String id, String title, String author, String isbn, String publisher, int numCopies) {
        super(id, title, author, isbn, publisher, numCopies, true); // Assuming it's electronic
    }

    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent class method
    }
}

