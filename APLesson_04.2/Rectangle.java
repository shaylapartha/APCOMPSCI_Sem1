import java.util.Scanner;
public class Rectangle
{
	static int l, w;
	static int perimeter;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the rectangle:");
		l = kb.nextInt();
		System.out.println("Enter the width of the rectangle:");
		w = kb.nextInt();
		
		calcPerim();
		print();
	}
	public static void calcPerim()
	{
		perimeter = ((2*l)+(2*w));
		
	}
	public static void print()
	{

		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
}