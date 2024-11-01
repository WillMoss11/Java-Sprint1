package library.items;

import library.models.Author;
import java.util.List;

public abstract class PeriodicalMaster extends LibraryItem {
    public PeriodicalMaster(String id, String title, List<Author> authors, String isbn, String publisher, int numCopies) {
        super(id, title, authors, isbn, publisher, numCopies);
    }
}
