//2. Constructor
//Question: Create a class Student with a parameterized constructor that initializes name and rollNumber. Create an object and display the student's details.

class Student
{
	String name;
	String rollNumber;

	Student(String name, String rollNumber)
	{
		this.name = name;
		this.rollNumber = rollNumber;
	}
	public static void main(String[] args) 
	{
		Student stu1 = new Student("Pranav","5A2");
		System.out.println("Student details are:");
		System.out.println("Name: "+stu1.name);
		System.out.println("RollNumber: "+stu1.rollNumber);
	}
}
