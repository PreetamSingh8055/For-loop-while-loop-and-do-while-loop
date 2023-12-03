import java.util.*;
public class fibonacciSeries
{
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("enter the number :");
        int n=obj.nextInt();
        int a=0;
        int b=1;
        int temp;
        System.out.print(a +  " " + b + " ") ;
    
        for(int i=3;i<=n;i++)
        {
            temp=b;
            b=a+b;
            a=temp;
             
            System.out.print( b + " " );
            
        }
        obj.close();
    }

}