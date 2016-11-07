import java.util.Scanner;
public class Factorial
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		
		int factorial = 1;
		int num = kb.nextInt();
		
		for(int i=1; i <= num; i++)
		{
			factorial = i * factorial;
		}
		
		System.out.println("The factorial of " + num + " is " + factorial);
		
	}
}