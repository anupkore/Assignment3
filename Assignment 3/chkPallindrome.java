class chkPallindrome
{
	static void chk(int ar[],int size)
	{
		int temp[] = new int[size];
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
			
			else{
			System.out.println("Not Pallindrome");
			break;}
		}
		
		if(count == size)
			System.out.println("Pallindrome");
			
	}
	
	public static void main(String[] args)
	{
		int arr[]={1,2,2,1,5,1,2,2,1,7};
		int size = arr.length;
		chk(arr,size);
	}
}