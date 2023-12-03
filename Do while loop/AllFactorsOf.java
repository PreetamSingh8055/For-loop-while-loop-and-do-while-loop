import java.util.*;
public class AllFactorsOf
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int n=obj.nextInt();
			int i=1;
			do
			{
				if(n%i==0)
				{
					System.out.print(i + " ");	
				}
				i++;	
			}
			while(i<=n);
			
	obj.close();						
	}
}
