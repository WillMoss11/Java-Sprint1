package library.members;

import library.items.LibraryItem;

public class Employee extends Member {

    public Employee(String name, String address, String phone, String memberId) {
        super(name, address, phone, memberId);
    }

    @Override
    public void borrowItem(LibraryItem item, int quantity) {
        // Employees may have different borrowing rules (e.g., unlimited)
        super.borrowItem(item, quantity); // Call the parent method
    }

    @Override
    public void returnItem(LibraryItem item, int quantity) {
        super.returnItem(item, quantity); // Call the parent method
    }

}




