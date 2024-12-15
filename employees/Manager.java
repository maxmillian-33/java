package employees;

public class Manager extends Employee {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Manager(String name, int age, String designation, double baseSalary, double bonus) {
        super(name, age, designation);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Calculate salary
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Display details
    @Override
    public void displayDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + calculateSalary());
    }
}
