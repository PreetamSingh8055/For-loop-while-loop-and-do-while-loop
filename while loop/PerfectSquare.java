// this program check given number is perfect square or not
import java.util.*;
public class PerfectSquare{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number :");
        int n=obj.nextInt();
        int root=0;
        if(n>=1)
        {
            for(int i=2;i*i<=n;i++)
             {
                root=i*i;
            }
        }
        if(n==root)
        {
        System.out.println(n + " is a perfect square ");

        }
        else
        {
             System.out.println(n + " is not a perfect square");
                
        }
    obj.close();
    
    }
}