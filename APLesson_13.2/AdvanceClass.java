import java.lang.Math.*;
import java.util.ArrayList;
public class AdvanceClass extends TicketSuperclass
{
	private int daysLeft;
	
	public AdvanceClass()
	{
		super();
		
		daysLeft = 0;
	}
	
	public AdvanceClass(int dL)
	{
		super();
		
		daysLeft = dL;
	}
	
	public double getPrice()
	{
		if(daysLeft >= 10)
		{
			return 30.00;
		}
		else
		{
			return 40.00;
		}
	}
}