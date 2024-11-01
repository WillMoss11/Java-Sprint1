package library;

import library.items.LibraryItem;
import library.members.Member;
import library.models.Author;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;
    private List<Member> members;
    private List<Author> authors;

    public Library() {
        items = new ArrayList<>();
        members = new ArrayList<>();
        authors = new ArrayList<>();
    }

    // Add a library item
    public void addItem(LibraryItem item) {
        items.add(item);
    }

    // Add a member
    public void addMember(Member member) {
        members.add(member);
    }

    // Add an author
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Get all library items
    public List<LibraryItem> getItems() {
        return items;
    }

    // Get all members
    public List<Member> getMembers() {
        return members;
    }

    // Get all authors
    public List<Author> getAuthors() {
        return authors;
    }

    // Borrow an item
    public void borrowItem(Member member, LibraryItem item, int quantity) {
        // Check if the item is available
        if (item.getNumCopies() >= quantity) {
            member.borrowItem(item, quantity);
            item.setNumCopies(item.getNumCopies() - quantity);
            System.out.println(member.getName() + " borrowed " + quantity + " copies of " + item.getTitle());
        } else {
            System.out.println("Not enough copies available for " + item.getTitle());
        }
    }

    // Return an item
    public void returnItem(Member member, LibraryItem item, int quantity) {
        member.returnItem(item, quantity);
        item.setNumCopies(item.getNumCopies() + quantity);
        System.out.println(member.getName() + " returned " + quantity + " copies of " + item.getTitle());
    }
}






