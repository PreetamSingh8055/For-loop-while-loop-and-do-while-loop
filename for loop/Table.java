import java.util.*;
public class Table
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int table=obj.nextInt();
		
			for(int i=1;i<=10;i++)
			{
				int Ntable=table*i;	
				System.out.println(table + " * " + i + " =" + Ntable);
			}
			
			obj.close();				
	}
}
