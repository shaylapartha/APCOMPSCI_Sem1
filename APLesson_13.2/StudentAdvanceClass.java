import java.lang.Math.*;
import java.util.ArrayList;
public class StudentAdvanceClass extends AdvanceClass
{
	private int daysLeft;
	
	public StudentAdvanceClass()
	{
		super();
		
		daysLeft = 0;
	}
	
	public StudentAdvanceClass(int dL)
	{
		super();
		
		daysLeft = dL;
	}
	
	public double getPrice()
	{
		return super.getPrice()/2;
	}
	
	public String toString()
	{
		return super.toString() + "\n(STUDENT ID REQUIRED)";
	}
}