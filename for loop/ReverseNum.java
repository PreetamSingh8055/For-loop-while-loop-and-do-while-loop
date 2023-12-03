import java.util.*;
public class ReverseNum
 {   

        public static void main(String[] args)
        {
             Scanner obj=new Scanner(System.in);

            System.out.print("Enter the number :");
             int num=obj.nextInt();
        
            int reversenum=0;
        
            for( int i=num;i>0;i/=10)
             {
                 int digit=i%10;
                 reversenum=digit+(reversenum*10);
             }
        
             System.out.println(reversenum);
    
        
            obj.close();
        }

    }


