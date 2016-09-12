import java.util.Scanner;

public class BMI
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter your weight in pounds");
		double weight = keyboard.nextDouble();
		System.out.println("Enter your height in inches");
		double height = keyboard.nextDouble();
		double bmi = ((weight * 703)/(height * height));
		System.out.println("Your BMI is " + bmi);
		
	}
}