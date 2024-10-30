package library;

import java.util.Scanner;

public class LibraryMenu {
    private static Library library = new Library(); // Create a Library instance

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
        System.out.print("Enter the type of Library item (Book/Periodical): ");
        String itemType = scanner.nextLine();

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

        LibraryItem libraryItem = null;

        if (itemType.equalsIgnoreCase("Book")) {
            System.out.print("Enter type of Book (Printed/Electronic/Audio): ");
            String bookType = scanner.nextLine();
            if (bookType.equalsIgnoreCase("Printed")) {
                System.out.print("Enter Number of Pages: ");
                int numPages = scanner.nextInt();
                libraryItem = new BookPrinted(ISBN, title, author, ISBN, publisher, totalCopies, numPages);
            } else if (bookType.equalsIgnoreCase("Electronic")) {
                System.out.print("Enter File Size: ");
                String fileSize = scanner.nextLine();
                System.out.print("Enter File Format: ");
                String fileFormat = scanner.nextLine();
                libraryItem = new BookElectronic(ISBN, title, author, ISBN, publisher, totalCopies, fileSize, fileFormat);
            } else if (bookType.equalsIgnoreCase("Audio")) {
                System.out.print("Enter Runtime: ");
                String runtime = scanner.nextLine();
                System.out.print("Enter Narrator: ");
                String narrator = scanner.nextLine();
                libraryItem = new BookAudio(ISBN, title, author, ISBN, publisher, totalCopies, runtime, narrator);
            }
        } else if (itemType.equalsIgnoreCase("Periodical")) {
            System.out.print("Is it Electronic? (yes/no): ");
            boolean isElectronic = scanner.nextLine().equalsIgnoreCase("yes");
            libraryItem = new Periodical(ISBN, title, author, ISBN, publisher, totalCopies, isElectronic);
        }

        if (libraryItem != null) {
            library.addItem(libraryItem);
            System.out.println("Library item added successfully.");
        } else {
            System.out.println("Invalid item type.");
        }
    }

    private static void editLibraryItem(Scanner scanner) {
        System.out.println("Editing an existing library item...");
        // Implement editing logic here
    }

    private static void deleteLibraryItem(Scanner scanner) {
        System.out.println("Deleting a library item...");
        System.out.print("Enter the title of the item to delete: ");
        String title = scanner.nextLine();
        
        LibraryItem itemToRemove = null;
        for (LibraryItem item : library.getItems()) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                itemToRemove = item;
                break;
            }
        }
    
        if (itemToRemove != null) {
            library.getItems().remove(itemToRemove);
            System.out.println("Successfully deleted: " + title);
        } else {
            System.out.println("Item not found: " + title);
        }
    }
    
    private static void borrowLibraryItem(Scanner scanner) {
        System.out.println("Borrowing a library item...");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the title of the item to borrow: ");
        String title = scanner.nextLine();

        // Logic to borrow the item
        Patron patron = new Student(name, "", "", ""); // Create a student as an example
        boolean borrowed = library.borrowItem(title, patron);
        if (borrowed) {
            System.out.println("You have successfully borrowed the item: " + title);
        } else {
            System.out.println("Item not available for borrowing.");
        }
    }

    private static void returnLibraryItem(Scanner scanner) {
        System.out.println("Returning a library item...");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the title of the item to return: ");
        String title = scanner.nextLine();

        // Logic to return the item
        Patron patron = new Student(name, "", "", ""); // Create a student as an example
        library.returnItem(title, patron);
        System.out.println("You have successfully returned the item: " + title);
    }
}

