package library;

public class Book extends LibraryItem {
    private boolean isAudio;
    private boolean isElectronic;

    public Book(String id, String title, String author, String isbn, String publisher, int numCopies, boolean isAudio, boolean isElectronic) {
        super(id, title, author, isbn, publisher, numCopies);
        this.isAudio = isAudio;
        this.isElectronic = isElectronic;
    }

    @Override
    public void displayInfo() {
        // Display book information
        System.out.println("Book Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Copies Available: " + getNumCopies());
        System.out.println("Audio: " + isAudio);
        System.out.println("Electronic: " + isElectronic);
    }
}
