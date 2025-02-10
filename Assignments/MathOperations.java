//14. Polymorphism 
//Question: Create a class MathOperations with multiple add() methods that take different numbers of arguments (e.g., two integers, three integers, two doubles). Demonstrate method overloading by calling these methods in the main method.

class MathOperations
{
	int sum(int a,int b)
	{
		return (a+b);
	}

	int sum(int a,int b, int c)
	{
		return (a+b+c);
	}

	double sum(double a,double b)
	{
		return (a+b);
	}
	public static void main(String[] args) 
	{
		MathOperations mOp = new MathOperations();
		System.out.println("Calling sum with 2 int parameters "+mOp.sum(4,65));
		System.out.println("Calling sum with 3 int parameters "+mOp.sum(54,165,1545));
		System.out.println("Calling sum with 2 double parameters "+mOp.sum(68.25,68.25));

	}
}
