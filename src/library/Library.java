package library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Author> authors;
    private HashMap<Patron, List<LibraryItem>> borrowedItems; // Maps patrons to borrowed items

    public Library() {
        items = new ArrayList<>();
        authors = new ArrayList<>();
        borrowedItems = new HashMap<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public boolean borrowItem(String title, Patron patron) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title) && item.getNumCopies() > 0) {
                item.setNumCopies(item.getNumCopies() - 1); // Decrease available copies
                borrowedItems.putIfAbsent(patron, new ArrayList<>());
                borrowedItems.get(patron).add(item); // Add item to patron's borrowed list
                return true;
            }
        }
        return false; // Item not available
    }

    public void returnItem(String title, Patron patron) {
        if (borrowedItems.containsKey(patron)) {
            List<LibraryItem> borrowed = borrowedItems.get(patron);
            for (LibraryItem item : borrowed) {
                if (item.getTitle().equalsIgnoreCase(title)) {
                    borrowed.remove(item); // Remove item from borrowed list
                    item.setNumCopies(item.getNumCopies() + 1); // Increase available copies
                    break;
                }
            }
        }
    }

    public List<LibraryItem> getItems() {
        return items;
    }

    public List<Author> getAuthors() {
        return authors;
    }
}
