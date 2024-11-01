package library.items;

import library.models.Author;
import java.util.List;

public abstract class LibraryItem {
    private String id;
    private String title;
    private List<Author> authors;
    private String isbn;
    private String publisher;
    private int numCopies;

    public LibraryItem(String id, String title, List<Author> authors, String isbn, String publisher, int numCopies) {
        this.id = id;
        this.title = title;
        this.authors = authors;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numCopies = numCopies;
    }

    public abstract void displayInfo();

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }
}





