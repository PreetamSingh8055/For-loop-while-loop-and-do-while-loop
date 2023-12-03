import java.util.*;
public class CountEvenorOdd
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int i=obj.nextInt();

		System.out.println("Enter the number:");
		int n=obj.nextInt();

			int Ecount=0;
			int Ocount=0;
			while(i<=n)
			{
				if(i%2==0)
				{
					Ecount++;	
				}
				else if(i%2!=0)
				{
				
				Ocount++;
				}
			i++;
			}	

			System.out.println("count of even:" + Ecount + "count of odd:" + Ocount);
			obj.close();					
	}
}
