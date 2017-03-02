import java.lang.Math.*;
import java.util.ArrayList;
public class WalkupClass extends TicketSuperclass
{
	private int daysLeft;
	
	public WalkupClass()
	{
		super();
		
		daysLeft = 0;
	}
	
	public WalkupClass(int dL)
	{
		super();
		
		daysLeft = dL;
	}
	
	public double getPrice()
	{
		return 50.00;
	}
}