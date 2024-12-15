import employees.Manager;
import employees.Engineer;
import java.util.Scanner;

public class EmployeeMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Input for Manager
        System.out.println("Enter Manager Details:");
        System.out.print("Name: ");
        String managerName = s.nextLine();
        System.out.print("Age: ");
        int managerAge = s.nextInt();
        s.nextLine(); // Consume newline
        System.out.print("Base Salary: ");
        double managerBaseSalary = s.nextDouble();
        System.out.print("Bonus: ");
        double managerBonus = s.nextDouble();
        s.nextLine(); // Consume newline
        Manager manager = new Manager(managerName, managerAge, "Manager", managerBaseSalary, managerBonus);

        // Input for Engineer
        System.out.println("\nEnter Engineer Details:");
        System.out.print("Name: ");
        String engineerName = s.nextLine();
        System.out.print("Age: ");
        int engineerAge = s.nextInt();
        s.nextLine(); // Consume newline
        System.out.print("Hourly Rate: ");
        double hourlyRate = s.nextDouble();
        System.out.print("Hours Worked: ");
        int hoursWorked = s.nextInt();
        s.nextLine(); // Consume newline
        Engineer engineer = new Engineer(engineerName, engineerAge, "Engineer", hourlyRate, hoursWorked);

        // Display details
        System.out.println("\nDetails of Employees:");
        manager.displayDetails();
        System.out.println();
        engineer.displayDetails();
    }
}
