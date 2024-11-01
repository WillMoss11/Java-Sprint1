package library.items;

import library.models.Author;
import java.util.List;

public class BookAudio extends BookMaster {
    private String narrator;

    public BookAudio(String id, String title, List<Author> authors, String isbn, String publisher, int numCopies, String narrator) {
        super(id, title, authors, isbn, publisher, Integer.MAX_VALUE);
        this.narrator = narrator;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book Audio:");
        System.out.println("Title: " + getTitle());
        System.out.println("Authors: " + getAuthors());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("Copies Available: " + getNumCopies());
        System.out.println("Narrator: " + narrator);
    }
}

