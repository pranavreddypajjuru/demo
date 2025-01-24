class Learner {
    // Static variables
    static String schoolName = "Green Valley High School";
    static int totalStudents = 0;

    // Non-static variables
    private int learnerId; // Made private for encapsulation
    private String learnerName;
    private int grade;
    private double marks;

    // Static block
    static {
        System.out.println("Welcome to " + schoolName + "!");
        System.out.println("Initializing learner database...\n");
    }

    // Non-parameterized constructor
    public Learner() {
        this.learnerId = ++totalStudents; // Auto-generate learner ID
        this.learnerName = "Unknown";
        this.grade = 0;
        this.marks = 0.0;
        System.out.println("Non-parameterized constructor called.");
    }

    // Parameterized constructor
    public Learner(String learnerName, int grade, double marks) {
        this(); // Call non-parameterized constructor
        this.learnerName = learnerName; // Using this keyword
        this.grade = grade;
        this.marks = marks;
        System.out.println("Parameterized constructor called for " + learnerName + ".");
    }

    // Getter and Setter methods
    public int getLearnerId() {
        return learnerId;
    }

    public String getLearnerName() {
        return learnerName;
    }

    public void setLearnerName(String learnerName) {
        this.learnerName = learnerName;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade > 0 && grade <= 12) {
            this.grade = grade;
        } else {
            System.out.println("Invalid grade. Please enter a grade between 1 and 12.");
        }
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks. Please enter a value between 0 and 100.");
        }
    }

    // Method to display learner details
    public void displayLearnerDetails() {
        System.out.println("Learner ID: " + this.learnerId);
        System.out.println("Learner Name: " + this.learnerName);
        System.out.println("Grade: " + this.grade);
        System.out.println("Marks: " + this.marks + "\n");
    }

    // Static method to display school information
    public static void displaySchoolInfo() {
        System.out.println("School Name: " + schoolName);
        System.out.println("Total Learners Enrolled: " + totalStudents + "\n");
    }
}

public class Main {
    public static void main(String[] args) {
        // Display school information (static method)
        Learner.displaySchoolInfo();

        // Creating learner objects
        Learner learner1 = new Learner();
        Learner learner2 = new Learner("Alice", 10, 89.5);
        Learner learner3 = new Learner("Bob", 11, 92.3);

        // Display learner details
        learner1.displayLearnerDetails();
        learner2.displayLearnerDetails();
        learner3.displayLearnerDetails();

        // Using setters to update values
        System.out.println("Updating values for learner1...");
        learner1.setLearnerName("Charlie");
        learner1.setGrade(9);
        learner1.setMarks(76.5);

        // Display updated details of learner1
        learner1.displayLearnerDetails();

        // Using getters to access individual values
        System.out.println("Accessing details of learner2 using getters:");
        System.out.println("Learner Name: " + learner2.getLearnerName());
        System.out.println("Grade: " + learner2.getGrade());
        System.out.println("Marks: " + learner2.getMarks() + "\n");

        // Display updated school information
        Learner.displaySchoolInfo();
    }
}
