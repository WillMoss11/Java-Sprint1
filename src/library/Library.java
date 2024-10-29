package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        items = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addPatron(Patron patron) {
        patrons.add(patron);
    }

    public LibraryItem searchItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        return null; // Not found
    }

    public boolean borrowItem(String title, Patron patron) {
        LibraryItem item = searchItemByTitle(title);
        if (item != null && item.getNumCopies() > 0) {
            item.setNumCopies(item.getNumCopies() - 1);
            patron.borrowItem(item);
            return true;
        }
        return false; // Item not available
    }

    public void returnItem(String title, Patron patron) {
        for (LibraryItem item : patron.getBorrowedItems()) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                item.setNumCopies(item.getNumCopies() + 1);
                patron.returnItem(item);
                break;
            }
        }
    }
}
