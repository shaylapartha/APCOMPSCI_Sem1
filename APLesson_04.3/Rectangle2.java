import java.util.Scanner;
public class Rectangle2
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Enter the length of the rectangle:");
		int l = kb.nextInt();
		System.out.println("Enter the width of the rectangle:");
		int w = kb.nextInt();
		print(calcPerim(l,w));
		
	}
	public static int calcPerim(int l, int w)
	{
		return 2*(l+w);
	}
	public static void print(int perimeter)
	{
		System.out.println("The perimeter of your rectangle is " + perimeter);
	}
	
}