import java.util.Scanner;

public class APLab_04ex_01
{
	
	public static void main(String[]args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		APLab_04ex_01 form = new APLab_04ex_01();
		
		
		System.out.println("Please enter item 1:");
		String item1 = keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price1 = keyboard.nextDouble();
	
		System.out.println("Please enter item 2:");
		String item2 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price2 = keyboard.nextDouble();
		
		System.out.println("Please enter item 3:");
		String item3 = keyboard.next();
		keyboard.nextLine();
		System.out.println("Please enter the price:");
		double price3 = keyboard.nextDouble();
		

		String item4 = "Subtotal:";
		String item5 = "Tax:";
		String item6 = "Total:";
				
		double price4 = price1 + price2 + price3;
		double price5 = 0.05*price4;
		double price6 = price4 + price5;
				
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>\n");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format(item4, price4);
		form.format(item5, price5);
		form.format(item6, price6);
		
		System.out.println("\n");
		System.out.println(" ______________________________________________________ ");
		System.out.println("* Thank you for your support *");
		
	}
	public void format(String item, double price) 
	{
		System.out.printf("\n*%22s.........  %22.2f", item, price);
	}
		
	}


