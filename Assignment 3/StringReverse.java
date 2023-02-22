import java.util.*;

class StringReverse
{
	static void reverse(char ar[],int size)
	{
		char temp[] = new char[size];
		int count =0;
		
		for(int i=size-1,j=0 ; i>=0 && j<size ; i--,j++)
		{
			temp[j] = ar[i];
		}
		
		System.out.println("Reversed String is : ");
		for(int i=0 ; i<size ; i++)
		{
			System.out.print(temp[i]);
		}
	}
	
	public static void main(String[] args)
	{
		String str = "Hello";
		int size = str.length();
		char arr[] = new char[size];
		
		for(int i=0 ; i<size ; i++)
		{
			arr[i] = str.charAt(i);
		}
		
		reverse(arr,size);
	}
}