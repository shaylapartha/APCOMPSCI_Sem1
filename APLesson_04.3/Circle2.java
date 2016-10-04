import java.util.Scanner;
public class Circle2
{
	static int r;
	static double area;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle");
		r = kb.nextInt();
		
		print(calcArea(r));
	}
	public static double calcArea(int r)
	{
		return ((r*r)*3.14);
		
	}
	public static void print(double area)
	{

		System.out.println("The area of a circle with radius " + r + " is " + area);
	}
}