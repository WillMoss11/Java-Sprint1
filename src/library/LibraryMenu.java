package library;

import java.util.Scanner;

public class LibraryMenu {
    private static Library library = new Library();
    private static Patron patron;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Borrow Library Item");
            System.out.println("5. Return Library Item");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addLibraryItem(scanner);
                    break;
                case 2:
                    editLibraryItem(scanner);
                    break;
                case 3:
                    deleteLibraryItem(scanner);
                    break;
                case 4:
                    borrowLibraryItem(scanner);
                    break;
                case 5:
                    returnLibraryItem(scanner);
                    break;
                case 6:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }

    private static void addLibraryItem(Scanner scanner) {
        System.out.println("Adding a new library item...");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter Number of Copies: ");
        int numCopies = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        // Create the LibraryItem (You may need to specify the type)
        LibraryItem item = new BookPrinted("3", title, "Author Name", ISBN, publisher, numCopies, 100); // Example
        library.addItem(item);

        System.out.println("Library item added successfully.");
    }

    private static void editLibraryItem(Scanner scanner) {
        System.out.println("Editing an existing library item...");
        // Implement editing logic here
    }

    private static void deleteLibraryItem(Scanner scanner) {
        System.out.println("Deleting a library item...");
        System.out.print("Enter the title of the item to delete: ");
        String title = scanner.nextLine();

        boolean deleted = library.deleteItemByTitle(title);
        if (deleted) {
            System.out.println("Library item deleted successfully.");
        } else {
            System.out.println("No item found with the title: " + title);
        }
    }

    private static void borrowLibraryItem(Scanner scanner) {
        System.out.println("Borrowing a library item...");
        System.out.print("Enter item title to borrow: ");
        String title = scanner.nextLine();
        System.out.print("Enter your name: ");
        String patronName = scanner.nextLine();
        patron = new Student(patronName, "Some Address", "123456", "S123");
        
        if (library.borrowItem(title, patron)) {
            System.out.println("You have borrowed: " + title);
        } else {
            System.out.println("Item not available.");
        }
    }

    private static void returnLibraryItem(Scanner scanner) {
        System.out.println("Returning a library item...");
        System.out.print("Enter the title of the item to return: ");
        String title = scanner.nextLine();

        library.returnItem(title, patron);
        System.out.println("You have returned: " + title);
    }
}


