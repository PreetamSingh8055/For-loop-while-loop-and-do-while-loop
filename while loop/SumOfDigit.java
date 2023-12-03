import java.util.*;

public class SumOfDigit 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num=obj.nextInt();

		int digit=0;
	
        int sum=0;
			
			while(num!=0)
			{
				
				digit=num%10;
				num=num/10;
                sum=sum+digit; 
				
			}
			System.out.print(sum);		
			
			obj.close();					
	}
}

