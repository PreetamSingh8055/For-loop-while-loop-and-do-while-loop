import java.util.*;
public class SumOfDigits 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num=obj.nextInt(); 

			int digit=0;

            int sum=0;
			do
			{
				 digit=num%10;
			     sum=sum+digit;
				num=num/10;
			}
			while(num!=0);

			System.out.print(sum);		
			
	obj.close();						
	}
}

