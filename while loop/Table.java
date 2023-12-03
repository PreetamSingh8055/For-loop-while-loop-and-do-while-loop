import java.util.*;
public class Table
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int table=obj.nextInt();
			int i=1;
			while(i<=10)
			{
				int Ntable=table*i;	
				System.out.println(table + " * " + i + " =" + Ntable);
				i++;
			}
			
		obj.close();					
	}
}
