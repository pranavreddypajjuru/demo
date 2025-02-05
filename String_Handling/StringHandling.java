import java.util.*;
class StringHandling 
{
	static void m1(String s)
	{
		int len = s.length();
		System.out.println("The String length is:" + len);

		System.out.println("Traversing the String through for loop");
		for(int i=0; i<len; i++)
		{
		System.out.println(s.charAt(i));
		}

		System.out.println("Traversing the String through for-each loop");
		for(char ch: s.toCharArray())
		{
		System.out.println(ch);
		}

		//ends with
		System.out.println("Does the String ends with 'g': " +s.endsWith("g"));

		String s1 = "FirstString";
		//equals
		System.out.println("Are both the Strings same: "+s.equals(s1));

		//getBytes
		byte[] bArray = s1.getBytes();
		System.out.println("Converting a String into Array of Bytes:"+Arrays.toString(bArray));

		//remove
		s1 = s1.replace("FirstString", "");

		//isEmpty
		System.out.println("Is the s1 replaced with Empty String:" +s1.isEmpty());
	}

	static void m2(StringBuffer sb1, StringBuffer sb2)
	{
		boolean b = sb1.toString().contains("String");
		System.out.println("Does String Buffer object sb1 contain the String, 'String':"+ b);

		// Append method
		sb1 = sb1.append(sb2);
		System.out.println("Appending the String:"+sb1);

		// insert
		System.out.println("String Buffer sb1 String:"+sb1);
		System.out.println("Instering 'and' at 13th position:"+ sb1.insert(13,"and"));

		//replace
		int start = sb1.indexOf("Second Stringand");
		int end = start + "Second Stringand".length();
		System.out.println("Replacting the Second String with '':" +sb1.replace(start,end, ""));

		//length
		System.out.println("The String is :" +sb1 +"and the length is:" +sb1.length());
		
		//reverse
		System.out.println("The reverse of the String is:"+ sb1.reverse());

		//capacity
		System.out.println("The capacity of the String'" +sb1.reverse() +"' is:" +sb1.capacity());
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Working on String Class:");
		String s1 = "FirstString";
		m1(s1);
		System.out.println("\nWorking on String Buffer:");
		StringBuffer sb1 = new StringBuffer("Second String");
		StringBuffer sb2 = new StringBuffer("Third String");
		m2(sb1,sb2);
	}
}
