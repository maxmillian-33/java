import java.util.*;

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String makeSound() {
        return "Animal sound";
    }
}

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public String makeSound() {
        return "Bark";
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {      
        Scanner s = new Scanner(System.in);


        System.out.print("Enter dog's name: ");
        String name = s.nextLine();

        System.out.print("Enter dog's age: ");
        int age = s.nextInt();
        s.nextLine();

        System.out.print("Enter dog's breed: ");
        String breed = s.nextLine();

        Dog dog = new Dog(name, age, breed);

        System.out.println("Dog's Sound: " + dog.makeSound());

        System.out.println("Name: " + dog.name);
        System.out.println("Age: " + dog.age);
        System.out.println("Breed: " + dog.breed);
    }
}
