import java.util.Scanner;

public class APLab_04ex_01
{
	
	public static void main(String[]args) 
	{
	
		Scanner keyboard = new Scanner(System.in);
		APLab_04ex_01 form = new APLab_04ex_01();
		
		System.out.println("<<<<<<<<<<<<<<__Receipt__>>>>>>>>>>>>>>\n");
		
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
		

		String line1 = "Subtotal:";
		String line2 = "Tax:";
		String line3 = "Total:";
				
		double total1 = price1 + price2 + price3;
		double total2 = 0.05*total1;
		double total3 = total1 + total2;
				
		
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		System.out.println("\n");
		form.format(line1, total1);
		form.format(line2, total2);
		form.format(line3, total3);
		
		System.out.println("\n");
		System.out.println(" ______________________________________________________ ");
		System.out.println("* Thank you for your support *");
		
	}
	public void format(String item, double price) 
	{
		System.out.printf("\n*%22s.........  %22.2f", item, price);
	}
	public void formatting(String line, double total) 
	{
		System.out.printf("\n*%7s  %7.2f", line, total);
		
	}
}

