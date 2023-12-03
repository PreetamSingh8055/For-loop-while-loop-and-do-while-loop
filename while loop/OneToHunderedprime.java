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
			int j=2;
			int i=2;
			while(j<=n)
			{
				boolean isprime=true;
				while(i<=j/2)
				{
					if(j%i==0)
					{
						isprime=false;
						break;
					}
				i++;	
				}
				if(isprime)
					{
						System.out.print( j+ " ");
					}
			j++;
				
			}
			
			
		}	
		obj.close();		
	}
}
