import java.util.Scanner;
public class ReverseNumber
{
	static int number;
	static int rev = 0;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter an integer:");
		number = kb.nextInt();
		getReverse();
		System.out.println(number + " reversed is " + rev);
	}
	public static void getReverse()
	{
		int num = number;
		while(num > 0)
		{
			rev*=10;
			int lastDigit = num % 10;
			rev += lastDigit;
			num/=10;
		}
	}
}