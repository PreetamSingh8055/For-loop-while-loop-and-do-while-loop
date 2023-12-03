import java.util.*;
public class SumOfTillNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		
		int sum=0;
			for(int i=1;i<=n;i++)
			{
				sum=sum+i;	
			}
			System.out.print(sum);
			obj.close();					
	}
}
