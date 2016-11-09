import java.util.Scanner;
public class Table
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int num = kb.nextInt();
		System.out.println("Enter the size of the table: ");
		int size = kb.nextInt();
		
		System.out.println("   i   size*i");
		
		for(int i = 1; i <= size; i++)
		{
			System.out.printf("%4d %4d\n", i, num*i);
		}
		
	}
}