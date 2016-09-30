import java.util.Scanner;
public class Cube
{
	static int side;
	static int sa;
	
	public static void main(String[]args)
	{
		
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of your cube");
		side = kb.nextInt();
		
		calcSurf();
		print();
	}
	public static void calcSurf()
	{
		sa = ((side*side)*6);
		
	}
	public static void print()
	{

		System.out.println("The surface area of a cube whose sides are " + side + " in length is " + sa);
	}
}