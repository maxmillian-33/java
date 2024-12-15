import java.util.*;

class Vehicle {
    public void start() {
        System.out.println("Starting vehicle");
    }
}

class Car extends Vehicle {
    public void start() {
        System.out.println("Starting car");
    }
}

class Truck extends Vehicle {
    public void start() {
        System.out.println("Starting truck");
    }
}

public class VehicleType {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("How many vehicles would you like to add? ");
        int numVehicles = s.nextInt();
        s.nextLine();

        Vehicle[] vehicles = new Vehicle[numVehicles];

        for (int i = 0; i < numVehicles; i++) {
            Vehicle vehicle = null;
            String type;

            while (true) {
                System.out.print("Enter vehicle type (car/truck): ");
                type = s.nextLine().toLowerCase();

                if (type.equals("car")) {
                    vehicle = new Car();
                    break;
                } else if (type.equals("truck")) {
                    vehicle = new Truck();
                    break;
                } else {
                    System.out.println("Invalid vehicle type! Please enter 'car' or 'truck'.");
                }
            }
            vehicles[i] = vehicle;
        }
        System.out.println("\nStarting all vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }
}
