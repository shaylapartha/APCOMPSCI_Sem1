import java.util.Scanner;
public class MPHRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Distance: ");
		int d = kb.nextInt();
		System.out.print("Hours: ");
		int h = kb.nextInt();
		System.out.print("Minutes: ");
		int m = kb.nextInt();
		
		MilesPerHour object = new MilesPerHour(d, h, m);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + "hours = " + object.getMPH() + " mph.");

		object.setValues(7, 4, 0);
		
		System.out.println(object.getDistance() + " miles in " + object.getHours() + " hours = " + object.getMPH() + " mph.");
		
	}
}