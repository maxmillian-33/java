package employees;

// Abstract class Employee
public abstract class Employee {
    protected String name;
    protected int age;
    protected String designation;

    // Constructor
    public Employee(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    // Abstract methods
    public abstract double calculateSalary();
    public abstract void displayDetails();
}
