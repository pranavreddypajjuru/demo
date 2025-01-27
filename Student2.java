public class Student2 {
    // Static variable (shared across all Student2 objects)
    private static int totalStudents = 0;

    // Non-static variables
    private String name;
    private int age;
    private int studentId;

    // Constructor
    public Student2(String name, int age, int studentId) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        totalStudents++; // Update static counter
    }

    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Non-static method
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Main method
    public static void main(String[] args) {
        // Create Student2 objects
        Student2 s1 = new Student2("Alice", 20, 101);
        Student2 s2 = new Student2("Bob", 21, 102);
        Student2 s3 = new Student2("Charlie", 22, 103);

        // For loop to display all students
        System.out.println("All Students:");
        Student2[] students = {s1, s2, s3};
        for (int i = 0; i < students.length; i++) {
            students[i].displayDetails();
            System.out.println("---------------");
        }

        // While loop to search by ID
        int targetId = 102;
        boolean found = false;
        int index = 0;
        while (index < students.length) {
            if (students[index].studentId == targetId) {
                System.out.println("\nFound student with ID " + targetId + ":");
                students[index].displayDetails();
                found = true;
                break;
            }
            index++;
        }
        if (!found) {
            System.out.println("Student not found!");
        }

        // Do-while loop to print total students
        int count = 0;
        do {
            System.out.println("\nTotal students created: " + Student2.getTotalStudents());
            count++;
        } while (count < 1); // Runs at least once

        // Static variable access
        System.out.println("\nStatic variable value (totalStudents): " + Student2.totalStudents);
    }
}