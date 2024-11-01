package library.items;

import library.models.Author;
import java.util.List;

public class PeriodicalElectronic extends PeriodicalMaster {
    private double fileSize;

    public PeriodicalElectronic(String id, String title, List<Author> authors, String isbn, String publisher, double fileSize) {
        super(id, title, authors, isbn, publisher, Integer.MAX_VALUE); // Unlimited copies
        this.fileSize = fileSize;
    }

    @Override
    public void displayInfo() {
        System.out.println("Periodical Electronic:");
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("File Size: " + fileSize + " MB");
    }

    public double getFileSize() {
        return fileSize;
    }
}


