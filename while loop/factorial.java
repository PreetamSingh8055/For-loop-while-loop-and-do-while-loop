import java.util.*;
public class factorial
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int n=obj.nextInt();
			int f=1;
			int i=1;
			while(i<=n)
			{
				f=f*i;	
				i++;	
			}
			System.out.println(" factorial of " + n + " =" + f);
			
			obj.close();					
	}
}
