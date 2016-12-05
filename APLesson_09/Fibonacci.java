import java.util.Scanner;
public class Fibonacci
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Please enter your starting number: ");
		int startnum = kb.nextInt();
		System.out.println("Please enter your sequence size: ");
		int size = kb.nextInt();
		
		int[] seq = new int[size];
		
		for(int i = 0; i < seq.length; i++)
		{
			if(i==0 || i==1)
			{
				seq[i] = startnum;
			}
			else
			{
				seq[i] = seq[i-1] + seq[i-2];
			}
			
			System.out.println(seq[i] + " ");
		}
		
	}
}