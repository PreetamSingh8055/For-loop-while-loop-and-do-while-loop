import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number:");
		int num=obj.nextInt();
        int orignalnum=num;

		int digit=0;
	
        int reversenum=0;
		do	
        {	
            digit=num%10;
            reversenum=digit+(reversenum*10);
            num=num/10;	
        }
        while(num!=0);

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
