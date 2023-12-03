import java.util.*;
public class Table
{
	public static void main(String[] args)
	{
		Scanner obj=new Scanner(System.in);
	
		System.out.println("Enter the number:");
		int table=obj.nextInt();
			int i=1;
			do
			{
				int Ntable=table*i;	
				System.out.println(table + " * " + i + " =" + Ntable);
				i++;
			}
			while(i<=10);
	obj.close();					
	}
}
