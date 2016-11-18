import java.util.Scanner;
public class Lucky7s
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = kb.nextInt();
		
		System.out.println(luck(number));
	}
	public static int luck(int number)
	{
		int lastDigit = number % 10;
		if (number > 0)
		{
			if (lastDigit == 7)
				return 1 + luck(number/=10);
			else
				return 0 + luck(number/=10);
		}
		else
			return 0;
	
	
	}
}