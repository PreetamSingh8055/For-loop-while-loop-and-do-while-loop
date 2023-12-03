import java.util.*;
public class plindrome {
public static void main(String[] args)
{
	Scanner obj=new Scanner(System.in);

	System.out.print("Enter the number :");
	int num=obj.nextInt();
    

    int reversenum=0;
    int orignalnum=num;
     for( int i=num;i>0;i/=10)
     {
        int digit=i%10;
        reversenum=digit+(reversenum*10);
     }
	if(orignalnum==reversenum)
    {
        System.out.println(orignalnum + " is a palindrome number");
    }
    else
    {
        System.out.println(orignalnum + " is not a plindrome number");
    }
	
    obj.close();
}

}
