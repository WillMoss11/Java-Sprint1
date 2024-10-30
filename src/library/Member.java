package library;

public abstract class Member {
    private String name;
    private String address;
    private String phoneNumber;

    public Member(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Abstract method for specific member types
    public abstract String getMemberId(); // To be implemented by subclasses
}
