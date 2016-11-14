import java.util.Scanner;
public class GPA
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter your letter grade for government: ");
		String gov = kb.next();
		System.out.println("Enter your letter grade for art: ");
		String art = kb.next();
		System.out.println("Enter your letter grade for physics: ");
		String physics = kb.next();
		System.out.println("Enter your letter grade for math: ");
		String math = kb.next();
		System.out.println("Enter your letter grade for computer science: ");
		String compsci = kb.next();
		System.out.println("Enter your letter grade for environmental science: ");
		String envScience = kb.next();
		System.out.println("Enter your letter grade for english: ");
		String english = kb.next();
		
		double gPoints = calcPoints(gov) + calcPoints(art) + calcPoints(physics) + calcPoints(math) + calcPoints(compsci) + calcPoints(envScience) + calcPoints(english);
		double gpa = gPoints/7;
		System.out.printf("Your GPA is %.2f", gpa);
	}

	public static double calcPoints(String grade)
	{
		if(grade.equals("A"))
			return 4.0;
		if(grade.equals("B"))
			return 3.0;
		if(grade.equals("C"))
			return 2.0;
		if(grade.equals("D"))
			return 1.0;
		if(grade.equals("F"))
			return 0.0;
		else 
			return 0.0;
	}
}