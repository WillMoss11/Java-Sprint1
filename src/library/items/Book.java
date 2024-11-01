package library.items;

import library.models.Author;
import java.util.List;

public abstract class Book extends LibraryItem {
    public Book(String id, String title, List<Author> authors, String isbn, String publisher, int numCopies) {
        super(id, title, authors, isbn, publisher, numCopies);
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Information:");
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Copies Available: " + getNumCopies());
    }
}

