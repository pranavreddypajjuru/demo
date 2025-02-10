//9. Scanner (User Input)
//	Question: Write a Java program that takes two numbers as input from the user and prints their sum.
import java.util.Scanner;
class ScannerClass
{
	public static void main(String[] args) 
	{
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of Integer type:");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Sum is:"+(a+b));
	}
}
