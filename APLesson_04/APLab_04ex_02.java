import java.util.Scanner;

public class APLab_04ex_02
{
	
	public static void main(String[]args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		APLab_04ex_02 form = new APLab_04ex_02();
	
		
		System.out.println("Enter your first name:");
		String first = keyboard.next();
		System.out.println("Enter your last name:");
		String last = keyboard.next();
	
		System.out.println("Enter your title:");
		String title = keyboard.next();
		String shayla = keyboard.nextLine();
		System.out.println("Enter the school site:");
		String school = keyboard.nextLine();

		
		System.out.println("Enter the school year:");
		String year = keyboard.nextLine();
		System.out.println("Are you a freshman, sophomore, junior, or senior?");
		String grade = keyboard.next();
	
				
		System.out.println("****************************************************");
		form.format(school, year);
		form.format(first, last);
		form.format(title, grade);
		System.out.println("\n****************************************************");
		
	}
	public void format(String column, String column2)
	{
		System.out.printf("*%24s  %24s\n", column, column2);
	}
		
}