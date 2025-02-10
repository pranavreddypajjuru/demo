//8. String
//Question: Write a Java program to count the number of vowels in a given string.

class CountOfVowels
{
	String s = "Elephant"; 
	public static void main(String[] args) 
	{ 
		CountOfVowels cnt = new CountOfVowels();
		char[] ch = cnt.s.toLowerCase().toCharArray();
		int count=0;
		for(int i=0; i<ch.length;i++)
		{
			if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				count++;
			}
		}
		System.out.println("Total number of vowels are: "+count);
	}
}
