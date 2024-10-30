package library;

public class Employee extends Member {
    private String employeeId;

    public Employee(String name, String address, String phoneNumber, String employeeId) {
        super(name, address, phoneNumber);
        this.employeeId = employeeId;
    }

    @Override
    public String getMemberId() {
        return employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }
}
