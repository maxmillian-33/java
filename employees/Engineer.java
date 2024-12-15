package employees;

public class Engineer extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Engineer(String name, int age, String designation, double hourlyRate, int hoursWorked) {
        super(name, age, designation);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Calculate salary
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    // Display details
    @Override
    public void displayDetails() {
        System.out.println("Engineer Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + calculateSalary());
    }
}
