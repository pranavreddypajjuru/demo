//7. Array
//Question: Write a Java program to find the largest number in an array of integers.
import java.util.Arrays;
class LargestNumber
{
	int[] numArray = {5,6,10,1,8};
	public static void main(String[] args) 
	{
		LargestNumber lNum = new LargestNumber();
		Arrays.sort(lNum.numArray);
		System.out.println("Largest Number of the Array is: "+lNum.numArray[lNum.numArray.length-1]);
	}
}
