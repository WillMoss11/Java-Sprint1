package library;

public abstract class LibraryItem {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int numCopies;

    public LibraryItem(String id, String title, String author, String isbn, String publisher, int numCopies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numCopies = numCopies;
    }

    public abstract void displayInfo();

    // Getters and setters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
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


