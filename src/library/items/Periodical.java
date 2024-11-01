package library.items;

import library.models.Author;
import java.util.List;

public abstract class Periodical extends LibraryItem {
    private boolean isElectronic;

    public Periodical(String id, String title, List<Author> authors, String isbn, String publisher, int numCopies, boolean isElectronic) {
        super(id, title, authors, isbn, publisher, numCopies);
        this.isElectronic = isElectronic;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    @Override
    public void displayInfo() {
        System.out.println("Periodical Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Copies Available: " + getNumCopies());
        System.out.println("Electronic: " + (isElectronic ? "Yes" : "No"));
    }
}

