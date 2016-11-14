import java.util.Scanner;
public class AverageDigits
{
	static int digits = 0;
	static int average = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		number = kb.nextInt();
		avDigits();
		
	}
	public static void avDigits()
	{
		int num = number;
		while(num > 0)
		{
			digits += 1;
			int lastDigit = num % 10;
			average += lastDigit;
			num /= 10;
		}
		
	}

}