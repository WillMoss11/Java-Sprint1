package library.items;

import library.models.Author;
import java.util.List;

public class BookElectronic extends BookMaster {
    private String fileFormat; // e.g., PDF, EPUB

    public BookElectronic(String id, String title, List<Author> authors, String isbn, String publisher, double fileSize, String fileFormat) {
        super(id, title, authors, isbn, publisher, Integer.MAX_VALUE); // Adjust if necessary
        this.fileFormat = fileFormat;
    }

    @Override
    public void displayInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("File Size: " + getNumCopies() + " MB"); // Adjust as needed
        System.out.println("File Format: " + fileFormat);
    }
    
    public String getFileFormat() {
        return fileFormat;
    }
}

