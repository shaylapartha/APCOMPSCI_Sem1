import java.util.Scanner;
public class InventoryItemsRunner
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.print("Item name?: ");
		String n = kb.next();
		System.out.print("Manufacturer?: ");
		String m = kb.next();
		System.out.print("Will you be entering category or price information? (y or n): ");
		String answer = kb.next();
		
		InventoryItems item1;
		
		if(answer.equals("n"))
		{
			item1 = new InventoryItems(n, m);
			System.out.println(item1);
		}
		
		else
		{
			System.out.println("Enter the category: ");
			String c = kb.next();
			System.out.println("Enter the price: ");
			double p = kb.nextDouble();
			item1 = new InventoryItems(n, m, c, p);
			System.out.println(item1);
		}
		
		System.out.println(item1);
		
	}
}