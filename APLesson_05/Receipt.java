import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter item 1: ");
		String item1 = kb.next();
		System.out.println("Enter the price of item 1: ");
		double price1 = kb.nextDouble();
		System.out.println("Enter item 2: ");
		String item2 = kb.next();
		System.out.println("Enter the price of item 2: ");
		double price2 = kb.nextDouble();
		System.out.println("Enter item 3: ");
		String item3 = kb.next();
		System.out.println("Enter the price of item 3: ");
		double price3 = kb.nextDouble();
		System.out.println("Enter item 4: ");
		String item4 = kb.next();
		System.out.println("Enter the price of item 4: ");
		double price4 = kb.nextDouble();
		
		double subtotal = (price1 + price2 + price3 + price4);
		double discount = calcDisc(subtotal);
		double tax = subtotal * 0.08;
		double total = subtotal - discount + tax;

		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		System.out.println("\n");
		format(item1, price1);
		format(item2, price2);
		format(item3, price3);
		format(item4, price4);
		System.out.println("\n");
		
		format("Subtotal: ", subtotal);
		format("Discount: ", discount);
		format("Tax: ", tax);
		format("Total: ", total);
		System.out.println("\n");
		System.out.println("_________________________________");
		System.out.println("Thank you for shopping!");
		
	}
	
	public static double calcDisc(double sub)
	{
		if (sub >= 2000)
			return sub *0.15;
		return 0.0;
	}
	
	public static void format(String item, double price) 
	{
		System.out.printf("\n*%15s.........  %15.2f", item, price);
	}
}