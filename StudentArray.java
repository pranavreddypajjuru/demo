public class StudentArray {
    // Static variable to track total students
    private static int totalStudents = 0;

    // Instance variables
    private String name;
    private int age;
    private int studentId;
    private int[] grades; // Array to store grades

    // Constructor with array initialization
    public StudentArray(String name, int age, int studentId, int[] grades) {
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.grades = grades;
        totalStudents++; // Update static counter
    }

    // Static method
    public static int getTotalStudents() {
        return totalStudents;
    }

    // Display student details with grades array
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.print("Grades: ");
        for (int grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println("\nAverage Grade: " + calculateAverage() + "\n---------------");
    }

    // Calculate average using array
    public double calculateAverage() {
        if (grades.length == 0) return 0.0;
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    public static void main(String[] args) {
        // Array of StudentArray objects
        StudentArray[] students = {
            new StudentArray("Alice", 20, 101, new int[]{85, 90, 78}),
            new StudentArray("Bob", 21, 102, new int[]{92, 88, 95}),
            new StudentArray("Charlie", 22, 103, new int[]{76, 82, 80})
        };

        // For loop to display all students
        System.out.println("All Students:");
        for (StudentArray student : students) {
            student.displayDetails();
        }

        // While loop to find students with average > 85
        System.out.println("Students with Average > 85:");
        int index = 0;
        while (index < students.length) {
            if (students[index].calculateAverage() > 85) {
                students[index].displayDetails();
            }
            index++;
        }

        // Do-while loop to print total students
        int count = 0;
        do {
            System.out.println("Total Students: " + StudentArray.getTotalStudents());
            count++;
        } while (count < 1);
    }
}