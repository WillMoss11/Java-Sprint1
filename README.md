## **1. User Documentation**

### **1.1 Introduction**

The **Library Management System** is crafted to oversee library items (including books and periodicals), manage authors, and facilitate patron interactions. It empowers librarians to carry out various operations such as adding, editing, and removing items, authors, and patrons, while also allowing patrons to borrow and return items.

### **1.2 Application Overview**

This application simulates a library system with the following essential features:

- **Item Management**: Administer various types of library items, including books and periodicals, available in printed, electronic, or audio formats.
- **Member Management**: Oversee member information and facilitate the borrowing and returning of items.
- **Author Management**: Maintain author information and link it to corresponding library items.
- **Borrowing and Returning**: Enable members to borrow and return items, managing specific quantities.
- **Search Functionality**: Search for items based on title, author, or ISBN.

### **1.3 Class Descriptions**

The following provides an overview of the main classes and their functionalities:

#### **1.3.1 LibraryItem (Abstract Class)**

- **Purpose**: Represents a general library item.
- **Attributes**:
  - `id`: Unique identifier for the item.
  - `title`: Title of the item.
  - `authors`: List of associated authors.
  - `isbn`: International Standard Book Number.
  - `publisher`: Publisher of the item.
- **Methods**:
  - `getId()`, `getTitle()`, `getAuthors()`, `getIsbn()`, `getPublisher()`: Getters for attributes.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Abstract method for updating item details.

#### **1.3.2 BookMaster (Abstract Class) extends LibraryItem**

- **Purpose**: Serves as a foundational class for all book formats.
- **Subclasses**:
  - `BookPrinted`
  - `BookElectronic`
  - `BookAudio`

#### **1.3.3 BookPrinted (Class) extends BookMaster**

- **Purpose**: Represents a printed book.
- **Attributes**:
  - `numberOfCopies`: Count of physical copies available.
  - `numberOfPages`: Total pages in the book.
- **Methods**:
  - `getNumberOfCopies()`, `setNumberOfCopies(int)`: Manage copy count.
  - `getNumberOfPages()`: Retrieve the number of pages.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Updates the book's details.

#### **1.3.4 BookElectronic (Class) extends BookMaster**

- **Purpose**: Represents an electronic book.
- **Attributes**:
  - `fileSize`: Size of the electronic file.
  - `fileFormat`: Format of the electronic file (e.g., PDF, EPUB).
  - `numberOfPages`: Total pages in the book.
- **Methods**:
  - `getFileSize()`, `getFileFormat()`, `getNumberOfPages()`: Getters for attributes.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Updates the book's details.

#### **1.3.5 BookAudio (Class) extends BookMaster**

- **Purpose**: Represents an audio book.
- **Attributes**:
  - `runtime`: Duration of the audio book.
  - `narrator`: Name of the narrator.
- **Methods**:
  - `getRuntime()`, `getNarrator()`: Getters for attributes.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Updates the book's details.

#### **1.3.6 PeriodicalMaster (Abstract Class) extends LibraryItem**

- **Purpose**: Serves as a foundational class for all periodical formats.
- **Subclasses**:
  - `PeriodicalPrinted`
  - `PeriodicalElectronic`

#### **1.3.7 PeriodicalPrinted (Class) extends PeriodicalMaster**

- **Purpose**: Represents a printed periodical.
- **Attributes**:
  - `numberOfCopies`: Count of physical copies available.
  - `numberOfPages`: Total pages in the periodical.
- **Methods**:
  - `getNumberOfCopies()`, `setNumberOfCopies(int)`: Manage copy count.
  - `getNumberOfPages()`: Retrieve the number of pages.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Updates the periodical's details.

#### **1.3.8 PeriodicalElectronic (Class) extends PeriodicalMaster**

- **Purpose**: Represents an electronic periodical.
- **Attributes**:
  - `fileSize`: Size of the electronic file.
  - `fileFormat`: Format of the electronic file.
  - `numberOfPages`: Total pages in the periodical.
- **Methods**:
  - `getFileSize()`, `getFileFormat()`, `getNumberOfPages()`: Getters for attributes.
  - `updateDetailsFrom(LibraryItem updatedItem)`: Updates the periodical's details.

#### **1.3.9 Author (Class)**

- **Purpose**: Represents an author within the library system.
- **Attributes**:
  - `name`: Name of the author.
  - `dateOfBirth`: Author's date of birth.
  - `writtenItems`: List of items authored by the individual.
- **Methods**:
  - `getName()`, `getDateOfBirth()`, `getWrittenItems()`: Getters for attributes.
  - `updateDetails(String name, String dateOfBirth)`: Updates the author's information.

#### **1.3.10 Member (Abstract Class)**

- **Purpose**: Represents a library member.
- **Attributes**:
  - `name`: Name of the member.
  - `address`: Address of the member.
  - `phoneNumber`: Phone number of the member.
  - `borrowedItems`: Map of borrowed items and their quantities.
- **Methods**:
  - `getName()`, `getAddress()`, `getPhoneNumber()`: Getters for attributes.
  - `getBorrowedItems()`: Retrieves borrowed items.
  - `updateDetails(String name, String address, String phoneNumber)`: Updates member details.
  - `borrowItem(LibraryItem item, int quantity)`: Adds items to the borrowed list.
  - `returnItem(LibraryItem item, int quantity)`: Removes items from the borrowed list.

#### **1.3.11 Student (Class) extends Member**

- **Purpose**: Represents a student member.
- **Attributes and Methods**: Inherits from `Member`.

#### **1.3.12 Library (Class)**

- **Purpose**: Manages library items, authors, and members.
- **Attributes**:
  - `items`: List of library items.
  - `authors`: List of authors.
  - `members`: List of members.
- **Methods**:
  - `addItem(LibraryItem item)`, `addAuthor(Author author)`, `addMember(Member member)`: Methods for adding entities.
  - `editItem(String itemId, LibraryItem updatedItem)`: Edits item details.
  - `editAuthor(Author existingAuthor, Author updatedAuthor)`: Edits author details.
  - `editMember(Member existingMember, Member updatedMember)`: Edits member details.
  - `borrowItem(Member member, LibraryItem item, int quantity)`: Facilitates borrowing items.
  - `returnItem(Member member, LibraryItem item, int quantity)`: Facilitates returning items.
  - `searchItemsByTitle(String title)`, `searchItemsByAuthor(String authorName)`, `searchItemByISBN(String isbn)`: Search functionalities.

#### **1.3.13 Demo (Class)**

- **Purpose**: Demonstrates the library management system's functionalities.
- **Methods**:
  - `main(String[] args)`: Entry point of the application. Showcases adding, editing, borrowing, returning, and searching for items.

### **1.4 How to Start/Access the Application**

To run the application:

1. **Ensure Java is Installed**: The application requires the Java Development Kit (JDK) version 8 or higher.

2. **Compile the Application**:

   - Navigate to the project directory.
   - Compile files along with other classes:
     ```bash
     javac -d bin src/library/*.java src/library/items/*.java src/library/members/*.java src/library/models/*.java src/library/*.java

     ```
     - This compiles all necessary classes and places the `.class` files in the `bin` directory.

3. **Run the Application**:
   - Execute the `Demo` class:
     ```bash
     java -cp bin library.Demo
     ```
   - The application will run and display library management functionalities through console outputs.


### **1.5 Class Diagram**

Below is a simplified class diagram representing the associations between the main classes:

```                +-------------------+
                |   LibraryItem     |
                +-------------------+
                | - id              |
                | - title           |
                | - authors         |
                | - isbn            |
                | - publisher       |
                +-------------------+
                        ^
                        |
                +----------------+
                |   BookMaster   |
                +----------------+
                | - numberOfCopies|
                +----------------+
                        ^
          +-------------+-------------+
          |             |             |
+----------------+ +----------------+ +----------------+
|   BookPrinted  | | BookElectronic | |   BookAudio    |
+----------------+ +----------------+ +----------------+
| - numberOfPages| | - fileSize     | | - runtime      |
+----------------+ +----------------+ +----------------+

                +--------------------+
                |  PeriodicalMaster   |
                +--------------------+
                | - numberOfCopies   |
                +--------------------+
                        ^
          +-------------+-------------+
          |                           |
+----------------------+ +----------------------+
|  PeriodicalPrinted   | | PeriodicalElectronic  |
+----------------------+ +----------------------+
| - numberOfPages      | | - fileSize           |
+----------------------+ +----------------------+

                +-------------------+
                |      Author       |
                +-------------------+
                | - name            |
                | - dateOfBirth     |
                +-------------------+

                +-------------------+
                |      Patron       |
                +-------------------+
                | - name            |
                | - address         |
                | - phoneNumber     |
                +-------------------+
                        ^
                        |
                +----------------+     +----------------+
                |    Student     |     |    Employee    |
                +----------------+     +----------------+

                +-------------------+
                |      Library      |
                +-------------------+
                | - items           |
                | - authors         |
                | - patrons         |
                +-------------------+



```

**Associations**:

• `LibraryItem`: The base class for all library items.

• `BookMaster` & `PeriodicalMaster`: Abstract classes extending `LibraryItem`.

• `BookPrinted`, `BookElectronic`, & `BookAudio`: Extend `BookMaster`.

• `PeriodicalPrinted` & `PeriodicalElectronic`: Extend `PeriodicalMaster`.

• `Author`: Associated with `LibraryItem` (items have authors).

• `Patron`: Interacts with `Library` (borrowing & returning items).

• `Library`: Manages `LibraryItem`, `Author`, & `Patron`.

---

## **2. Development Documentation**

### **2.1 Javadocs**

The Javadocs provide detailed documentation of the classes, methods, and attributes used in the application. They include descriptions, parameter explanations, and return values.

**Generating Javadocs**:

- Use the following command to generate the Javadocs:
  ```bash
  javadoc -d docs -sourcepath src -subpackages library
  ```
- The documentation will be generated in the `docs` directory.

### **2.2 Source Code Directory Structure**

```
Java-Sprint1/
├── src/
│   ├── library/
│   │   ├── Demo.java
│   │   ├── Library.java
│   │   ├── LibraryItem.java
│   │   ├── Book.java
│   │   ├── Periodical.java
│   │   ├── BookMaster.java
│   │   ├── PeriodicalMaster.java
│   │   ├── BookPrinted.java
│   │   ├── BookElectronic.java
│   │   ├── BookAudio.java
│   │   ├── PeriodicalPrinted.java
│   │   └── PeriodicalElectronic.java
│   │   ├── Author.java
│   │   ├── Member.java
│   │   ├── Student.java
│   │   └── Employee.java
├── bin/
├── docs/
└── README.md

```

- **`src`**: Contains all the source code files.
- **`library`**: Main packages for the application.
- **`bin`**: Directory where compiled class files are placed.
- **`docs`**: Directory for generated Javadocs.

### **2.3 Build Process**

To build and compile the project:

1. **Compile All Classes**:

   ```bash
   javac -d bin src/library/*.java src/library/items/*.java src/library/members/*.java src/library/models/*.java src/library/*.java
   ```

   - This compiles all Java files placing the `.class` files in the `bin` directory.

2. **Generate Documentation** (Optional):
   ```bash
   javadoc -d docs -sourcepath src -subpackages library
   ```

### **2.4 Compiler Time Dependencies**

- **Java Development Kit (JDK)**: Version 8 or higher.
- No external libraries are required for this project.

### **2.5 Development Standards**

- **Coding Conventions**:

  - Follow Java naming conventions:
    - Classes and interfaces: PascalCase.
    - Methods and variables: camelCase.
    - Constants: UPPER_CASE_WITH_UNDERSCORES.
  - Proper indentation and code formatting.
  - Use of Javadoc comments for classes and methods.

- **Error Handling**:

  - Basic input validation within methods.
  - Use of exception handling where appropriate (e.g., catching `NullPointerException`).

- **Version Control**:
  - Git is used for version control.
  - Commit messages should be descriptive.

### **2.6 Database Design (Theoretical)**

While my project doesn't use a database, here is how it would look:

#### **Entity Relationships**

- **Authors** (`Author` table):

  - `author_id` (Primary Key)
  - `name`
  - `date_of_birth`

- **Library Items** (`LibraryItem` table):

  - `item_id` (Primary Key)
  - `title`
  - `isbn`
  - `publisher`
  - `type` (e.g., BookPrinted, BookElectronic, etc.)

- **Books and Periodicals** (Specific tables for attributes):

  - For physical items:
    - `number_of_copies`
    - `number_of_pages`
  - For electronic items:
    - `file_size`
    - `file_format`
    - `number_of_pages`
  - For audio items:
    - `runtime`
    - `narrator`

- **Patrons** (`Patron` table):

  - `patron_id` (Primary Key)
  - `name`
  - `address`
  - `phone_number`

- **Borrowed Items** (`BorrowedItems` table):

  - `borrow_id` (Primary Key)
  - `patron_id` (Foreign Key)
  - `item_id` (Foreign Key)
  - `quantity`
  - `borrow_date`
  - `return_date`

- **Associations**:
  - An author can write multiple items (One-to-Many).
  - An item can have multiple authors (Many-to-Many).
  - A member can borrow multiple items (One-to-Many).

#### **Entity Relationship Diagram**

```
[Author] 1----* [ItemAuthors] *----1 [LibraryItem]
     |
     *----1 [LibraryItem]

[Member] 1----* [BorrowedItems] *----1 [LibraryItem]
```

### **2.7 Getting the Source Code from GitHub Repository**

Assuming the source code is hosted on GitHub, you can obtain it by:

1. **Cloning the Repository**:
   ```bash
   git clone https://github.com/WillMoss11/Java-Sprint1.git
   ```
2. **Navigating to the Project Directory**:
   ```bash
   cd Java-Sprint1
   ```
3. **Verifying the Contents**:
   - Ensure the `src` directory and other files are present.

---

## **3. Deployment Documentation**

### **3.1 Installation Manual**

Follow these steps to install and run the Library Management System application.

#### **Prerequisites**

- **Java Development Kit (JDK)**: Version 8 or higher must be installed on your system.
  - You can download the JDK from [Oracle's official website](https://www.oracle.com/java/technologies/javase-downloads.html).
- **Git** (Optional): Required if cloning the repository from GitHub.

#### **Steps to Install and Run the Application**

1. **Obtain the Source Code**:

   - **Option 1**: Clone the repository using Git:
     ```bash
     git clone https://github.com/WillMoss11/Java-Sprint1.git
     ```
   - **Option 2**: Download the ZIP file from the GitHub repository and extract it.

2. **Navigate to the Project Directory**:

   ```bash
   cd Java-Sprint1
   ```

3. **Compile the Source Code**:

   - Create a `bin` directory if it doesn't exist:
     ```bash
     mkdir bin
     ```
   - Compile the application:
     ```bash
     javac -d bin src/library/*.java src/library/items/*.java src/library/members/*.java src/library/models/*.java src/library/*.java
     ```
     - This command compiles all Java files and places the compiled `.class` files into the `bin` directory.

4. **Run the Application**:
   ```bash
   java -cp bin library.LibraryMenu
   ```
   - The application will execute, and you will see the output in the console.

#### **Troubleshooting**

- **Java Not Recognized**:
  - Ensure that the JDK's `bin` directory is added to your system's `PATH` environment variable.
- **Compilation Errors**:
  - Verify that you are in the correct directory and that all source files are present in the `src` folder.
  - Ensure that there are no typos in the package declarations or import statements.

#### **Uninstallation**

- Simply delete the project directory to remove all files related to the application.
