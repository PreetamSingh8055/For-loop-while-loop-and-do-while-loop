import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num=obj.nextInt();

		int digit=0;
		int reversenum=0;
			
			while(num!=0)
			{
				
				digit=num%10;
				reversenum=digit+(reversenum*10);
				num=num/10;
				
			}
			System.out.print(reversenum);		
			
			obj.close();					
	}
}

