// this program find nth number of geometric series
import java.util.*;
public class GeometricSeries {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the nth number which you want print ");
        int n=obj.nextInt();
        int i=1;
        int a=3;
        while(i<=n)
        {
           a+=i;
           System.out.print(a + " " ); 
           i++;
        }
    obj.close();
    }
}
