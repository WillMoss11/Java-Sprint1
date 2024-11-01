package library.members;

import library.items.LibraryItem;
import java.util.HashMap;
import java.util.Map;

public abstract class Member {
    public String name;
    public String address;
    public String phone;
    public String memberId;
    public Map<LibraryItem, Integer> borrowedItems;

    public Member(String name, String address, String phone, String memberId) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.memberId = memberId;
        this.borrowedItems = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getMemberId() {
        return memberId;
    }

    public Map<LibraryItem, Integer> getBorrowedItems() {
        return borrowedItems;
    }

    public void borrowItem(LibraryItem item, int quantity) {
        if (borrowedItems.containsKey(item)) {
            borrowedItems.put(item, borrowedItems.get(item) + quantity);
        } else {
            borrowedItems.put(item, quantity);
        }
    }

    public void returnItem(LibraryItem item, int quantity) {
        if (borrowedItems.containsKey(item)) {
            int currentQuantity = borrowedItems.get(item);
            if (currentQuantity > quantity) {
                borrowedItems.put(item, currentQuantity - quantity);
            } else {
                borrowedItems.remove(item); // Remove if all copies are returned
            }
        }
    }
}


