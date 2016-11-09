import java.util.Scanner;
public class CountByX
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the integer we will count up to: ");
		int endnum = kb.nextInt();
		System.out.println("Enter the integer we will start with: ");
		int startnum = kb.nextInt();
		
		for(int i = startnum; i<= endnum; i+=2)
		{
			System.out.print(i + " ");
		}
	}
}