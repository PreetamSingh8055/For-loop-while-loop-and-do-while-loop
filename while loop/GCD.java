
// this program find GCD (greatest common diviser) of two numbers

import java.util.*;
public class GCD {

    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a=obj.nextInt();
        
         System.out.println("Enter the number: ");
        int b=obj.nextInt();
        
        int num1=a;
        int num2=b;

    

    
        if(a<b)
        {
            System.out.println("please enter the value of a bigger then b");
        }

        else
        {

            while(b!=0)
            {
                 int temp=b;
                 b=a%b;
                 a=temp;
            }
        }
        
            System.out.println(" The GCD of " + num1 + " and " + num2 + " is the last non-zero remainder, which is " + a);
      
            obj.close();
    }
}
