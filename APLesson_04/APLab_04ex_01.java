import java.util.Scanner;

public class APLab_04ex_01
{
	public static void main(String[]args)
	{
		Scanner = new Scanner(System.in);
		APLab_04ex_01 form = new APLab_04ex_01();
		System.out.println("<<<<<<<<<<_Receipt_>>>>>>>>>>");
		
		String item1 = "Cheese Sandwich........";
		double price1 = kb.nextDouble();
		form.format(item1, price1);
		
		String item2 = "French Fries........";
		double price2 = kb.nextDouble;
		form.format(item2, price2);
		
		String item3 = "Soda........";
		double price3 = kb.nextDouble();
		form.format(item3, price3);
	}
	
	public void format (String word, double number)
	{
		System.out.printf("\n%25s  %25.2f", word, number);
	}
}