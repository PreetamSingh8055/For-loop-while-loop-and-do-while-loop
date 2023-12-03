import java.util.*;

public class SumOfDigits {
 

        public static void main(String[] args)
        {
             Scanner obj=new Scanner(System.in);

            System.out.print("Enter the number :");
             int num=obj.nextInt();
        
            int sum=0;
        
            for( int i=num;i>0;i/=10)
             {
                 int digit=i%10;
                 sum=sum+digit;
             }
        
             System.out.println(sum);
    
        
            obj.close();
        }

    }




