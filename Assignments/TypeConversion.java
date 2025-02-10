//11. Type Conversion
//Question: Write a Java program to convert an integer to a double and a double to an integer.

class TypeConversion  
{
	public static void main(String[] args) 
	{
		int a =50;
		double d=0.0;
		d=a;
		System.out.println("After Integer to Double Conversion:"+d);
		d=55.5;
		a=(int)d;
		System.out.println("After Double to Integer Conversion:"+a);
	}
}
