import java.util.Scanner;
public class Receipt
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		Receipt form = new Receipt();
		
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

		System.out.println("<<<<<<<<<<< Receipt >>>>>>>>>>>");
		System.out.println("\n");
		form.format(item1, price1);
		form.format(item2, price2);
		form.format(item3, price3);
		form.format(item4, price4);
		
		
	}
	
	public void format(String item, double price) 
	{
		System.out.printf("\n*%15s.........  %15.2f", item, price);
	}
}