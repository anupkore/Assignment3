class chkPallindromeString
{
	static void chk(char ar[],int size)
	{
		char temp[] = new char[size];
		int count =0;
		
		//System.out.println(size);
		for(int i=size-1,j=0 ; i>=0 && j<size ; i--,j++)
		{
			temp[j] = ar[i];
		}
		
		for(int i=0;i<size;i++)
		{
			//System.out.print(temp[i]+" ");
			
			if(ar[i] == temp[i])
			count++;
			
			else
			{
			System.out.println("Not Pallindrome");
			break;
			}
		}
		
		if(count == size)
			System.out.println("Pallindrome");
			
	}
	
	public static void main(String[] args)
	{
		String str ="malayalama";
		int size = str.length();
		
		char arr[] = new char[size];
		for(int i=0 ; i<size ;i++)
		{
			arr[i] = str.charAt(i);
		}
		
		chk(arr,size);
	}
}