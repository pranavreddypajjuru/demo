//3. Variable
//Question: Create a class Employee with instance variables name, id, and salary. Assign values to these variables and print them in the main method.
class  Employee
{
	String name="pranav";
	int id=1;
	float salary=400.25f;

	public static void main(String[] args) 
	{
		Employee emp = new Employee();
		System.out.println("Employee Name:"+emp.name);
		System.out.println("Employee Id:"+emp.id);
		System.out.println("Employee Salary:"+emp.salary);
	}
}
