import java.util.ArrayList;
import java.util.List;

public class StudentGrades {

    // Hardcoded student data
    static class Student {
        String name;
        List<Integer> grades;

        Student(String name, List<Integer> grades) {
            this.name = name;
            this.grades = grades;
        }

        // Calculate the average grade of the student
        double calculateAverage() {
            int total = 0;
            for (int grade : grades) {
                total += grade;
            }
            return (double) total / grades.size();
        }

        // Check if the student has passed based on the average grade
        String checkPassStatus(double averageGrade, int passingThreshold) {
            return averageGrade >= passingThreshold ? "Passed" : "Failed";
        }
    }

    public static void main(String[] args) {

        // Hardcoded list of students and their grades
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", List.of(88, 92, 79, 85)));
        students.add(new Student("Bob", List.of(72, 75, 68, 70)));
        students.add(new Student("Charlie", List.of(95, 98, 100, 94)));
        students.add(new Student("Diana", List.of(60, 65, 70, 68)));
        students.add(new Student("Eve", List.of(85, 90, 88, 92)));

        // Predefined passing grade threshold
        int passingThreshold = 75;

        // Iterate through the list of students and calculate their average grade and status
        for (Student student : students) {
            double average = student.calculateAverage();
            String status = student.checkPassStatus(average, passingThreshold);

            // Print out the student's details
            System.out.println("Student: " + student.name);
            System.out.println("Grades: " + student.grades);
            System.out.println("Average Grade: " + String.format("%.2f", average));
            System.out.println("Status: " + status);
            System.out.println("------------------------------");
        }
    }
}
