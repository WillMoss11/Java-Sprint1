package library;

public abstract class BookMaster extends LibraryItem {
    private int numberOfCopies;

    public BookMaster(String id, String title, String author, String isbn, String publisher, int numCopies) {
        super(id, title, author, isbn, publisher, numCopies);
        this.numberOfCopies = numCopies;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    @Override
    public abstract void displayInfo(); // Abstract method to be implemented by subclasses
}
