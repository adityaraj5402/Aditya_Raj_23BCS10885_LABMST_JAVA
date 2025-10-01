import java.util.Scanner;

abstract class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    abstract void displayDetails();
}
class Student extends Person {
    int rollNumber;

    Student(String name, int age, int rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }

    @Override
    void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll Number: " + rollNumber);
    }
}
class Teacher extends Person {
    int subjectCode;

    Teacher(String name, int age, int subjectCode) {
        super(name, age);
        this.subjectCode = subjectCode;
    }

    @Override
    void displayDetails() {
        System.out.println("Teacher Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject Code: " + subjectCode);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int type = sc.nextInt();
        String name = sc.next();
        int age = sc.nextInt();

        if (age <= 0) {
            System.out.println("Error: Age must be a positive number.");
            return;
        }

        Person p;

        if (type == 1) { // Student
            int rollNumber = sc.nextInt();
            p = new Student(name, age, rollNumber);
        } else if (type == 2) { // Teacher
            int subjectCode = sc.nextInt();
            p = new Teacher(name, age, subjectCode);
        } else {
            System.out.println("Error: Invalid person type.");
            return;
        }
        p.displayDetails();
        sc.close();
    }
}
