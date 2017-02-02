import java.util.Scanner;
public class UserClassRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("What is your first name?: ");
		String fN = kb.next();
		System.out.print("What is your last name?: ");
		String lN = kb.next();
		System.out.print("Do you want an avatar? (y or n): ");
		String answer = kb.next();
		
		UserClass user1;
		
		if(answer.equals("n"))
		{
			user1 = new UserClass(fN, lN);
			System.out.println(user1);
		}
		
		else
		{
			System.out.println("Enter your avatar: ");
			String ava = kb.next();
			user1 = new UserClass(fN, lN, ava);
			System.out.println(user1);
		}
		
		System.out.println(user1);
		
	}
}