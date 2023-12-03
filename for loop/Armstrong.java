   
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
            
            if(n<100 || n>999)
            {
                System.out.println("please enter only three digits");
            }
            else
            {
                for(int i=n;i>0;i/=10)

                 {
                    int digit=i%10;
                    sum+=digit*digit*digit;
                 }
           }   
        
    
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
    
    