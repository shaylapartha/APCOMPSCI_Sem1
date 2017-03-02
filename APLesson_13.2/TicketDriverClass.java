import java.lang.Math.*;
import java.util.ArrayList;
public class TicketDriverClass
{
	private int daysLeft;
	
	public static void main(String[]args)
	{
		WalkupClass walk = new WalkupClass(5);
		System.out.println(walk);
		
		AdvanceClass adv = new AdvanceClass(10);
		System.out.println(adv);
		
		StudentAdvanceClass stadv = new StudentAdvanceClass(15);
		System.out.println(stadv);
		
		
	}
}