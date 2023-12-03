import java.util.*;
public class prime
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		
		if(n<=1)
		{
			System.out.println(n + "is not a prime number");	
		}
		else
		{
			
				boolean isprime=true;
				for(int i=2;i<=n/2;i++)
				{
					if(n%i==0)
					{
						isprime=false;
						break;
					}
					
				}
				if(isprime)
					{
						System.out.print( n + " is a prime number");
					}
				    else
					{
						System.out.print( n + " is not a prime number");
					}
				
		}
			
		obj.close();				
	}
}
