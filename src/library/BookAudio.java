package library;

public class BookAudio extends Book {
    private String runtime;
    private String narrator;

    public BookAudio(String id, String title, String author, String isbn, String publisher, int numCopies, String runtime, String narrator) {
        super(id, title, author, isbn, publisher, numCopies, true, false); // Is audio, not electronic
        this.runtime = runtime;
        this.narrator = narrator;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Runtime: " + runtime);
        System.out.println("Narrator: " + narrator);
    }
}
