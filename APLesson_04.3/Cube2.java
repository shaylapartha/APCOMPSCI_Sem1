import java.util.Scanner;
public class Cube2
{
	static double side; 
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the length of the side of your cube");
		side = kb.nextDouble();
		
		print(calcSurf(side));
	public static double calcSurf()
	{
		return (side*side)*6;
	}
	public static void print(double sa)
	{
		System.out.println("The surface area of a cube whose sides are " + side + " in length is " + sa);
	}
}