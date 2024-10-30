package library;

public class BookElectronic extends Book {
    private String fileSize;
    private String fileFormat;

    public BookElectronic(String id, String title, String author, String isbn, String publisher, int numCopies, String fileSize, String fileFormat) {
        super(id, title, author, isbn, publisher, numCopies, false, true); // Not audio, is electronic
        this.fileSize = fileSize;
        this.fileFormat = fileFormat;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("File Size: " + fileSize);
        System.out.println("File Format: " + fileFormat);
    }
}
