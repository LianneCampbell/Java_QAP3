package Problem_1;

public class Teacher extends Person {
    private String subject; // Subject the teacher teaches
    private double salary; // Teacher's annual salary

    // Constructor
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // Getter and Setter methods
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", subject: " + subject + ", salary: $" + salary;
    }
}