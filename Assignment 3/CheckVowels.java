import java.util.*;

class CheckVowels
{
	public static void main(String[] args)
	{
		String str = "Hello My Name Is Anup";
		//System.out.println(str.charAt(0));
		int count =0 ;
		char temp[] = {'a','A','e','E','i','I','o','O','u','U'};
		for(int i=0 ; i<str.length() ;i++)
		{
			for(int j=0 ; j<temp.length ;j++)
			{
				if(str.charAt(i) == temp[j] )
				{
					count++;
				}
			}
		}
		
		System.out.println("NUmber of Vowels in given string are : "+count);
	}
}
