package library;

public class BookPrinted extends Book {
    private int numberOfPages;

    public BookPrinted(String id, String title, String author, String isbn, String publisher, int numCopies, int numberOfPages) {
        super(id, title, author, isbn, publisher, numCopies, false, false); // Not audio or electronic
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}
