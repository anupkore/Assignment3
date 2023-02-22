import java.util.*;
class Prime
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count = 0;
		
		if(num == 1)
			System.out.println("1 is neither prime nor composite");
		
		else
		{
			for(int i=1 ; i <= num ;i++)
			{
				if(i==1 || i==num)
				continue;
				
				else
				{
					if(num % i == 0)
					count++;
					if(count>0)
						break;
				
				}
			}
			
			if(count == 0)
			System.out.println("The number is prime");
			else
			System.out.println("The number is Composite");
		}
	}
}