import java.util.Scanner;
public class DistanceRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("x1: ");
		int x1 = kb.nextInt();
		System.out.print("y1: ");
		int y1 = kb.nextInt();
		System.out.print("x2: ");
		int x2 = kb.nextInt();
		System.out.print("y2: ");
		int y2 = kb.nextInt();
		
		Distance2Points object = new Distance2Points(x1, y1, x2, y2);
		
		System.out.println("Distance = " + object.getDist());

		object.setValues(5, 3, 2, 1);
		
		System.out.println("Distance = " + object.getDist());
		
	}
}