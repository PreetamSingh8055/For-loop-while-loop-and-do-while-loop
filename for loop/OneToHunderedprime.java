import java.util.*;
public class OneToHunderedprime
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
			
			for(int j=2;j<=n;j++)
			{
				boolean isprime=true;
				for(int i=2;i<=j/2;i++)
				{
					if(j%i==0)
					{
						isprime=false;
						break;
					}
					
				}
				if(isprime)
					{
						System.out.print( j+ " ");
					}
				
			}
			
			
		}
		obj.close();			
	}
}
