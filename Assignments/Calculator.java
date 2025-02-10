//4. Methods
//Question: Create a class Calculator with methods for addition, subtraction, multiplication, and division of two numbers. Call these methods from the main method.

class Calculator
{
	static void addition(int a, int b)
	{
		System.out.println("Addition of two numbers:"+(a+b));
	}
	static void subtraction(int a, int b)
	{
		System.out.println("Subtraction of two numbers:"+(a-b));
	}
	static void multiplication(int a, int b)
	{
		System.out.println("Multiplication of two numbers:"+(a*b));
	}
	static void division(int a, int b)
	{
		System.out.println("Division of two numbers:"+(a/b));
	}
	public static void main(String[] args) 
	{
		System.out.println("Calling the functions");
		addition(6,3);
		subtraction(6,3);
		multiplication(6,3);
		division(6,3);
	}
}
