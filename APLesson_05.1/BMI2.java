import java.util.Scanner;
public class BMI2
{
	static double  bmi, height, weight;
	static String category;
	
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Please enter your height in inches: ");
		height = kb.nextDouble();
		System.out.println("Pleae enter your weight in pounds: ");
		weight = kb.nextDouble();
		
		calcBMI();
		
		System.out.printf("Your bmi is %2.1f\n", bmi);
		System.out.println("You are " + category);
	}
	public static double calcBMI()
	{
		bmi = ((weight * 703)/(height * height));
		category = "";
		
		if (bmi < 18.5)
			category = "Underweight";
		else if (bmi <= 24.9)
			category = "Normal";
		else if (bmi <= 29.9)
			category = "Overweight";
		else if (bmi <= 34.9)
			category = "Obese";
		else if (bmi <= 39.9)
			category = "Very Obese";
		else if (bmi > 39.9)
			category = "Morbidly Obese";
		return bmi;	
		
	}
	
}