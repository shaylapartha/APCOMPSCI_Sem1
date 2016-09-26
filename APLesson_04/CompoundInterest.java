import java.util.Scanner;
public class CompoundInterest
{
	public static void main(String[]args)
	{
		Scanner keyboard = new Scanner(System.in);
		CompoundInterest monthly = new CompoundInterest();
		
		System.out.println("Enter the interest rate in decimal form. For example, enter 2% as 0.02.");
		double r = keyboard.nextDouble();
		System.out.println("Enter the original amount you intend to borrow, in decimal form:");
		double P = keyboard.nextDouble();
		System.out.println("Enter the number of times that the loan will be compounded per year (if monthly, enter 12):");
		int n = keyboard.nextInt();
		System.out.println("Enter how many years the life of the loan will be:");
		int t = keyboard.nextInt();
		double total = monthly.calcTotal(r, P, n, t);
		System.out.printf("Your total monthly payment is $%5.2f\n", total);
	}
	
	public double calcTotal(double r, double P, int n, int t)
	{
		return (P/12 * Math.pow((1+(r/n)), n*t));
	}
}