import java.util.*;
public class ReverseNumber
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num=obj.nextInt();
			int reversenum=0;

			int digit=0;
			do
			{
				 digit=num%10;
				reversenum=digit+(reversenum*10);
				num=num/10;
			}
			while(num!=0);

			System.out.print(reversenum);		
			
	obj.close();						
	}
}

