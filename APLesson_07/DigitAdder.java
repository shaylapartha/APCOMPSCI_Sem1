import java.util.Scanner;
public class DigitAdder
{
	static int sum = 0;
	static int number;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		number = kb.nextInt();
		sumDigits();
		System.out.println("The sum of the digits in " + number + " is " + sum);
	}
	public static void sumDigits()
	{
		int num = number;
		while(num > 0)
		{
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		
	}
}