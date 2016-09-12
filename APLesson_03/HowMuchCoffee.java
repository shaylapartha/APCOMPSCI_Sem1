import java.util.Scanner;

public class HowMuchCoffee
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Let's see how many gallons of coffee you drink in 1 year!");
		System.out.println("When you drink coffee, how many cups do you normally drink?");
		double coffee = keyboard.nextInt();
		System.out.println("How many days a week do you drink coffee?");
		int days = keyboard.nextInt();
		double week = (coffee * days);
		double year = (week * 52);
		double gallons = (year * 16);
		System.out.println("You drink " + gallons + " gallons of coffee each year. You should really consider cutting back.");
	}
}