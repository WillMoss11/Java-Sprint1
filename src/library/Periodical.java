package library;

public class Periodical extends LibraryItem {
    private boolean isElectronic;

    public Periodical(String id, String title, String author, String isbn, String publisher, int numCopies, boolean isElectronic) {
        super(id, title, author, isbn, publisher, numCopies);
        this.isElectronic = isElectronic;
    }

    @Override
    public void displayInfo() {
        // Display periodical information
        System.out.println("Periodical Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Copies Available: " + getNumCopies());
        System.out.println("Electronic: " + isElectronic);
    }
}
