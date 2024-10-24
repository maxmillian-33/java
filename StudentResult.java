import java.util.*;

class Student {
    int rollno;
    String name;

    public void getData(Scanner s) {
        System.out.print("Enter roll number: ");
        rollno = s.nextInt();
        s.nextLine();
        System.out.print("Enter name: ");
        name = s.nextLine();
    }

    public void putData() {
        System.out.println("Roll Number: " + rollno);
        System.out.println("Name: " + name);
    }
}

class Test extends Student {
    double mark1, mark2;

    public void getMarks(Scanner s) {
        System.out.print("Enter mark 1: ");
        mark1 = s.nextDouble();
        System.out.print("Enter mark 2: ");
        mark2 = s.nextDouble();
    }

    public void putMarks() {
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
    }
}

interface Sports {
    void getSportMark(Scanner s);
    void putSportMark();
}

class Result extends Test implements Sports {
    double sportMark;
    double total;

    public void getSportMark(Scanner s) {
        System.out.print("Enter sport mark: ");
        sportMark = s.nextDouble();
    }

    public void putSportMark() {
        System.out.println("Sport Mark: " + sportMark);
    }

    public void calculateTotal() {
        total = mark1 + mark2 + sportMark;
    }

    public void putTotal() {
        System.out.println("Total Marks: " + total);
    }
}

class StudentResult {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Result result = new Result();

        result.getData(s);
        result.getMarks(s);
        result.getSportMark(s);
        result.calculateTotal();

        System.out.println("\nStudent Details:");
        result.putData();
        result.putMarks();
        result.putSportMark();
        result.putTotal();
    }
}
