import java.util.Scanner;
public class Average
{
	static int num1, num2, num3;
	static double average;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter an integer:");
		num1 = kb.nextInt();
		System.out.println("Enter another integer:");
		num2 = kb.nextInt();
		System.out.println("Aaand, enter another integer:");
		num3 = kb.nextInt();
		
		average();
		print();
	}
	public static void average()
	{
		average = ((num1 + num2 + num3)/3);
		
	}
	public static void print()
	{

		System.out.println("The average of " + num1 + ", " + num2 + ", and " + num3 + " is " + average);
	}
}