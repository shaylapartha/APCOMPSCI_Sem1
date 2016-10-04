import java.util.Scanner;
public class Average2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		int num1 = kb.nextInt();
		System.out.println("Enter another integer:");
		int num2 = kb.nextInt();
		System.out.println("Aaand, enter another integer:");
		int num3 = kb.nextInt();
		print(calcAvg(num1, num2, num3));
	}
	public static int calcAvg(int num1, int num2, int num3)
	{
		return (num1 + num2 + num3)/3;
	}
	public static void print(double average)
	{
		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
	}
}