package library;

public class Student extends Patron {
    private String studentId;

    public Student(String name, String address, String phoneNumber, String studentId) {
        super(name, address, phoneNumber);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }
}
