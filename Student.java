package coding;

import java.util.Scanner;

public class Student {

    // Static variable (shared among all instances)
    private static int studentCount = 0;

    // Instance variables (unique to each instance)
    private String name;
    private int age;
    private double grade;

    // Constructor
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;

        // Increment static variable
        studentCount++;
    }

    // Static method to get the student count
    public static int getStudentCount() {
        return studentCount;
    }

    // Instance method to display student details
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println();
    }

    // Instance method to check if the student passed (e.g., grade >= 50)
    public boolean hasPassed() {
        return grade >= 50.0;
    }

    // Main method
    public static void main(String[] args) {
        // Hard-Coded Data
        Student student1 = new Student("Alice", 20, 85.5);
        Student student2 = new Student("Bob", 22, 45.0);

        // Display hard-coded student details
        System.out.println("Hard-Coded Students:");
        student1.displayDetails();
        student2.displayDetails();

        // Soft-Coded Data (User Input)
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students to add:");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] students = new Student[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();

            System.out.print("Grade: ");
            double grade = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            // Create a new student object with user input
            students[i] = new Student(name, age, grade);
        }

        // Display soft-coded student details
        System.out.println("\nSoft-Coded Students:");
        for (Student student : students) {
            student.displayDetails();
        }

        // Display total number of students
        System.out.println("Total Students: " + Student.getStudentCount());

        // Close the scanner
        scanner.close();
    }
}
