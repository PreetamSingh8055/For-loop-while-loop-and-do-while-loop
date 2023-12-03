   
    // this program check a number is armstrong or not

import java.util.*;
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);

        System.out.println("Enter only three digit number between 100 to 999");

        System.out.println("Enter the number: ");
        int n=obj.nextInt();
         int num=n;
        int sum=0;
        do
        {
            int digit=n%10;
            sum=sum+(digit*digit*digit);
            n=n/10;
        }
        while(n!=0);

        if(sum==num)
        {
            System.out.println(num + " is a armstrong number");
        }
        else
        {
            System.out.println(num + " is not a armstrong number");
        }
    obj.close();
    }
}

