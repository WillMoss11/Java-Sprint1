package library;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);

        // Sample data
        Author author = new Author("John Doe", "01/01/1970");
        library.addAuthor(author);
        
        LibraryItem book1 = new Book("1", "Java Programming", "John Doe", "123456789", "Tech Publisher", 5, false, true);
        library.addItem(book1);

        LibraryItem periodical1 = new Periodical("2", "Tech Monthly", "Jane Smith", "987654321", "Tech Publisher", 3, true);
        library.addItem(periodical1);

        System.out.println("Welcome to the Library Management System");
        boolean running = true;
        Patron patron = null;

        while (running) {
            System.out.println("\nMenu:");
            System.out.println("1. Borrow Item");
            System.out.println("2. Return Item");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item title to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String patronName = scanner.nextLine();
                    patron = new Student(patronName, "Some Address", "123456", "S123");
                    if (library.borrowItem(borrowTitle, patron)) {
                        System.out.println("You have borrowed: " + borrowTitle);
                    } else {
                        System.out.println("Item not available.");
                    }
                    break;
                case 2:
                    if (patron == null) {
                        System.out.println("You must borrow an item first.");
                    } else {
                        System.out.print("Enter item title to return: ");
                        String returnTitle = scanner.nextLine();
                        library.returnItem(returnTitle, patron);
                        System.out.println("You have returned: " + returnTitle);
                    }
                    break;
                case 3:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("Thank you for using the Library Management System!");
        scanner.close();
    }
}

