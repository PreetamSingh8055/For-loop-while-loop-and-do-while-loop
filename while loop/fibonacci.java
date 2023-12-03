import java.util.*;
public class fibonacci
 {
     public static void main(String[] args)
     {
        Scanner obj=new Scanner(System.in);

        System.out.print("Enter the number :");
        int n=obj.nextInt();

       int a=0;
       int b=1;
       int temp;
        int i=3;

         System.out.print(a + " " + b + " ");

       while(i<=n)
       {
           temp=b;
           b=a+b;
           System.out.print(b + " ");
           a=temp;
        i++;
       }
        obj.close();
     }
}
