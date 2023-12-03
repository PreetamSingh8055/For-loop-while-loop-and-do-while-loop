import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
	    Scanner obj=new Scanner(System.in);

	    System.out.print("Enter the number :");
	    int n=obj.nextInt();

        int a=0;
        int b=1;
        int temp;

        int i=3;
        System.out.print( a + " " + b + " " );
        do
        {
            temp=b;
            b=a+b;
            System.out.print(b + " " );
            a=temp;
            
            i++;
        }
        while(i<=n);
	
	    obj.close();
    }

}
