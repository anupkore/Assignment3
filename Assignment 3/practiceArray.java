class practiceArray
{
	public static void main(String[] args)
	{
		int arr[] = {1,2,3,4,5,7,6,8,3,2,9,5,4};
		int size = arr.length;
		
		int res[] = new int[size];
		
		int product = 1;
		for(int i=0 ; i<size ;i++)
		{
			int temp = product * arr[i];
			product = temp;
		}
		
		for(int i=0 ; i<size ;i++)
		{
			res[i] = product / arr[i] ;
			System.out.print(res[i]+" ");
		}
		
		
	}
}