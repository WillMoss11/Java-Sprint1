package library;

public class Student extends Patron {
    private String studentID;

    public Student(String name, String address, String phoneNumber, String studentID) {
        super(name, address, phoneNumber);
        this.studentID = studentID;
    }

    // Getters and Setters
    public String getStudentID() { return studentID; }
}
