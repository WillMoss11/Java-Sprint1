package library;

import library.items.*;
import library.models.Author;
import library.members.Student;
import library.members.Member;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


public class Demo {
    public static void main(String[] args) {
        // Create a library instance
        Library library = new Library();

        // Load data into the library
        loadData(library);

        // Retrieve the items and members for testing
        List<LibraryItem> items = library.getItems();
        List<Member> members = library.getMembers(); // Change to Member

        // For testing, we'll use specific items and members
        BookPrinted printedBook = (BookPrinted) items.get(0); // Nineteen Eighty-Four
        BookElectronic electronicBook = (BookElectronic) items.get(1); // The Secret Adversary
        BookAudio audioBook = (BookAudio) items.get(2); // Foundation's Edge (Audio)
        PeriodicalPrinted printedPeriodical = (PeriodicalPrinted) items.get(3); // Cemetery Dance
        PeriodicalElectronic electronicPeriodical = (PeriodicalElectronic) items.get(4); // The Rowling Library
        Student student1 = (Student) members.get(0); // John Appleseed
        Student student2 = (Student) members.get(1); // Jim Blake
        Student student3 = (Student) members.get(2); // Liam Smith
        Student student4 = (Student) members.get(3); // Sophia Johnson
        Student student5 = (Student) members.get(4); // Chloe Combden

        // Show starting book amount for printed items
        System.out.println("Total number of copies (Nineteen Eighty-Four): " + printedBook.getNumCopies());
        System.out.println("Total number of copies (Cemetery Dance): " + printedPeriodical.getNumCopies());
        System.out.println("Total number of copies (The Secret Adversary): " + electronicBook.getNumCopies());
        System.out.println("Total number of copies (Foundation's Edge): " + audioBook.getNumCopies());
        System.out.println("Total number of copies (The Rowling Library): " + electronicPeriodical.getNumCopies());

        // === Borrow/Return Test ===
        System.out.println("\n--- Borrow/Return Test ---");
        // Borrow 5 copies of "Nineteen Eighty-Four"
        library.borrowItem(student1, printedBook, 5);

        // Borrow an electronic book (unlimited copies)
        library.borrowItem(student1, electronicBook, 1);

        // Borrow an audio book (unlimited copies)
        library.borrowItem(student2, audioBook, 1);

        // Borrow 2 copies of a printed periodical
        library.borrowItem(student2, printedPeriodical, 2);

        // Borrow an electronic periodical (unlimited copies)
        library.borrowItem(student3, electronicPeriodical, 1);

        // Borrow an audio book (unlimited copies)
        library.borrowItem(student3, audioBook, 4);

        // Borrow 1 copy of a printed periodical
        library.borrowItem(student4, printedPeriodical, 2);

        // Borrow an electronic book (unlimited copies)
        library.borrowItem(student5, electronicBook, 4);

        // Display borrowed items
        System.out.println("\nBorrowed items by " + student1.getName() + ":");
        for (Map.Entry<LibraryItem, Integer> entry : student1.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        System.out.println("\nBorrowed items by " + student2.getName() + ":");
        for (Map.Entry<LibraryItem, Integer> entry : student2.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        System.out.println("\nBorrowed items by " + student3.getName() + ":");
        for (Map.Entry<LibraryItem, Integer> entry : student3.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        System.out.println("\nBorrowed items by " + student4.getName() + ":");
        for (Map.Entry<LibraryItem, Integer> entry : student4.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        System.out.println("\nBorrowed items by " + student5.getName() + ":");
        for (Map.Entry<LibraryItem, Integer> entry : student5.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        // Attempt to borrow more copies than available
        System.out.println("\nAttempting to borrow 8 more copies of 'Nineteen Eighty-Four':");
        library.borrowItem(student1, printedBook, 15);

        // Return 2 copies of "Nineteen Eighty-Four"
        System.out.println("\nReturning 2 copies of 'Nineteen Eighty-Four':");
        library.returnItem(student1, printedBook, 2);

        // Display borrowed items after returning
        System.out.println("\nBorrowed items by " + student1.getName() + " after returning:");
        for (Map.Entry<LibraryItem, Integer> entry : student1.getBorrowedItems().entrySet()) {
            LibraryItem item = entry.getKey();
            int quantity = entry.getValue();
            System.out.println("- " + item.getTitle() + ": " + quantity + " copies");
        }

        // Check number of copies after borrowing
        System.out.println("\nNumber of copies after borrowing (Nineteen Eighty-Four): " + printedBook.getNumCopies());
        System.out.println("Number of copies after borrowing (Cemetery Dance): " + printedPeriodical.getNumCopies());
        System.out.println("Number of copies after borrowing (Cemetery Dance): " + electronicBook.getNumCopies());
        System.out.println("Number of copies after borrowing (Cemetery Dance): " + audioBook.getNumCopies());
        System.out.println("Number of copies after borrowing (Cemetery Dance): " + electronicPeriodical.getNumCopies());


        // Return the remaining copy
        library.returnItem(student1, printedBook, 1);

        // Check number of copies after returning
        System.out.println("Number of copies after returning (Nineteen Eighty-Four): " + printedBook.getNumCopies());

        // Housekeeping
        System.out.println("\n-- Library Management System Demo Ended ---");
        System.out.println("Thank you for using the Library Management System!");
    }

    // Method to load data into the library
    private static void loadData(Library library) {
        // Create authors
        Author author1 = new Author("George Orwell", "1903-06-25");
        Author author2 = new Author("Agatha Christie", "1890-09-15");
        Author author3 = new Author("Isaac Asimov", "1920-01-02");
        Author author4 = new Author("Stephen King", "1947-09-21");
        Author author5 = new Author("J.K. Rowling", "1965-07-31");
        
        library.addAuthor(author1);
        library.addAuthor(author2);
        library.addAuthor(author3);
        library.addAuthor(author4);
        library.addAuthor(author5);

        // Create books and periodicals
        List<Author> authors1 = new ArrayList<>();
        authors1.add(author1);

        List<Author> authors2 = new ArrayList<>();
        authors2.add(author2);

        List<Author> authors3 = new ArrayList<>();
        authors3.add(author3);

        List<Author> authors4 = new ArrayList<>();
        authors4.add(author4);

        List<Author> authors5 = new ArrayList<>();
        authors5.add(author5);

        // BookPrinted
        BookPrinted bookPrinted = new BookPrinted("1", "Nineteen Eighty-Four", authors1, "9780155658110", "Secker & Warburg", 6);

        // BookElectronic
        BookElectronic bookElectronic = new BookElectronic("2", "The Secret Adversary", authors2, "9781405046398", "Dodd, Mead and Company", 4.5, "PDF");

        // BookAudio
        BookAudio bookAudio = new BookAudio("3", "Foundation's Edge", authors3, "9780736608664", "Whispers Press", 8, "Scott Brick");

        // PrintedPeriodical
        PeriodicalPrinted printedPeriodical = new PeriodicalPrinted("4", "Cemetery Dance", authors4, "9780446618694", "Cemetery Dance Publications", 16);

        // ElectronicPeriodical
        PeriodicalElectronic electronicPeriodical = new PeriodicalElectronic("5", "The Rowling Library", authors5, "N/A", "The Rowling Library", 2.0);

        // Adding items to the library
        library.addItem(bookPrinted);
        library.addItem(bookElectronic);
        library.addItem(bookAudio);
        library.addItem(printedPeriodical);
        library.addItem(electronicPeriodical);

        // Create students (members)
        Student student1 = new Student("John Appleseed", "118 Apple Drive", "709-444-9443", "S001");
        Student student2 = new Student("Jim Blake", "55 Main St", "709-256-1234", "S002");
        Student student3 = new Student("Liam Smith", "456 Elm St", "709-555-1212", "S003");
        Student student4 = new Student("Sophia Johnson", "789 Maple Ave", "709-555-3434", "S004");
        Student student5 = new Student("Chloe Combden", "565 John Drive", "709-123-7843", "S005");

        // Adding students to the library
        library.addMember(student1);
        library.addMember(student2);
        library.addMember(student3);
        library.addMember(student4);
        library.addMember(student5);
    }
}
