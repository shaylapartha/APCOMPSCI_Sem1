import java.util.Scanner;
public class SubwooferBoxes
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		SubwooferBoxes volume = new SubwooferBoxes();
		
		System.out.println("Enter the height of the box to the nearst whole inch:");
		int Height = keyboard.nextInt();
		System.out.println("Enter the length of the box to the nearest whole inch:");
		int Length = keyboard.nextInt();
		System.out.println("Enter the width of the box to the nearest whole inch:");
		int Width = keyboard.nextInt();
		double volBox = volume.calcVolbox(Height, Length, Width);
		System.out.printf("The volume of the box is " + volBox + " cubic feet");
	}
	
	public double calcVolbox(int Height, int Length, int Width)
	{
		return ((Height*Length*Width)*0.00057870);
	}
}