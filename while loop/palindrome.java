import java.util.*;

public class palindrome 
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int num=obj.nextInt();
        int orignalnum=num;

		int digit=0;
	
        int reversenum=0;
			
			while(num!=0)
			{	
				digit=num%10;
                reversenum=digit+(reversenum*10);
				num=num/10;	
			}

            if(orignalnum==reversenum)
            {
			    System.out.print(orignalnum+" is a plindrome number");		
            }
            else
            {
                System.out.print(orignalnum+" is not a plindrome number");		
            }

			
			obj.close();					
	}
}



