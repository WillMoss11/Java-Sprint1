package library;

public class Employee extends Patron {
    private String employeeID;

    public Employee(String name, String address, String phoneNumber, String employeeID) {
        super(name, address, phoneNumber);
        this.employeeID = employeeID;
    }

    // Getters and Setters
    public String getEmployeeID() { return employeeID; }
}
