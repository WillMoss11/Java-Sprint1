package library.models;

import java.util.ArrayList;
import java.util.List;

import library.items.LibraryItem;

public class Author {
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> writtenItems;

    public Author(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }

    public void addWrittenItem(LibraryItem item) {
        writtenItems.add(item);
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }
}
