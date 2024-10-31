package library;

import java.util.Scanner;

public class LibraryMenu {
    public static void main(String[] args) {
        Library library = new Library();
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
                    addLibraryItem(scanner, library);
                    break;
                case 2:
                    editLibraryItem(scanner, library);
                    break;
                case 3:
                    deleteLibraryItem(scanner, library);
                    break;
                case 4:
                    borrowLibraryItem(scanner, library);
                    break;
                case 5:
                    returnLibraryItem(scanner, library);
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

    private static void addLibraryItem(Scanner scanner, Library library) {
        System.out.println("Adding a new library item...");
        System.out.print("Enter Title: ");
        String title = scanner.nextLine();
        System.out.print("Enter Author: ");
        String author = scanner.nextLine();
        System.out.print("Enter ISBN: ");
        String ISBN = scanner.nextLine();
        System.out.print("Enter Publisher: ");
        String publisher = scanner.nextLine();
        System.out.print("Enter Total Copies: ");
        int totalCopies = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        LibraryItem libraryItem = new Book("id", title, author, ISBN, publisher, totalCopies, false, true);
        library.addItem(libraryItem);
        System.out.println("Library item added successfully!");
    }

    private static void editLibraryItem(Scanner scanner, Library library) {
        System.out.println("Editing an existing library item...");
        // Logic to edit a library item
    }

    private static void deleteLibraryItem(Scanner scanner, Library library) {
        System.out.println("Deleting a library item...");
        System.out.print("Enter the title of the item to delete: ");
        String title = scanner.nextLine();
        boolean deleted = library.deleteItemByTitle(title);
        if (deleted) {
            System.out.println("Library item deleted successfully.");
        } else {
            System.out.println("Item not found.");
        }
    }

    private static void borrowLibraryItem(Scanner scanner, Library library) {
        System.out.println("Borrowing a library item...");
        System.out.print("Enter item title to borrow: ");
        String borrowTitle = scanner.nextLine();
        System.out.print("Enter your name: ");
        String patronName = scanner.nextLine();
        System.out.print("Enter your Student ID: ");
        String studentId = scanner.nextLine();

        Patron patron = new Student(patronName, "Some Address", "123456", studentId);
        if (library.borrowItem(borrowTitle, patron)) {
            System.out.println("You have borrowed: " + borrowTitle);
        } else {
            System.out.println("Item not available.");
        }
    }

    private static void returnLibraryItem(Scanner scanner, Library library) {
        System.out.println("Returning a library item...");
        System.out.print("Enter the title of the item to return: ");
        String title = scanner.nextLine();
        // Implement return logic here
        System.out.println("You have returned: " + title); // Example output
    }
}






