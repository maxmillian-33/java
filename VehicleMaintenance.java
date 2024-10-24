import java.util.*;

interface Vehicle {
    void start();
    void stop();
}

interface Maintenance {
    void scheduleMaintenance();
}

class Car implements Vehicle, Maintenance {
    String model;
    int year;
    boolean isRunning;

    public void start() {
        isRunning = true;
        System.out.println("The car is starting.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }

    public void scheduleMaintenance() {
        System.out.println("Maintenance scheduled for the car.");
    }

    public void displayCarInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Is Running: " + isRunning);
    }
}

public class VehicleMaintenance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Car car = new Car();

        System.out.print("Enter car model: ");
        car.model = s.nextLine();
        System.out.print("Enter car year: ");
        car.year = s.nextInt();

        car.isRunning = false;

        car.start();
        car.displayCarInfo();

        car.scheduleMaintenance();

        car.stop();
        car.displayCarInfo();
    }
}
