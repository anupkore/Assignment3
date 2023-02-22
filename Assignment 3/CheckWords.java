import java.util.*;

class CheckWords
{
	public static void main(String[] args)
	{
		String str = "Hello My Name Is Anup";
		//System.out.println(str.charAt(0));
		int count =0 ;
		char temp = (char)' ';
		for(int i=0 ; i<str.length() ;i++)
		{
			if(str.charAt(i) == temp)
			{
				count++;
			}
		}
		
		int num = count + 1;
		System.out.println("NUmber of words in given string are : "+num);
	}
}
