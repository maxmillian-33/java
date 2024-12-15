import math.Calculator;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Enter the first number: ");
        double num1 = s.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = s.nextDouble();

        System.out.println("Choose an operation: +, -, *, /");
        char operation = s.next().charAt(0);

        double result = 0;
        if (operation == '/' && num2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        } else {
            switch (operation) {
                case '+':
                    result = calculator.add(num1, num2);
                    break;
                case '-':
                    result = calculator.subtract(num1, num2);
                    break;
                case '*':
                    result = calculator.multiply(num1, num2);
                    break;
                case '/':
                    result = calculator.divide(num1, num2);
                    break;
                default:
                    System.out.println("Invalid operation selected.");
                    return;
            }
            System.out.println("The result is: " + result);
        }
    }
}
