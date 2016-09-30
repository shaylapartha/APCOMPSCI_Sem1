import java.util.Scanner;
public class Circle
{
	static int r;
	static double area;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the radius of your circle");
		r = kb.nextInt();
		
		calcArea();
		print();
	}
	public static void calcArea()
	{
		area = ((r*r)*3.14);
		
	}
	public static void print()
	{

		System.out.println("The area of a circle with radius " + r + " is " + area);
	}
}