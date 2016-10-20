import java.util.Scanner;
public class AdventureGame
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Would you like to..." +
							"\n 1. Answer a question about me" +
							"\n 2. Answer a question about my sister");
		int mOrS = kb.nextInt();
		if(mOrS == 1)
		{
			System.out.println("Do you want to answer a question about my age or my school?");
			String meAnswer = kb.next();
			if(meAnswer.equals("age"))
			{
				System.out.println("How old am I?");
				int ageAnswer = kb.nextInt();
				if(ageAnswer == 17)
				{
					System.out.println("Correct!");
				}
				else
				{
					System.out.println("Sorry, you're wrong.");
				}
			}
			else
			{
				System.out.println("What school do I go to?");
				kb.nextLine();
				String schoolAnswer = kb.nextLine();
				if(schoolAnswer.equals("Torrey Pines High School"))
				{
					System.out.println("Correct!");
				}
				else
				{
					System.out.println("Sorry, you're wrong.");
				}
			}
		}
		else
		{
			System.out.println("Do you want to answer a question about her college or her city?");
			String sAnswer = kb.next();
			if(sAnswer.equals("college"))
			{
				System.out.println("What college did my sister attend?");
				kb.nextLine();
				String collegeAnswer = kb.nextLine();
				if(collegeAnswer.equals("University of Pennsylvania"))
				{	
					System.out.println("Correct!");
				}
				else
				{	
					System.out.println("Sorry, you're wrong.");
				}
			}
			else
			{
				System.out.println("What city does she live in?");
				kb.nextLine();
				String cityAnswer = kb.nextLine();
				if(cityAnswer.equals("Chicago"))
				{
					System.out.println("Correct!");
				}
				else
				{
					System.out.println("Sorry, you're wrong.");
				}
			}
		}
	}
}